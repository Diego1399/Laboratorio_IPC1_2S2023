/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author diego
 */
public class listausuario implements Serializable {

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
                           ingresado.getCodigo())
                           && usuario.getContrasena().equalsIgnoreCase(
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
                           ingresado.getCodigo())
                           && usuario.getContrasena().equalsIgnoreCase(
                                          ingresado.getContrasena())) {
                return usuario;
            }
        }
        return null;
    }

    public void guardar(Usuario nuevo) {
        if (!Revisar(nuevo)) {
            this.lista.add(nuevo);
        }
    }
    
    public void guardarArchivo() {
        try{
            ObjectOutputStream salida = new ObjectOutputStream(
                new FileOutputStream("C:\\Users\\diego\\OneDrive\\Escritorio\\usuarios.dat"));
            salida.writeObject(this);
            salida.close();
            System.out.println("Lista guardada");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public listausuario cargaArchivo() {
        try{
            ObjectInputStream  entrada = new ObjectInputStream (
                new FileInputStream("C:\\Users\\diego\\OneDrive\\Escritorio\\usuarios.dat"));
            listausuario nuevalista = (listausuario) entrada.readObject();
            entrada.close();
            
            return nuevalista;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void mostrar() {
        if (lista.isEmpty()) {
            System.out.println("No hay usuarios en la lista");
            return;
        }

        for (Usuario usuario : lista) {
            System.out.println("Codigo: " + usuario.getCodigo()
                           + "\t Nombre: " + usuario.getNombre()
                           + "\t Contrasena: " + usuario.getContrasena()
                           + "\t Rol: " + usuario.getRol());
        }
    }
}
