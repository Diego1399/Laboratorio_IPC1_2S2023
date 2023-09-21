/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplohilos;

import java.time.LocalDateTime;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Modo1 implements Runnable{

    @Override
    public void run() {
        try {
            
            int random = ThreadLocalRandom.current().
                           nextInt(1000, 5000);
            System.out.println("Hola soy hilo modo 1 " + 
                           LocalDateTime.now());
            
            Thread.sleep(random);
            
            System.out.println("Adios soy hilo modo 1 " + 
                           LocalDateTime.now());
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
