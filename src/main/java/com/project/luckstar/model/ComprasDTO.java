package com.project.luckstar.model;

import com.project.luckstar.entity.Articulo;

import javax.validation.constraints.NotNull;

public class ComprasDTO {

    private Long id;
    @NotNull
    private String nombreEmpresa;
    private Long fkArticulo;
    private Articulo articulo;
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
