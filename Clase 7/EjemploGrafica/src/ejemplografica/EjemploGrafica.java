/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplografica;

import Interfaces.Login;
import clases.Lista;

/**
 *
 * @author diego
 */
public class EjemploGrafica {

    /**
     * @param args the command line arguments
     */
    public static Lista usuarios = new Lista();
    
    public static void main(String[] args) {
        // TODO code application logic here
        Login ventana = new Login();
        ventana.setVisible(true);
    }
    
}
