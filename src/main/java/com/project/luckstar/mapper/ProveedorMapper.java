package com.project.luckstar.mapper;

import com.project.luckstar.config.EntityMapper;
import com.project.luckstar.entity.Proveedor;
import com.project.luckstar.model.ProveedorDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface ProveedorMapper extends EntityMapper <ProveedorDTO, Proveedor> {
}
