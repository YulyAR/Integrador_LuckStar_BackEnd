package com.project.luckstar.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "venta")
public class Venta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fecha")
    private LocalDate fecha;

    @Column(name = "hora")
    private String hora;

    @Column(name = "fk_pago")
    private Long fkPago;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_pago", insertable = false, updatable = false)
    private Pago pago;

    @Column(name = "fk_persona")
    private Long fkPersona;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_persona", insertable = false, updatable = false)
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
