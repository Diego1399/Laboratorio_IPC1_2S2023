import { Component, OnInit, Input } from '@angular/core';

// Servicios
import { ServicioService } from 'src/app/services/servicio.service'

// Modelo
import { usuario } from 'src/app/modelos/usuario'

@Component({
  selector: 'app-perfilpaciente',
  templateUrl: './perfilpaciente.component.html',
  styleUrls: ['./perfilpaciente.component.css']
})
export class PerfilpacienteComponent implements OnInit {
  
  @Input() dato: any;

  nombrePaciente: any;
  correoPaciente: any; 

  constructor(private service: ServicioService){}

  ngOnInit(): void {

    this.service.getPaciente().subscribe(data => {
      console.log(data)
      this.nombrePaciente = data.nombre
      this.correoPaciente = data.correo
    })
  }  
}
