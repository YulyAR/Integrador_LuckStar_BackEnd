package com.project.luckstar.entity;

import javax.persistence.*;

@Entity
@Table(name = "pago")

public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "impuesto")
    private String impuesto;

    @Column(name = "subtotal")
    private Long subtotal;

    @Column(name = "pago_total")
    private Long pagoTotal;

    @Column(name = "fk_articulo")
    private Long fkArticulo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_articulo", insertable = false, updatable = false)
    private Articulo articulo;

    @Column(name = "descuento")
    private String descuento;

    @Column(name = "cantidad")
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
