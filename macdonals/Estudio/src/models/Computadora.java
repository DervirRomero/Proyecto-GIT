package models;

public class Computadora extends Producto {
    private String procesador;
    private String ram;

    @Override
    public String toString() {
        return "Computadora{" +
                "procesador='" + procesador + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public Computadora(int precio, String categoria, String nombre, String ram, String procesador) {
        super(precio, categoria, nombre);
        this.ram = ram;
        this.procesador = procesador;
    }
}
