import React, { useState, useEffect, useContext } from "react";
import '../App.css';
import { useHistory } from "react-router-dom";
import { GoogleLogin } from 'react-google-login';
import {UserContext} from "../context/UserContext.js";

function Header(props) {

    const {push} = useHistory();
    const {user} = useContext(UserContext);
    const clientId = "AIzaSyCrusSqr16Ji3DAGGtRV_gL7X38saPnGsg";

    useEffect(() => {
        console.log("que hay");
        console.log(user);
        return () => {}
    });

    const handleChange = () => {

    }
    const handleSubmit = () => {

    }

    const registrar = () => {
        push("/registrar");
    }

    const responseGoogle = (response) => {
        console.log(response);    
    }

    const errorResponseGoogle = (response) => {
        console.log('Error')
        console.log(response);
      }

    return(
        <>
        <div className="header">
            <nav className="navbar navbar-light bg-light">
                <ul>
                    <li>
                        <a className="texto" href="/home">Home</a>
                    </li>
                    <li>
                        <a className="texto" href="/series">Series</a>
                    </li>
                    <li>
                        <a className="texto" href="/peliculas">Peliculas</a>
                    </li>
                    <li>        
                        <div className="dropdown">
                            <p className="dropbtn">Menu</p>
                            <div class="dropdown-content">
                                <a href="/home">Home</a>
                            </div>
                        </div>
                    </li>
                </ul>
                <div className="form-inline">
                    <input
                    className="input-search"
                    placeholder="Search"
                    type="text"
                    onChange={event => handleChange(event)}
                    />
                    <button className="boton-search" type="submit" onClick={() => handleSubmit()}>Search</button>
                </div>

                <div className="accion">
                    <img src="./usuario.svg" alt="edit" className="icono" onClick={registrar}/>
                </div>

                <GoogleLogin
                    clientId={clientId}
                    buttonText="Login"
                    onSuccess={responseGoogle}
                    onFailure={errorResponseGoogle}
                    cookiePolicy={'single_host_origin'}
                />)
                 
            </nav>
        </div>
        </>
    );
}

export default Header;