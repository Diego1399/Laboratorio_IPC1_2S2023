/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class Lista {
    
    ArrayList<Usuario> lista;

    public Lista() {
        this.lista = new ArrayList<>();
    }
    
    public boolean validar(Usuario nuevo) {
        boolean permitir = true;
        for (Usuario usuario : lista) {
            // Diego.equals("diego") dIego diEgo DIEgo
            if (usuario.getCodigo().equals(nuevo.getCodigo())) {
                permitir = false;
                break;
            }
        }
        return permitir;
    }
    
    public void guardar(Usuario nuevo) {
        if(validar(nuevo)) {
            lista.add(nuevo);
        }
    }

    public ArrayList<Usuario> getLista() {
        return lista;
    }
}
