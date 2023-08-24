/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo4;

import clases.listausuario;
import interfaces.*;
/**
 *
 * @author diego
 */
public class Ejemplo4 {

    public static listausuario lista = new listausuario();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Login nuevaVentana = new Login();
        nuevaVentana.setVisible(true);
    }
    
}
