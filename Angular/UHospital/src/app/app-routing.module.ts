import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

// Mis Componentes
import { InicioComponent } from './components/inicio/inicio.component'
import { LoginComponent } from './components/login/login.component'
import { HomeComponent } from './components/home/home.component'

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
        path: 'home',
        component: HomeComponent
    }
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
  })
  export class AppRoutingModule { }  