package com.example.lolineke2.aplicacion.rest.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Login {

    private LocalDateTime fecha;
    private UUID token;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public UUID getToken() {
        return token;
    }

    public void setToken(UUID token) {
        this.token = token;
    }
}
