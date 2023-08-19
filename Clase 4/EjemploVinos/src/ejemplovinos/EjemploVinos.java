/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplovinos;

import uvas.*;
import vinos.*;

/**
 *
 * @author diego
 */
public class EjemploVinos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Uva nueva = new Verde();
        System.out.println(nueva.CrearVino().sabor);
        
        Uva nueva2 = new Roja();
        System.out.println(nueva2.CrearVino().sabor);
        
        Uva nueva3 = new Pinon();
        System.out.println(nueva3.CrearVino().sabor);
        
        */     
        /*
        run: 
            Medio
            Muy Fuerte
            Dulce
        */
        /*
        Vino nuevo = new Vino();
        System.out.println(nuevo.sabor);
        
        nuevo = new Dulce();
        System.out.println(nuevo.sabor);
        
        nuevo = new Tinto();
        System.out.println(nuevo.sabor);
        
        nuevo = new Barroco();
        System.out.println(nuevo.sabor);
        */
        
        Ordenes orden = new Ordenes();
        orden.CrearOrden(1, 15);
        
        Ordenes orden2 = new Ordenes();
        orden2.CrearOrden(2, 30);
        
        Ordenes orden3 = new Ordenes();
        orden3.CrearOrden(3, 25);
        
        System.out.println("Orden 1");
        orden.Consulta();
        
        System.out.println("\nOrden 2");
        orden2.Consulta();
        
        System.out.println("\nOrden 3");
        orden3.Consulta();
    }
    
}
