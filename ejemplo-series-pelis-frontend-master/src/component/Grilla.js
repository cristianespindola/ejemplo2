import React from "react";
import PeliculaCard from './PeliculaCard.js';

function Grilla(props){

    const peliculas = props.peliculas;
    
    return(
        <>
        <div className="row" id="grilla">
            {peliculas.map(pelicula => {
                return <PeliculaCard pelicula={pelicula}></PeliculaCard>
            })}
        </div>
        
        </>
    );
}

export default Grilla;