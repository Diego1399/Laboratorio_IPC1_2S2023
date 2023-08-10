/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Clase3 {

    /**
     * @param args the command line arguments
     */
    // Variables globales
    String[][] l_usuarios = new String[10][3];
    String[] peliculas = new String[10];
    int contador = 0;

    public void register() {
        Scanner s = new Scanner(System.in);

        System.out.println("***** Registro *****");
        System.out.print("Ingrese NIT: ");
        String nit = s.nextLine();
        System.out.print("Ingrese Nombre: ");
        String nombre = s.nextLine();
        System.out.print("Ingrese Apellido: ");
        String apellido = s.nextLine();

        boolean valorExiste = false;

        // Buscar el nit en cada fila para que no se repita
        for (int fila = 0; fila < l_usuarios.length; fila++) {

            if (l_usuarios[fila][0] != null && l_usuarios[fila][0].equals(nit)) {
                valorExiste = true;
                break;
            }
        }

        // Verificar si el NIT ya existe
        if (!valorExiste) {
            for (int fila = 0; fila < 10; fila++) {
                if (l_usuarios[fila][0] == null) {
                    l_usuarios[fila][0] = nit;
                    l_usuarios[fila][1] = nombre;
                    l_usuarios[fila][2] = apellido;
                    break;
                }
            }
        }
    }

    public void login() {
        Scanner s = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("***** Ingreso *****");
            System.out.print("Ingrese usuario: ");
            String user = s.nextLine();

            boolean userExist = false;
            String cliente = "";

            if (user.equalsIgnoreCase("Admin")) {
                menuadmin();
            } else {
                for (int i = 0; i < l_usuarios.length; i++) {
                    if (l_usuarios[i][0] != null
                                   && l_usuarios[i][0].equals(user)) {
                        userExist = true;
                        cliente = l_usuarios[i][1] + " " + l_usuarios[i][2];
                        break;
                    }
                }

                if (userExist) {
                    menucliente(cliente);
                } else {
                    if (user.equalsIgnoreCase("exit")) {
                        salir = false;
                        break;
                    } else {
                        System.err.println("USUARIO NO EXISTE");
                    }
                }
            }
        }
    }

    public void menuadmin() {
        Scanner s = new Scanner(System.in);
        boolean salir = false;
        while (!salir) {
            System.out.println("=== Menu administrador ====");
            System.out.println("1. Ingresar pelicula");
            System.out.println("2. Mostrar usuarios");
            System.out.println("3. Salir");
            System.out.print("Seleccionar una opcion: ");

            String opcion = s.nextLine();
            switch (opcion) {
                case "1":
                    ingresarpelicula();
                    break;
                case "2":
                    mostrarUsuario();
                    break;
                case "3":
                    salir = true;
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }

    public void ingresarpelicula() {
        System.out.println("Ingrese nombre de la pelicula");
        Scanner s = new Scanner(System.in);

        String nombre_pelicula = s.nextLine();
        boolean existe = false;

        for (int i = 0; i < peliculas.length; i++) {
            if (peliculas[i] != null) {
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

    public void menucliente(String nombre) {
        System.out.println("Bienvenido " + nombre);
        System.out.println("=== Menu cliente ====");
        System.out.println("Seleccionar una opcion");
        System.out.println("1. Comprar boleto");
        System.out.println("2. Salir");
    }

    public void mostrarUsuario() {
        for (int fila = 0; fila < 10; fila++) {
            System.out.print(fila + ". ");
            for (int columna = 0; columna < 3; columna++) {
                System.out.print(l_usuarios[fila][columna] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Clase3 fun = new Clase3();

        while (true) {
            System.out.println("--- CineUSACpolis ---\n");
            System.out.println("1. Ingreso\n"
                           + "2. Registro\n"
                           + "3. Salir");
            System.out.print("Ingrese una opcion: ");

            String opcion = s.nextLine();

            switch (opcion) {
                case "1":
                    System.out.println("Ingreso");
                    fun.login();
                    break;
                case "2":
                    fun.register();
                    break;
                case "3":
                    System.out.println("Gracias por venir");
                    System.exit(0);
                    break;
                default:
                    System.err.println("OPCION NO VALIDA");
            }
        }
    }

}
