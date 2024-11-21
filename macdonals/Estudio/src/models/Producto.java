package models;

public class Producto {
    private String nombre;
    private int precio;
    private String categoria;

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria='" + categoria + '\'' +
                '}';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public Producto(int precio, String categoria, String nombre) {
        this.precio = precio;
        this.categoria = categoria;
        this.nombre = nombre;
    }

    public Producto() {

    }
}



