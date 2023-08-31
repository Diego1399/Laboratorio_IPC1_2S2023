/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

/**
 *
 * @author diego
 */
public class UsuarioNormal extends Usuario{
    private String[] historial;
    private int contador;

    public UsuarioNormal(String codigo, String nombre, String contrasena) {
        super(codigo, nombre, contrasena);
        this.historial = new String[100];
        this.contador = 0;
    }
    
    public void Guardar(String operacion){
        historial[contador] = operacion;
        contador++;
    }
    
    public void mostrarHistorial(){
        for (String elem : historial) {
            System.out.println(elem);
        }
    }

    public String[] getHistorial() {
        return historial;
    }
    
    public void mostrardatos() {
        System.out.println("Codigo: " + getCodigo());
        System.out.println("Nombre: " + getNombre());
    }
}
