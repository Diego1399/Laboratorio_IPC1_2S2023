/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo8;

import java.util.Observable;

/**
 *
 * @author diego
 */
public class cronometro extends Observable implements Runnable{
    
    private int horas, minutos, segundos;
    private boolean isRunning = true;
    private boolean ispaused = false;

    public cronometro(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public void detener() {
        this.ispaused = true;
    }
    
    public synchronized void continuar() {
        this.ispaused = false;
        notify();
    }

    @Override
    public void run() {
        String tiempo;
        
        while (isRunning) {            
            try {
                while (ispaused) {                    
                    synchronized (this) {
                        wait();
                    }
                }
                tiempo = "";
                
                if (horas < 10) {
                    tiempo += "0" + horas;
                } else {
                    tiempo += horas;
                }
                
                tiempo += ":";
                
                if (minutos < 10) {
                    tiempo += "0" + minutos;
                } else {
                    tiempo += minutos;
                }
                
                tiempo += ":";
                
                if (segundos < 10) {
                    tiempo += "0" + segundos;
                } else {
                    tiempo += segundos;
                }
                
                /*
                    Enviamos la variable tiempo
                    a la clase Observers
                */
                this.setChanged();
                this.notifyObservers(tiempo);
                this.clearChanged();
                
                Thread.sleep(1000);
                
                System.out.println(tiempo);
                segundos++;
                if(segundos == 60) {
                    segundos = 0;
                    minutos++;
                    if (minutos == 60) {
                        minutos = 0;
                        horas++;
                        if (horas == 24) {
                            horas = 0;
                        }
                    }
                }
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
}
