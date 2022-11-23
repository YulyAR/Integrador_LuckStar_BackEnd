package com.project.luckstar.model;

import javax.validation.constraints.NotNull;

public class ArticuloDTO {

    private Long id;
    @NotNull
    private String nombreArticulo;
    private String marca;
    private String precio;
    private String costo;
    private String stock;
    private Long fkProveedor;
    private String detalleArticulo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Long getFkProveedor() {
        return fkProveedor;
    }

    public void setFkProveedor(Long fkProveedor) {
        this.fkProveedor = fkProveedor;
    }

    public String getDetalleArticulo() {
        return detalleArticulo;
    }

    public void setDetalleArticulo(String detalleArticulo) {
        this.detalleArticulo = detalleArticulo;
    }
}
