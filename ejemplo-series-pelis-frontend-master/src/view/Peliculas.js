import React, { useState, useEffect } from "react";
import Header from '../component/Header.js';
import { usePeliculaService } from '../service/PeliculaService.js';
import Grilla from '../component/Grilla.js';
import PaginaError from '../component/PaginaError.js';
import Pelicula from '../Pelicula.json';
import '../App.css'

function Peliculas(props){

    const {traerTodas, traerTodas1, traerTodas2, traerTodas3} = usePeliculaService();
    const p = Pelicula;
    const [peliculas, setPeliculas] = useState([]);
    const [cargandoPagina, setCargandoPagina] = useState(true);
    const [obtuvoRespuesta, seetObtuvoRespuesta] = useState(true);
    const [error, setError] = useState();

    useEffect(() => {
        buscarPeliculas();
        return () => {}});

    const buscarPeliculas = () => {
        /*setCargandoPagina(true);
        traerTodas(0)
        .then((response) => {
            setPeliculas(response.content);
            setCargandoPagina(false);
        })
        .catch((message) => setError(message))*/
        traerTodas1(3)
        .then((response) => {
            console.log("then1");
            console.log(response);
        })
        .catch((e) => {
            console.log("erroe1");
            console.log(e);
            console.log(e.response);
        })

        traerTodas2(3)
        .then((response) => {
            console.log("then2");
            console.log(response);
        })
        .catch((e) => {
            console.log("erroe2");
            console.log(e);
            console.log(e.response);
        })

        traerTodas3(3)
        .then()
    }

    const obtenerRespuesta = () => {
        return(
            <div className="grilla-Responsive col-10">
                {!obtuvoRespuesta? <Grilla peliculas={p}/>: <PaginaError error={error}/>}
            </div>
        )
    }

    const esperarRespuesta = () => {
        return(
            <button class="btn btn-primary" type="button" disabled>
                <span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span>
                Loading...
            </button>
        )
    }

    return(
        <>
        <Header/>
        <div >
            {!cargandoPagina? obtenerRespuesta(): esperarRespuesta()}
        </div>
        </>
    );
}

export default Peliculas;