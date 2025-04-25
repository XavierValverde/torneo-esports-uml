package es.empresa.torneo.modelo;
import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private int idEquipo;
    private String nombreEquipo;
    private List<torneo.Jugador> jugadores;
    private int puntos;

    public Equipo(String nombreEquipo, int idEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.idEquipo = idEquipo;
        this.jugadores = new ArrayList<>();
        this.puntos = 0;
    }

    public void agregarJugador(torneo.Jugador jugador){
        jugadores.add(jugador);
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public int getPuntos(){
        return puntos;
    }
    public void sumarPuntos(int puntos){
        this.puntos += puntos;
    }
//generamos el toString con el nombre y los puntos
    @java.lang.Override
    public java.lang.String toString() {
        return "Equipo{" +
                "nombreEquipo='" + nombreEquipo + '\'' +
                ", puntos=" + puntos +
                '}';
    }
}