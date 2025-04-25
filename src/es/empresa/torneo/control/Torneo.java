package es.empresa.torneo.control;

import es.empresa.torneo.modelo.Equipo;
import es.empresa.torneo.modelo.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Torneo {
    private String nombre;
    private Date fecha;
    private String categoria;
    private String estado; //finalizado, en marcha, por celebrar
    private List<Equipo>equipos;
    private Bracket bracket;
    private Clasificacion clasificacion;
    private List<Premio> premios;

    public Torneo(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.estado = "Por celebrar";
        this.equipos = new ArrayList<>();
        this.clasificacion = new Clasificacion();
        this.premios = new ArrayList<>();
    }
    public void inscribirEquipo(Equipo equipo){
        equipos.add(equipo);
        clasificacion.registrarEquipo(equipo);
    }
    public void generarBracket(){

        this.bracket = new Bracket(equipos);
    }
    public void actualizarClasificacion(Equipo equipo,int puntos){

        clasificacion.actualizar(equipo, puntos);
    }
    public void asignarPremios(){
        List<Equipo> ranking = clasificacion.obtenerRanking();

        for(int i=0; i < premios.size() && i < ranking.size(); i++){
            Equipo equipo = ranking.get(i);
            Premio premio = premios.get(i);
            System.out.println("Equipo "+equipo.getNombreEquipo()+ "ganó: "+premio.getDescripcion());
        }
    }

    public String getNombre() {
        return nombre;
    }
    public Date getFecha() {
        return fecha;

    }
    public String getEstado() {
        return estado;
    }
    public String setEstado(String estado) {
        this.estado = estado;
        return estado;
    }
    public List<Equipo> getEquipos() {
        return equipos;
    }
    public Bracket getBracket() {
        return bracket;
    }
    public Clasificacion getClasificacion() {
        return clasificacion;
    }
    public void agregarPremio(Premio premio){
        premios.add(premio);
    }
    public List<Premio> getPremios() {
        return premios;
    }

    @Override
    public String toString() {
        return "Torneo: " + nombre + " ("+estado+")";
    }
}