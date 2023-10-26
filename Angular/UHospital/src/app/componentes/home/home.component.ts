import { Component, OnInit } from '@angular/core';
import { medicina } from 'src/app/modelos/medicina';
import { pedido } from 'src/app/modelos/pedido';

// Servicios
import { ServicioService } from 'src/app/services/servicio.service'

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit{


  medicina: medicina = new medicina;
  
  catalogo: medicina[] = [];

  listapedido: pedido[] = []

  total: number = 0;

  constructor(private service: ServicioService){}

  ngOnInit(): void {
    this.service.getMedicina().subscribe(data => {
      this.catalogo = data

      this.catalogo.forEach((e: medicina) => {
        const pedido = {
          id: e.id,
          name: e.name,
          descripcion: e.descripcion,
          precio: e.precio,
          cantidad: 0,
          subtotal: 0
        }

        this.listapedido.push(pedido)
      }) 
    }, err => {
      console.log(err)
    })
  }

  aumentarCantidad(index: number) {
    let actual = this.listapedido[index]
    let max = this.catalogo[index].cantidad

    if(actual.cantidad < max) {
      actual.cantidad++
      this.total += actual.precio
      this.listapedido[index]. subtotal = actual.precio * actual.cantidad
    }
  }

  disminuirCantidad(index:number) {
    let actual = this.listapedido[index]

    if(actual.cantidad > 0) {
      actual.cantidad--
      this.total -= actual.precio
      this.listapedido[index]. subtotal = actual.precio * actual.cantidad
    }
  }
}
