import express from "express";
import cors from "cors";
import { Router } from "express";
import morgan from "morgan";

import {listaParciente, listadoctores, listaenfermeras, listamedicinas} from "./database/datos.js"

const app = express();
const router = Router();

app.use(cors());
app.use(express.json())

export default app;

app.post('/login', function (req, res) {
    const {correo, password} = req.body

    console.log(correo)
    console.log(password)

    const user = listaParciente.find(p => p.correo === correo && p.password == password)

    console.log(user)

    if(user) {
        res.send(JSON.stringify({msg: "Inicio sesion exitoso", data: true}))
    } else {
        res.send(JSON.stringify({msg: "Credenciales incorrectas", data: false}))
    }
})

app.get('/user', function(req, res) {
    console.log('Es un get')
    res.send({status: "200", msg: "Consulta GET funcionando correctamente"})
})


app.get('/paciente', function(req, res) {
    console.log(listaParciente)
    res.send({data: listaParciente})
})

app.post('/paciente', function(req, res) {
    const data =  req.body
    
    const nuevo = {
        id: listaParciente.length + 1,
        nombre: data.nombre,
        apellido: data.apellido,
        correo: data.correo,
        password: data.password,
        nac: data.nac
    }
    listaParciente.push(nuevo)
    
    res.send({msg: "Paciente agregado correctamente"})
})

app.get('/medicina', function(req, res) {
    console.log(listamedicinas)
    res.send(listamedicinas)
})

app.listen(8000, () => {
    console.log("Server on port 8000")
})