package es.empresa.torneo.modelo;

public class Premio {
    private int posicion;
    private String descripcion;

    public Premio(int posicion, String descripcion) {
        this.posicion = posicion;
        this.descripcion = descripcion;
    }

    public int getPosicion() {
        return posicion;
    }
    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return "Posicion: " + posicion + ": " + descripcion;
    }
}