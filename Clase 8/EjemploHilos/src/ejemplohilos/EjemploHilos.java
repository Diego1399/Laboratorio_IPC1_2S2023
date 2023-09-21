/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplohilos;

import java.time.LocalDateTime;

/**
 *
 * @author diego
 */
public class EjemploHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola soy funcion main " + LocalDateTime.now());
        Modo1 hilo1 = new Modo1();
        Thread thread = new Thread(hilo1);
        thread.start();
        
        
        Modo2 hilo2 = new Modo2();
        hilo2.start();
        
        System.out.println("adios soy funcion main " + LocalDateTime.now());
        
    }
    
}
