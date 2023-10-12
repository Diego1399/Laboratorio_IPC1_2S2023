import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'

import { usuario } from '../modelos/usuarios'

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
}
