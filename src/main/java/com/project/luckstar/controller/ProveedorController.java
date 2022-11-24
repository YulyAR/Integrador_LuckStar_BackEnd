package com.project.luckstar.controller;

import com.project.luckstar.exception.DataNotFoundException;
import com.project.luckstar.facade.ProveedorFacade;
import com.project.luckstar.model.ProveedorDTO;
import com.project.luckstar.util.Messages;
import com.project.luckstar.util.StandardResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/proveedor")
public class ProveedorController {

    private final ProveedorFacade proveedorFacade;
    private final Messages messages;

    public ProveedorController(ProveedorFacade proveedorFacade, Messages messages) {
        this.proveedorFacade = proveedorFacade;
        this.messages = messages;
    }

    @PostMapping
    @ApiOperation(value="Permite crear un proveedor", response= ProveedorDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Se guardó el proveedor exitosamente"),
            @ApiResponse(code = 400, message = "La petición es inválida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
    public ResponseEntity<StandardResponse<ProveedorDTO>> guardarProveedor(@Valid @RequestBody ProveedorDTO proveedor){
        return ResponseEntity.ok(new StandardResponse<>(StandardResponse.StatusStandardResponse.OK, messages.get("proveedor.guardar.exito"), proveedorFacade.guardarProveedor(proveedor)));
    }

    @PutMapping
    @ApiOperation(value="Permite actualizar el proveedor", response= ProveedorDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Se actualizó el proveedor con exito"),
            @ApiResponse(code = 400, message = "La petición es inválida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
    public ResponseEntity<StandardResponse<ProveedorDTO>> actualizarProveedor(@Valid @RequestBody ProveedorDTO proveedor){
        return ResponseEntity.ok(new StandardResponse<>(StandardResponse.StatusStandardResponse.OK, messages.get("proveedor.actualizar.exito"), proveedorFacade.actualizarProveedor(proveedor)));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Permite eliminar el proveedor")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "El proveedor se eliminó exitosamente"),
            @ApiResponse(code = 400, message = "La petición es inválida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
    public ResponseEntity<StandardResponse<Void>>eliminarProveedor(@PathVariable Long id){
        try{
            proveedorFacade.eliminarProveedor(id);
            return ResponseEntity.ok(new StandardResponse<>(StandardResponse.StatusStandardResponse.OK, messages.get("proveedor.eliminar.exito")));
        } catch(DataIntegrityViolationException e){
            throw new DataNotFoundException(messages.get("proveedor.eliminar.error"));
        }
    }

    @GetMapping("/{idProveedor}")
    @ApiOperation(value = "Permite buscar un proveedor", response = ProveedorDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "El proveedor se consultó correctamente"),
            @ApiResponse(code = 400, message = "La petición es inválida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
    public ResponseEntity<StandardResponse<ProveedorDTO>> consultarPorId(@PathVariable Long idProveedor) {
        return ResponseEntity.ok(new StandardResponse<>(StandardResponse.StatusStandardResponse.OK, proveedorFacade.consultarPorId(idProveedor)));
    }

    @GetMapping()
    @ApiOperation(value = "Permite buscar proveedores", response = ProveedorDTO.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "El proveedor se consultó correctamente"),
            @ApiResponse(code = 400, message = "La petición es inválida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
    public ResponseEntity<StandardResponse<List<ProveedorDTO>>> buscarProveedores() {
        return ResponseEntity.ok(new StandardResponse<>(StandardResponse.StatusStandardResponse.OK, proveedorFacade.buscarProveedores()));
    }

    @GetMapping("/prueba-yal")
    public String prueba(){
        return "Hola funciono bien. ";
    }
}
