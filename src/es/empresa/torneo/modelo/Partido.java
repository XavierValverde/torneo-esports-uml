package es.empresa.torneo.modelo;
public class Partido{
    private torneo.Equipo equipo1;
    private torneo.Equipo equipo2;
    private String resultado;

    public Partido(torneo.Equipo equipo1, torneo.Equipo equipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.resultado = "";
    }
    public void registrarResultado(String resultado) {
        this.resultado = resultado;
    }
    public torneo.Equipo getEquipoGanador() {
        if (resultado.equalsIgnoreCase("empate")) return null;
        if(resultado.contains(equipo1.getNombreEquipo())) return equipo1;
        if(resultado.contains(equipo2.getNombreEquipo())) return equipo2;
        return null;
    }
    public String getResultado() {
        return resultado;
    }
    public torneo.Equipo getEquipo1() {
        return equipo1;
    }
    public torneo.Equipo getEquipo2() {
        return equipo2;
    }

    @Override
    public String toString() {
        return equipo1.getNombreEquipo() + " vs " + equipo2.getNombreEquipo() + " Resultado: " + resultado;
    }
}