/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vinos;

/**
 *
 * @author diego
 */
public class Vino {
    public String sabor;

    public Vino() {
        this.sabor = null;
    }
    
    public void MostrarSabor(){
        System.out.println("Soy de sabor " + this.sabor);
    }
}
