import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

import { usuario } from '../modelos/usuarios'
import { medicina } from '../modelos/medicina';

@Injectable({
  providedIn: 'root'
})
export class ServicioService {

  constructor(private http: HttpClient) { }
  private UrlBackend = 'http://localhost:8000';

  GetUsuarios() {
    console.log(`${this.UrlBackend}/user`)
    return this.http.get<usuario>(`${this.UrlBackend}/user`);
  }

  PostUsuario(user: any) {
    console.log(`${this.UrlBackend}/login`)
    const options = {responseType: 'text' as 'json'}; 
    return this.http.post<any>(`${this.UrlBackend}/login`, user, options);
  }

  GetMedicinas() {
    return this.http.get<medicina[]>(`${this.UrlBackend}/medicina`);
  }
}
