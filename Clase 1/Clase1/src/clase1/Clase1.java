/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase1;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Comentario en linea
        
        /* Este es un 
        comentario
        multilinea */
        
        // Tipos de Variables
        /*
        int numero = 2023;
        double decimal =  60.5;
        String cadena = "Laboratiorio IPC1";
        char caracter = 'B';
        boolean logico = true;
        final double pi = 3.1416;
        
        System.out.println(cadena);
        System.out.println("Seccion: " + caracter);
        System.out.println("Anho: " + numero);
        System.out.println("Asignado: " + logico);
        System.out.println("Nota Final: " + decimal);
        
        decimal = 100.0;
        System.out.println("Nueva Nota Final: " + decimal);
        
        System.out.println("Pi = " + pi);
        */
        /*
        int nota = 61;
        
        if(nota > 61) {
            System.out.println("Aprobo lab");
        } else if(nota == 61) {
            System.out.println("Por los pelos");
        } else {
            System.out.println("No Aprobo lab");
        }
        
        System.out.println("Fin del If");
        
        System.out.println("\nEstructura Switch");
        
        int opcion = 10;
        
        switch (opcion) {
            case 1:
                System.out.println("Opcion 1");
                break;
            case 2:
                System.out.println("Opcion 2");
                break;
            case 3:
                System.out.println("Opcion 3");
                break;
            case 4:
                System.out.println("Opcion 4");
                break;
            case 5:
                System.out.println("Opcion 5");
                break;
            default:
                System.out.println("Esta no es una opcion");
                break;
        }
        
        System.out.println("Fin de switch");
        
        System.out.println("\nEstrucutra For");
        
        // i++ = i + 1
        for(int i = 0; i < 5; i++) {
            System.out.println("Contador: " + i);
        }
        
        System.out.println("\nEstrucutra While");
        
        int limite = 10;
        while(limite < 15) {
            System.out.println("Limite actual: " + limite);
            //System.out.println(limite < 15);
            limite = limite + 1;  
        }
        System.out.println(limite < 15);
        System.out.println("Fin del While");
        
        System.out.println("\nEstrucutra Do-While");
        
        limite = 9;
        do {            
            System.out.println("Limite Actual: " + limite);
            if (limite % 2 == 0) {
                System.out.print("Es par \n");
            }
            limite++;
            
        } while (limite <= 15);
*/
        Scanner s = new Scanner(System.in);
        
        int numero = s.nextInt();
        System.out.println("Numero: " + numero);
        
        for (int i = 0; i <= numero; i++) {
            System.out.println("numero es: " + i);
        }
        
        System.out.println("\nWhile");
        
        System.out.println("Agregar nuevo numero: ");
        numero = s.nextInt();
        
        while (numero < 5) {
            System.out.println("Agregar nuevo numero: ");
            numero = s.nextInt();
        }
        
        System.out.println("\n Do-While");
        
        do{
            System.out.println("Agregar nuevo numero: ");
            numero = s.nextInt();
        } while (numero < 5);
        
        System.out.println("Agregar un nombre: ");
        
        Scanner s1 = new Scanner(System.in);
        
        s = new Scanner(System.in); 
        String nombre = s.nextLine();
        System.out.println("Hola mi nombre es " + nombre);
    }
    
}
