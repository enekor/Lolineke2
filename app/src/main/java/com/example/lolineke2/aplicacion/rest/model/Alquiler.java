package com.example.lolineke2.aplicacion.rest.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Alquiler {

    private UUID id;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private double coste;
    private Infraestructura infraestructura;
    private Usuario cliente;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFin() {
        return fin;
    }

    public void setFin(LocalDateTime fin) {
        this.fin = fin;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    public Infraestructura getInfraestructura() {
        return infraestructura;
    }

    public void setInfraestructura(Infraestructura infraestructura) {
        this.infraestructura = infraestructura;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }
}
