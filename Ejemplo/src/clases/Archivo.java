/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Archivo {
    
    private String ruta;
    private File file;
    private BufferedReader br;
    private BufferedWriter bw;

    public Archivo(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
    public ArrayList<String[]> leer(){
        try {
            file = new File(ruta);
            br = new BufferedReader(new FileReader(file));
            String linea = br.readLine();
            
            ArrayList<String[]> datos = new ArrayList<>();
            
            while (linea != null) { 
                // dato1|dato2|dato3
                
                // linea.split("|") = [dato1, dato2, dato3]
                datos.add(linea.split("\\|"));
                linea = br.readLine();
            }
            br.close();
            return datos;
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public void escribir(String datos) {
        try {
            file = new File(ruta);
            bw = new BufferedWriter(new FileWriter(file));
            bw.write(datos);
            bw.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
