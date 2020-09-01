import React from "react";
import { useHistory } from "react-router-dom";

function PeliculaCard(props){

    const {push} = useHistory();
    const pelicula = props.pelicula;

    const redictPeli = (event) => {
        push("/pelicula/" +pelicula.id)
    }
    return(
        <div className="col-sm-4">
            <img className="card-img" src={pelicula.portada}/>
            <div className="card-body">
                <h3 className="card-title">{pelicula.titulo}</h3>
            </div>
            <button class="btn btn-primary btn-lg" href="###" type="button" key={pelicula.id} onClick={redictPeli}>Información</button>
            
        </div>
    );
}

export default PeliculaCard;