/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author diego
 */
public class UsuarioAdmin extends Usuario{
    
    public UsuarioAdmin(String codigo, String nombre, String contrasena, String rol) {
        super(codigo, nombre, contrasena, rol);
    }
    
    public boolean esAdmin() {
        return this.rol.equalsIgnoreCase("Administrador");
    }
    
    public void mostrardatos() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
    }
}
