import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

import { InicioComponent } from './componentes/inicio/inicio.component'
import { LoginComponent } from './componentes/login/login.component'
import { RegistroComponent } from './componentes/registro/registro.component'
import { PerfilpacienteComponent } from './componentes/perfilpaciente/perfilpaciente.component'
import { HomeComponent } from './componentes/home/home.component'

const routes: Routes = [
  {
    path: '',
    component: InicioComponent
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'register',
    component: RegistroComponent
  },
  {
    path: 'perfil',
    component: PerfilpacienteComponent
  },
  {
    path: 'home',
    component: HomeComponent
  }
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
