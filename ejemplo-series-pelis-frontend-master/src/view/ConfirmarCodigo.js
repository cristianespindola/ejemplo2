import React, {useState, useContext} from "react";
import '../App.css';
//import { useService } from '../service/UserService.js';
import { useHistory } from "react-router-dom";
import {UserContext} from "../context/UserContext.js";

function ConfirmarCodigo(props) {

    //const {verificarCodigo} = useService();
    const {push} = useHistory();
    const [codigo, setCodigo] = useState();
    const {user, setUser} = useContext(UserContext);

    const change = (event) => {
        setCodigo(event.target.value);
    }

    const validar = () => {
       /* let codigoVerificado ={};
        codigoVerificado.user = user.id;
        codigoVerificado.codigo = codigo;
        verificarCodigo(codigoVerificado)
        .then((usuerio) => {
            setUser(usuerio);
            push("/home");
        })*/
    }

    return(
        <>
        ConfirmarCodigo
        <div className="from-group">
            <label>Codigo</label>
            <input type="text" name="codigo" onChange={event => change(event)}></input>
            <button className="btn btn-primary" onClick={validar}>Validar</button>
        </div>
        </>
    );
}

export default ConfirmarCodigo;