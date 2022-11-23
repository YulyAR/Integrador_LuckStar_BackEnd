package com.project.luckstar.facade;

import com.project.luckstar.entity.Proveedor;
import com.project.luckstar.mapper.ProveedorMapper;
import com.project.luckstar.model.ProveedorDTO;
import com.project.luckstar.service.ProveedorService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProveedorFacade {
    private final ProveedorService proveedorService;
    private final ProveedorMapper proveedorMapper;

    public ProveedorFacade(ProveedorService proveedorService, ProveedorMapper proveedorMapper) {
        this.proveedorService = proveedorService;
        this.proveedorMapper = proveedorMapper;
    }

    public ProveedorDTO guardarProveedor(ProveedorDTO proveedor) {
        return proveedorMapper.toDto(proveedorService.guardarProveedor(proveedorMapper.toEntity(proveedor)));
    }

    public ProveedorDTO actualizarProveedor(ProveedorDTO proveedor) {
        return proveedorMapper.toDto(proveedorService.actualizarProveedor(proveedorMapper.toEntity(proveedor)));
    }

    public void eliminarProveedor(Long id) {
        proveedorService.eliminarProveedor(id);
    }

    public ProveedorDTO consultarPorId(Long id) {
        return proveedorMapper.toDto(proveedorService.consultarPorId(id));
    }

    public List<ProveedorDTO> buscarProveedores() {
        return proveedorMapper.toDto(proveedorService.buscarProveedores());
    }
}
