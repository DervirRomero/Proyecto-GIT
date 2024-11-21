package models;

public class Tableta extends Producto {
private String tamañano;
private String conectividad;

    @Override
    public String toString() {
        return "Tableta{" +
                "tamañano='" + tamañano + '\'' +
                ", conectividad='" + conectividad + '\'' +
                '}';
    }

    public String getTamañano() {
        return tamañano;
    }

    public void setTamañano(String tamañano) {
        this.tamañano = tamañano;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public Tableta(int precio, String categoria, String nombre, String tamañano, String conectividad) {
        super(precio, categoria, nombre);
        this.tamañano = tamañano;
        this.conectividad = conectividad;
    }
}
