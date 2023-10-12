import { Component } from '@angular/core';

// Sevicios
import { ServicioService } from 'src/app/services/servicio.service'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor(private usuarioService: ServicioService) {}

  login() {
    this.usuarioService.GetUsuarios().subscribe(data => {
      console.log(data)
    })
  }
}
