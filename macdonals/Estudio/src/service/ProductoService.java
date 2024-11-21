package service;

import models.Computadora;
import models.Producto;
import models.Tableta;
import models.Telefono;

import java.util.HashMap;
import java.util.Scanner;

public class ProductoService {
    private ComputadoraService computadoraService;
    private TabletaService tabletaService;
    private TelefonoService telefonoService;
    private Computadora computadora;
    private Producto producto;
    private Tableta tableta;
    private Telefono telefono;
    private HashMap<String,Producto> listaProductos;
    private Scanner sc;

    public ProductoService() {
        sc = new Scanner(System.in);
        listaProductos = new HashMap<>();
    }
    public void menu (){
        char option;
        do {
            System.out.println("menu");
            System.out.println("1. Ingresar computadora");
            System.out.println("2. Ingresar tableta");
            System.out.println("3. Ingresar telefono");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            option = sc.next().charAt(0);

        }while (option != '5');
        switch (option){
            case '1' -> ingresarComputador();
            case '2' -> ingresarTableta();
            case '3' -> ingresarTelefono();
            case '4' -> ingresarProductos();
            default -> System.out.println("Opcion no valida");

        }
    }
    public void ingresarComputador(){

    }
    public void ingresarTableta(){

    }
    public void ingresarTelefono(){

    }
    public void ingresarProductos(){

    }
}
