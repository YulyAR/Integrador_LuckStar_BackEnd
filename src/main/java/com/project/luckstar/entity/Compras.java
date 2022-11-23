package com.project.luckstar.entity;

import javax.persistence.*;

@Entity
@Table(name = "compras")
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "cantidad")
    private String nombreEmpresa;

    @Column(name = "fk_articulo")
    private Long fkArticulo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_articulo", insertable = false, updatable = false)
    private Articulo articulo;

    @Column(name = "valor_total")
    private String valorTotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
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

    public String getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
}
