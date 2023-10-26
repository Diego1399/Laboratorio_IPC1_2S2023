import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { usuario } from '../modelos/usuario';
import { medicina } from '../modelos/medicina';

@Injectable({
  providedIn: 'root'
})
export class ServicioService {

  constructor(private http: HttpClient) { }
  private UrlBackend = 'http://localhost:8000'

  registrarPaciente(user: any) {
    console.log(`${this.UrlBackend}/registrar_paciente`)
    const options = {responseType: 'text' as 'json'}
    return this.http.post<any>(`${this.UrlBackend}/registrar_paciente`, user, options)
  }

  getPaciente() {
    console.log(`${this.UrlBackend}/obtener_paciente`)
    return this.http.get<usuario>(`${this.UrlBackend}/obtener_paciente`)
  }

  iniciarSesion(obj: any) {
    return this.http.post<any>(`${this.UrlBackend}/login`, obj)
  }

  getMedicina() {
    return this.http.get<medicina[]>(`${this.UrlBackend}/medicinas`)
  }

}
