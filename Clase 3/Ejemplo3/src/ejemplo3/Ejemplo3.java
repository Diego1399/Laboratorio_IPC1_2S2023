/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo3;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    String[][] l_username = new String[100][3];

    String[] peliculas = new String[10];
    int contador = 0;

    public void login() {
        Scanner scanner = new Scanner(System.in);
        boolean salir = true;

        while (salir) {
            System.out.println("Login\n");

            System.out.print("Ingrese usuario: ");
            String user = scanner.nextLine();

            boolean userExiste = false;

            if (user.equalsIgnoreCase("admin")) {
                mostrarMenuAdministrador();
            } else {
                for (int i = 0; i < l_username.length; i++) {
                    if (l_username[i][0] != null && l_username[i][0].equals(user)) {
                        userExiste = true;
                        break;
                    }
                }

                if (userExiste) {
                    mostrarMenuUsuario();
                } else {
                    if (user.equalsIgnoreCase("exit")) {
                        salir = false;
                    } else {
                        System.out.println("Usuario no existe");
                    }
                }
            }

        }

    }

    public void register() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Registre usuario");
        System.out.print("Ingrese NIT: ");
        String nit = scanner.nextLine();
        System.out.print("Ingrese Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese apellido: ");
        String apellido = scanner.nextLine();

        boolean valorExiste = false;

        for (int i = 0; i < l_username.length; i++) {
            if (l_username[i][0] != null && l_username[i][0].equals(nit)) {
                valorExiste = true;
                break;
            }
        }

        if (!valorExiste) {
            for (int fila = 0; fila < 10; fila++) {
                if (l_username[fila][0] == null) {
                    l_username[fila][0] = nit;
                    l_username[fila][1] = nombre;
                    l_username[fila][2] = apellido;
                    break;
                }
            }
        } else {
            System.out.println("Nit ya existente");
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Ejemplo3 funciones = new Ejemplo3();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("CineUSAC");

            System.out.print(""
                           + "1. Ingresar\n"
                           + "2. Registrar\n"
                           + "3. Salir\n");
            System.out.print("Ingrese una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    funciones.login();
                    break;
                case 2:
                    funciones.register();
                    break;
                case 3:
                    System.exit(0);
                default:
                    throw new AssertionError();
            }
        }
    }

    public void mostrarMenuUsuario() {
        System.out.println("----- Menú de Usuario -----");
        System.out.println("1. Ver perfil");
        System.out.println("2. Ver mensajes");
        System.out.println("3. Salir");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Mostrando perfil...");
                break;
            case 2:
                System.out.println("Mostrando mensajes...");
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    public void mostrarMenuAdministrador() {
        System.out.println("----- Menu de Administrador -----");
        System.out.println("1. Agregar Pelicula");
        System.out.println("2. Mostrar Cartelera");
        System.out.println("3. Mostrar Usuarios");
        System.out.println("4. Regresar");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecciona una opcion: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Gestionando usuarios...");
                break;
            case 2:
                System.out.println("Usuarios Registrados");
                mostrarUsuarios();
                break;
            case 3:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }
    }

    public void mostrarUsuarios() {
        for (int fila = 0; fila < l_username.length; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (l_username[fila] != null) {
                    if(l_username[fila][columna] != null) {
                        System.out.print(l_username[fila][columna] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
