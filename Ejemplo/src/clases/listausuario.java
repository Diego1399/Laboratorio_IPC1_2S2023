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
public class listausuario {
    
    ArrayList<Usuario> lista;

    public listausuario() {
        this.lista = new ArrayList<>();
    }
    
    public boolean Revisar(Usuario ingresado) {
        boolean permitir = false;
        for (Usuario usuario : this.lista) {
            if (usuario.getCodigo().equalsIgnoreCase(
                           ingresado.getCodigo())) {
                permitir = true;
                break;
            }
        }
        return permitir;
    }
    
    public boolean Validar(Usuario ingresado) {
        boolean permitir = false;
        for (Usuario usuario : this.lista) {
            if (usuario.getCodigo().equalsIgnoreCase(
                           ingresado.getCodigo()) &&
                           usuario.getContrasena().equalsIgnoreCase(
                           ingresado.getContrasena())) {
                permitir = true;
                break;
            }
        }
        return permitir;
    }
    
    public Usuario getItem(Usuario ingresado) {
        for (Usuario usuario : lista) {
            if (usuario.getCodigo().equalsIgnoreCase(
                           ingresado.getCodigo()) &&
                           usuario.getContrasena().equalsIgnoreCase(
                           ingresado.getContrasena())) {
                return usuario;
            }
        }
        return null;
    }
    
    public void guardar(Usuario nuevo) {
        if(!Revisar(nuevo)){
            this.lista.add(nuevo);
        }
    }
    
    public void mostrar(){
        for (Usuario usuario : lista) {
            System.out.println("Codigo: " + usuario.getCodigo() +
                            "\t Nombre: " + usuario.getNombre() +
                           "\t Contrasena: " + usuario.getContrasena() +
                           "\t Rol: " + usuario.getRol());
        }
    }

    public ArrayList<Usuario> getLista() {
        return lista;
    }
}
