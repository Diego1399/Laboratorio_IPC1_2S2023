/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package serializar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Lista implements Serializable {

    private ArrayList<Vehiculo> lista;

    public Lista() {
        this.lista = new ArrayList<>();
    }

    public void guardar(Vehiculo nuevo) {
        if (!lista.contains(nuevo)) {
            lista.add(nuevo);
        }
    }

    public void guardarArchivo(String ruta) {
        try {
            ObjectOutputStream salida = new ObjectOutputStream(
                           new FileOutputStream(ruta));
            salida.writeObject(this.lista);
            salida.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public Lista cargarArchivo(String ruta) {
        try {
            FileInputStream fis = new FileInputStream(ruta);
            ObjectInputStream entrada = new ObjectInputStream(fis);
            
            this.lista =(ArrayList<Vehiculo>) entrada.readObject();
            entrada.close();
            
            return this;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public int getSize() {
        return lista.size();
    }

    public void mostrar() {
        for (int i = 0; i < lista.size(); i++) {
            Vehiculo actual = lista.get(i);

            System.out.println((i + 1) + ". Vehiculo: "
                           + actual.marca + ", "
                           + actual.modelo + ", "
                           + actual.color);
        }
    }
}
