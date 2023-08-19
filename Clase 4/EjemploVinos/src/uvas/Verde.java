/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uvas;

import vinos.*;
/**
 *
 * @author diego
 */
public class Verde extends Uva{

    @Override
    public Vino CrearVino() {
        Vino nuevoVino = new Barroco();
        return nuevoVino;
    }
    
}
