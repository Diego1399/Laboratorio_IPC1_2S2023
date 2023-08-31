/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author diego
 */
public class Usuario {
    
    private String codigo;
    private String nombre;
    private String contrasena;
    public String rol;

    public Usuario(String codigo, String nombre, String contrasena, String rol) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    public Usuario(String codigo, String nombre, String contrasena) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.contrasena = contrasena;
        this.rol = "";
    }

    public Usuario(String codigo, String contrasena) {
        this.codigo = codigo;
        this.contrasena = contrasena;
        this.rol = "";
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    
}
