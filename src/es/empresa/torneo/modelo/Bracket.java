package es.empresa.torneo.modelo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bracket{
    private List<Partido> partidos;

    public Bracket(List<Equipo> equipos){
        this.partidos = new ArrayList<Partido>();
        generarPartidos(equipos);
    }

    private void generarPartidos(List<Equipo> equipos){
        Collections.shuffle(equipos);
        for(int i=0; i<equipos.size() -1; i+=2){
            partidos.add(new Partido(equipos.get(i), equipos.get(i +1)));
        }
    }
    public List<Partido> getPartidos(){
        return partidos;
    }

    @Override
    public String toString() {
        return "Bracket{" +
                "partidos=" + partidos +
                '}';
    }
}