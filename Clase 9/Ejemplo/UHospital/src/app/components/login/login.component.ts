import { Component } from '@angular/core';

// Sevicios
import { ServicioService } from 'src/app/services/servicio.service'

// Modelos
import { usuario } from 'src/app/modelos/usuarios'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  name: any;
  apellido: any;
  password: any;

  usuario: usuario = new usuario();

  constructor(private usuarioService: ServicioService) {}

  login() {
    this.usuarioService.GetUsuarios().subscribe(data => {
      console.log(data)
    })
  }

  login2() {

    this.usuario.name = this.name;
    this.usuario.password = this. password
    console.log(this.usuario)

    this.usuarioService.PostUsuario(this.usuario).subscribe(data => {
      console.log(data)
    })
  }
}
