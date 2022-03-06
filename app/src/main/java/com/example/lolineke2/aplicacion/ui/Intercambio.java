package com.example.lolineke2.aplicacion.ui;

import com.example.lolineke2.aplicacion.rest.model.Usuario;

public class Intercambio {
    private static Intercambio instance;
    private Intercambio(){}

    public static Intercambio getInstance(){
        if(instance==null){
            instance = new Intercambio();
        }
        return instance;
    }

    private FragmentHolder fragmentHolder;
    private String deporteSeleccionado;
    private Usuario usuario;

    public FragmentHolder getFragmentHolder() {
        return fragmentHolder;
    }

    public void setFragmentHolder(FragmentHolder fragmentHolder) {
        this.fragmentHolder = fragmentHolder;
    }

    public String getDeporteSeleccionado() {
        return deporteSeleccionado;
    }

    public void setDeporteSeleccionado(String deporteSeleccionado) {
        this.deporteSeleccionado = deporteSeleccionado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
