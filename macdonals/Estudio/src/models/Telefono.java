package models;

public class Telefono extends Producto{
    private String sistema;
    private String capacidad;

    @Override
    public String toString() {
        return "Telefono{" +
                "sistema='" + sistema + '\'' +
                ", capacidad='" + capacidad + '\'' +
                '}';
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Telefono(int precio, String categoria, String nombre, String sistema, String capacidad) {
        super(precio, categoria, nombre);
        this.sistema = sistema;
        this.capacidad = capacidad;
    }
}
