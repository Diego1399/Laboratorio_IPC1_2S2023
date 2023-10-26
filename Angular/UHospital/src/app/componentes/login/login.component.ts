import { Component } from '@angular/core';
import { Router } from '@angular/router'

// Servicios
import { ServicioService } from 'src/app/services/servicio.service'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})

export class LoginComponent {

  correo: any;
  password: any;
  mensaje: any;

  constructor(private service: ServicioService, private router: Router){}

  logearse() {
    const user = {
      correo: this.correo,
      password: this.password
    }

    this.service.iniciarSesion(user).subscribe(data => { 
      this.mensaje = data.msg

      if(data.data == true) {
        this.router.navigate(['/home'], {queryParams: {body: JSON.stringify(data.user)}})
      }

    }, err => {
      console.log(err)
    })
  }
}
