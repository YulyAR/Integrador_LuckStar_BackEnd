package com.project.luckstar.entity;

import javax.persistence.*;

@Entity
@Table(name = "articulo")
public class Articulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre_articulo")
    private String nombreArticulo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "precio")
    private String precio;

    @Column(name = "costo")
    private String costo;

    @Column(name = "stock")
    private String stock;

    @Column(name = "fk_proveedor")
    private Long fkProveedor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_proveedor", insertable = false, updatable = false)
    private Proveedor proveedor;

    @Column(name = "detalle_articulo")
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

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public String getDetalleArticulo() {
        return detalleArticulo;
    }

    public void setDetalleArticulo(String detalleArticulo) {
        this.detalleArticulo = detalleArticulo;
    }
}
