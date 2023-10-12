import express from "express";
import cors from "cors";
import { Router } from "express";
import morgan from "morgan";

const app = express();
const router = Router();

app.use(cors());
app.use(express.json())

export default app;

app.post('/login', function (req, res) {
    console.log("Es un post")
    console.log(req.body)
    res.send({status: "200", msg: "Consulta POST funcionando correctamente"})
})

app.get('/user', function(req, res) {
    console.log('Es un get')
    res.send({status: "200", msg: "Consulta GET funcionando correctamente"})
})

app.listen(8000, () => {
    console.log("Server on port 8000")
})