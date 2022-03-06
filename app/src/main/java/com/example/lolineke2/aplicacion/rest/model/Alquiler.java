package com.example.lolineke2.aplicacion.rest.model;

import java.time.LocalDateTime;
import java.util.UUID;

public class Alquiler {

    private UUID id;
    private LocalDateTime inicio;
    private LocalDateTime fin;
    private double coste;
    private Infraestructura infraestructura;
}
