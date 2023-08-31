/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package serializar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author diego
 */
public class Serializar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista_vehiculos = new Lista();
        
        
        //System.out.println("La lista contiene " + lista_vehiculos.getSize() + " vehiculos");
        
        // LLenar lista
        
        
        
        for (int i = 0; i < 3; i++) {
            Vehiculo nuevo = new Vehiculo(
            "Nissan", "2022", "Rojo");
            lista_vehiculos.guardar(nuevo);
        }
        
        for (int i = 0; i < 2; i++) {
            Vehiculo nuevo = new Vehiculo(
            "Ferrari", "2023", "Azul");
            lista_vehiculos.guardar(nuevo);
        }
        
        lista_vehiculos.guardarArchivo("C:\\Users\\diego\\OneDrive\\Escritorio\\vehiculos.dat");
        
//        System.out.println("Lista de vehiculos");
//        lista_vehiculos.mostrar();
        
        try {
            // Serializar la lista
            /*
            FileInputStream fis = new FileInputStream(ruta);
            ObjectInputStream entrada = new ObjectInputStream(fis);
            
            this.lista =(ArrayList<Vehiculo>) entrada.readObject();
            entrada.close();
            */
            /*
            ObjectOutputStream salida = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\diego\\OneDrive\\Escritorio\\vehiculos.dat"));
            salida.writeObject(lista_vehiculos);
            salida.close();
            */
            
            // Deserializar la lista
            /*
            FileInputStream fis = new FileInputStream("C:\\Users\\diego\\OneDrive\\Escritorio\\vehiculos.dat");
            ObjectInputStream entrada = new ObjectInputStream(fis);
            
            Lista lista_recuperada = new Lista();
            lista_recuperada = (Lista) entrada.readObject();
            entrada.close();
            */
            
            Lista lista_recuperada = lista_vehiculos.cargarArchivo("C:\\Users\\diego\\OneDrive\\Escritorio\\vehiculos.dat");
            
            System.out.println("Lista recuperada");
            lista_recuperada.mostrar();
            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
