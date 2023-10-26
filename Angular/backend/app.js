import express from 'express';
import cors from 'cors';

import { listasPaciente, listaMedicina } from './datos/listas.js'

const app = express();

app.use(cors());
app.use(express.json());

export default app;

app.get('/obtener_paciente', function(req, res) {
    console.log('Es un get')
    let usuario = {
        nombre: "Diego",
        correo: "diego@gmail.com",
    }
    res.send(usuario)
})

app.post('/registrar_paciente', function(req, res) {
    const data = req.body
    const nuevo = {
        id: listasPaciente.length + 1,
        nombre: data.nombre,
        apellido: data.apellido,
        correo: data.correo,
        password: data.password,
        nac: data.nac
    }

    listasPaciente.push(nuevo)
    res.send(JSON.stringify({msg: "Paciente registrado correctamente"}))
})

app.post('/login', function(req, res) {
    const {correo, password} = req.body

    console.log(correo)
    console.log(password)

    const usuario = listasPaciente.find(p => p.correo === correo && p.password === password)

    console.log(usuario)

    if(usuario) {
        res.send(JSON.stringify({msg: "Inicio sesion exitoso", data: true}))
    } else{
        res.send(JSON.stringify({msg: "Credenciales incorrectas", data: false}))
    }

})

app.get('/paciente', function(req, res) {
    console.log(listasPaciente)
    res.send(listasPaciente)
})

app.get('/medicinas', function(req, res) {
    res.send(listaMedicina)
})



app.listen(8000, () => {
    console.log('Server on port 8000')
})