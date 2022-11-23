package com.project.luckstar.model;

import com.project.luckstar.entity.Pago;
import com.project.luckstar.entity.Persona;

import java.time.LocalDate;

public class VentaDTO {
    private Long id;
    private LocalDate fecha;
    private String hora;
    private Long fkPago;
    private Pago pago;
    private Long fkPersona;
    private Persona persona;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Long getFkPago() {
        return fkPago;
    }

    public void setFkPago(Long fkPago) {
        this.fkPago = fkPago;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }

    public Long getFkPersona() {
        return fkPersona;
    }

    public void setFkPersona(Long fkPersona) {
        this.fkPersona = fkPersona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}
