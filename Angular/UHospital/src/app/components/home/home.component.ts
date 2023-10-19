import { Component, OnInit } from '@angular/core';

// Sevicios
import { ServicioService } from 'src/app/services/servicio.service'

// Modelos
import { medicina } from 'src/app/modelos/medicina'
import { pedido } from 'src/app/modelos/pedido'
import * as e from 'express';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{
  
  medicina: medicina = new medicina();
  pedido: pedido = new pedido();

  catalogo: medicina[] = []

  listamedicina: pedido[] = [];

  total: number = 0;

  constructor(private service: ServicioService){} 

  ngOnInit(): void {
    this.service.GetMedicinas().subscribe(data => {
      this.catalogo = data

      this.catalogo.forEach((element: medicina) => {

        const pedido = {
          id: element.id,
          name: element.name,
          descripcion: element.descripcion,
          precio: element.precio,
          cantidad: 0,
          subtotal: 0,
          total: this.total
        }

        this.listamedicina.push(pedido)
      });      
    }, err => {
      console.log(err)
    })

  }

  aumentarCantidad(index: number) {
    let cantidad = this.listamedicina[index].cantidad as number
    let max = this.catalogo[index].cantidad as number
    if(cantidad < max) {
      
      let precio = this.listamedicina[index].precio as number
      cantidad++;
      this.listamedicina[index].cantidad = cantidad
      this.listamedicina[index].subtotal =  precio * cantidad

      this.total += precio
    }
  }

  disminuirCantidad(index: number) {
    let cantidad = this.listamedicina[index].cantidad as number
    if (cantidad > 0){
      let precio = this.listamedicina[index].precio as number
      cantidad--;
      this.listamedicina[index].cantidad = cantidad
      this.listamedicina[index].subtotal =  precio * cantidad

      this.total -= precio
    }
  }
}
