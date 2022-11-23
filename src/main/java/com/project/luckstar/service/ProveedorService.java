package com.project.luckstar.service;

import com.project.luckstar.entity.Proveedor;
import com.project.luckstar.exception.BusinessException;
import com.project.luckstar.model.ProveedorDTO;
import com.project.luckstar.repository.ProveedorRepository;
import com.project.luckstar.util.Messages;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;


@Service
@Transactional

public class ProveedorService {

        private final ProveedorRepository proveedorRepository;
        private final Messages messages;

        public ProveedorService(ProveedorRepository proveedorRepository, Messages messages) {
            this.proveedorRepository= proveedorRepository;
            this.messages = messages;
        }

    public Proveedor guardarProveedor(Proveedor proveedor){
        return proveedorRepository.save(proveedor);
    }

    public Proveedor actualizarProveedor(Proveedor proveedor){
        if(Objects.isNull(proveedor.getId())){
            throw new BusinessException(messages.get("proveedor.id.vacio"));
        }
        consultarPorId(proveedor.getId());
        return proveedorRepository.save(proveedor);
    }
    public Proveedor consultarPorId(Long id){
        return proveedorRepository.findById(id).orElseThrow(
                () -> new BusinessException(messages.get("proveedor.id.no_encontrada")));
    }

    public void eliminarProveedor(Long id){
        consultarPorId(id);
        proveedorRepository.deleteById(id);
    }

    public List<Proveedor> buscarProveedores() {
            return proveedorRepository.findAll();
    }
}
