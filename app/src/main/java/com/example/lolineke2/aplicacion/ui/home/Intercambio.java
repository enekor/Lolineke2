package com.example.lolineke2.aplicacion.ui.home;

public class Intercambio {
    private static Intercambio instance;
    private Intercambio(){}

    public static Intercambio getInstance(){
        if(instance==null){
            instance = new Intercambio();
        }
        return instance;
    }

    private AlquilarActivity alquilarActivity;

    public AlquilarActivity getAlquilarActivity() {
        return alquilarActivity;
    }

    public void setAlquilarActivity(AlquilarActivity alquilarActivity) {
        this.alquilarActivity = alquilarActivity;
    }
}
