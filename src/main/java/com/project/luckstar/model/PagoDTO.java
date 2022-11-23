package com.project.luckstar.model;

import com.project.luckstar.entity.Articulo;


public class PagoDTO {
    private Long id;
    private String impuesto;
    private Long subtotal;
    private Long pagoTotal;
    private Long fkArticulo;
    private Articulo articulo;
    private String descuento;
    private String cantidad;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(String impuesto) {
        this.impuesto = impuesto;
    }

    public Long getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Long subtotal) {
        this.subtotal = subtotal;
    }

    public Long getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(Long pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public Long getFkArticulo() {
        return fkArticulo;
    }

    public void setFkArticulo(Long fkArticulo) {
        this.fkArticulo = fkArticulo;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
}
