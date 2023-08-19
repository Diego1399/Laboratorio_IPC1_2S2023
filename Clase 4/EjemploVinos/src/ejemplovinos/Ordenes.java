/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplovinos;
import vinos.*;
import uvas.*;
/**
 *
 * @author diego
 */
public class Ordenes {
    public Vino almacen[];

    public Ordenes() {
        this.almacen = new Vino[100];
    }
    
    public void CrearOrden(int tipo, int cantidad){
        for (int i = 0; i < cantidad; i++) {
            switch (tipo) {
                case 1:
                    Uva nuevaRoja = new Roja();
                    almacen[i] = nuevaRoja.CrearVino();
                    break;
                case 2:
                    Uva nuevaVerde = new Verde();
                    almacen[i] = nuevaVerde.CrearVino();
                    break;
                case 3:
                    Uva nuevaPinon = new Pinon();
                    almacen[i] = nuevaPinon.CrearVino();
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
    
    public void Consulta(){
        for (Vino vino : almacen) {
            if (vino != null) vino.MostrarSabor();
        }
    }
}
