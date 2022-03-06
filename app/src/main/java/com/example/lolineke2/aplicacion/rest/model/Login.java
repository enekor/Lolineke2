package com.example.lolineke2.aplicacion.rest.model;

import java.time.LocalDateTime;

public class Login {

    private LocalDateTime fecha;
    private  String token;

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
