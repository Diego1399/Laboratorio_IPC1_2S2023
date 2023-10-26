import { Component } from '@angular/core';

// Servicios
import { ServicioService } from 'src/app/services/servicio.service'


@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent {

  nombre:any;
  correo:any;
  password:any;
  apellido:any;
  nac:any;

  mensaje: String = "";

  constructor(private service: ServicioService){}

  enviar() {

    const nuevo = {
      nombre: this.nombre,
      apellido: this.apellido,
      correo: this.correo,
      pasword: this.password,
      nac: this.nac
    }

    

    this.service.registrarPaciente(nuevo).subscribe(data => {
      let res = JSON.parse(data)
      this.mensaje = res.msg

    }, err => {
      console.log(err)
    })

  }

}
