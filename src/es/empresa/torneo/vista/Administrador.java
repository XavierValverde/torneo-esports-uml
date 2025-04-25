package es.empresa.torneo.vista;

import es.empresa.torneo.control.Torneo;

import java.util.Date;

public class Administrador {
    private String nombre;
    private String email;

    public Administrador(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }
    public Torneo crearTorneo(String nombre, Date fecha){
        return new Torneo(nombre, fecha);
    }
}
