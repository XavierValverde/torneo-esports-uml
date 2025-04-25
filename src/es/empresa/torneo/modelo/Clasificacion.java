package es.empresa.torneo.modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Clasificacion {
    private Map<Equipo, Integer> tabla;

    public Clasificacion() {
        tabla = new HashMap<>();
    }
    public void registrarEquipo(Equipo equipo) {
        tabla.putIfAbsent(equipo, 0);
    }
    public void actualizar(Equipo equipo, int puntos) {
        tabla.put(equipo, tabla.getOrDefault(equipo, 0) + puntos);
        equipo.sumarPuntos(puntos);
    }
    public List<Equipo> obtenerRanking() {
        List<Equipo> ranking = new ArrayList<>(tabla.keySet());
        ranking.sort((e1, e2) -> tabla.get(e2) - tabla.get(e1));
        return ranking;
    }

    public void mostrarRanking() {
        System.out.println("Clasificación:");
            obtenerRanking().forEach(System.out::println);
    }
}