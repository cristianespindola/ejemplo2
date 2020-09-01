import React, {useState, useContext} from "react";
import '../App.css';
import { useHistory } from "react-router-dom";
import User from "../model/User.js";
import {UserContext} from "../context/UserContext.js";
//import { useService } from '../service/UserService.js';

function Registar(props) {

    //const {crearUsuario} = useService();
    const {user, setUser} = useContext(UserContext);
    const {userV, setUserV} = useState(new User());
    const {push} = useHistory();

    const registrar = () => {
     //   console.log(user);
     /*crearusuario(userV)
     .then((usuario) =>{
         
        setUser(usuario);
     })   */
     console.log("que hay");
     console.log(userV);
     console.log(user);
     
     setUser(userV);
     push("/home")
    }

    const change = (event) => {
        const currentUser = user;
        setUser({ ...currentUser, [event.target.name]: event.target.value });
    }

    return(
        <>
        <div>
            <form>
                <div className="from-group">
                    <label>Nombre</label>
                    <input type="text" name="nombre" onChange={event => change(event)}></input>
                </div>
                <div className="from-group">
                    <label for="exampleInputEmail1">Email</label>
                    <input type="email" name="email" id="email" onChange={event => change(event)}></input>
                </div>
                <div className="from-group">
                    <label for="exampleInputPassword1">Password</label>
                    <input type="password" name="password" onChange={event => change(event)}/>
                </div>
                <button className="btn btn-primary" onClick={registrar}>Registar</button>
            </form>
        </div>
        </>
    );
}

export default Registar;