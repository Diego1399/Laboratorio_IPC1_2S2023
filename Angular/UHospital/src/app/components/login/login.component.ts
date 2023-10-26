import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router} from '@angular/router'

// Sevicios
import { ServicioService } from 'src/app/services/servicio.service'

// Modelos
import { usuario } from 'src/app/modelos/usuarios'

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent{

  correo: any;
  password: any;

  usuario: usuario = new usuario();
  mensaje: any;

  constructor(private service: ServicioService, private router:Router) {}

 
  login() {
    this.service.GetUsuarios().subscribe(data => {
      console.log(data)
    })
  }

  login2() {

    this.usuario.correo = this.correo;
    this.usuario.password = this. password
    console.log(this.usuario)

    this.service.PostUsuario(this.usuario).subscribe(data => {
      let res = JSON.parse(data)
      this.mensaje = res.msg

      if(res.data == true) {
        this.router.navigate(['/home'])
      }
    })
  }
}
