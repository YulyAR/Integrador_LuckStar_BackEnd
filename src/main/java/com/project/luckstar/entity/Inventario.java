package com.project.luckstar.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "inventario")
public class Inventario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fk_venta")
    private Long fkVenta;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_venta", insertable = false, updatable = false)
    private Venta venta;

    @Column(name = "fk_compra")
    private Long fkCompra;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_compra", insertable = false, updatable = false)
    private Compras compra;

    @Column(name = "fecha_transaccion")
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
