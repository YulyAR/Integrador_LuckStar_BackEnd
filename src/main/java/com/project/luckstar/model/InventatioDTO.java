package com.project.luckstar.model;

import com.project.luckstar.entity.Compras;
import com.project.luckstar.entity.Venta;

import java.time.LocalDate;

public class InventatioDTO {
    private Long id;
    private Long fkVenta;
    private Venta venta;
    private Long fkCompra;
    private Compras compra;
    private LocalDate fechaTransaccion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFkVenta() {
        return fkVenta;
    }

    public void setFkVenta(Long fkVenta) {
        this.fkVenta = fkVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Long getFkCompra() {
        return fkCompra;
    }

    public void setFkCompra(Long fkCompra) {
        this.fkCompra = fkCompra;
    }

    public Compras getCompra() {
        return compra;
    }

    public void setCompra(Compras compra) {
        this.compra = compra;
    }

    public LocalDate getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(LocalDate fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }
}
