/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    String[] peliculas = new String [10];
    int contador = 0;
    Scanner entrada = new Scanner(System.in);
    
    
    public void ingresar() {
        System.out.println("--Opcion 1--");
        System.out.println("Ingrese nombre de la pelicula");
        
        String nombre_pelicula = entrada.nextLine();
        boolean existe = false;
        
        for (int i = 0; i < peliculas.length; i++) {
            if(peliculas[i] != null) {
                if (peliculas[i].equalsIgnoreCase(nombre_pelicula)) {
                    existe = true;
                    System.err.println("ERROR: Nombre de la pelicula ya existe");
                    break;
                }
            }
        }
        if (!existe) {
            peliculas[contador] = nombre_pelicula;
            contador++;
        }
    }
    
    public void mostrar() {
        System.out.println("** Peliculas en cartelera **");
        for (int i = 0; i < peliculas.length; i++) {
            if(peliculas[i] != null) {
                System.out.println((i + 1 ) + " " + peliculas[i]);
            }
        }
    }
    
    public void menu(){
        String eleccion = "";

        while (!eleccion.equals("3")) {
            
            System.out.println("Menu Principal");
            System.out.println("Seleccionar una opcion");
            System.out.println("1. Ingresar pelicula");
            System.out.println("2. Cartelera");
            System.out.println("3. Salir");
            
            eleccion = entrada.nextLine();
            switch (eleccion) {
                case "1":
                    ingresar();
                    break;
                case "2":
                    mostrar();
                    break;
                case "3":
                    System.out.println("Vuelva pronto");
                    break;
                default:
                    System.out.println("Opcion no encontrada");
            }
            
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*
        String[] estudiantes = new String[5];
        estudiantes[0] = "ADRIANA";
        
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = "ADRIANA" + (i + 1);
            System.out.println(estudiantes[i]);
        }
        */
        Scanner entrada = new Scanner(System.in);
        String usuario = "";

        
        
        while(true) {
            System.out.println("Ingrese un usuario");
            usuario = entrada.nextLine();
            if(usuario.equalsIgnoreCase("admin_1234")) {
                Clase2 funciones = new Clase2();
                funciones.menu();
            }
        }
        
        
        
        
    }
    
}
