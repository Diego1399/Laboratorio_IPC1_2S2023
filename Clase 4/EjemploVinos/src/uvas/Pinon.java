/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uvas;

import vinos.*;
/*
import vinos.Vino;
import vinos.Dulce;
*/

/**
 *
 * @author diego
 */
public class Pinon extends Uva{

    @Override
    public Vino CrearVino() {
        Vino nuevoVino = new Dulce();
        return nuevoVino;
    }
    
}
