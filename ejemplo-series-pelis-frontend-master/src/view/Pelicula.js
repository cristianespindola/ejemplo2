import React, { useState, useEffect } from "react";
import Header from '../component/Header.js';
//import { useService } from '../service/PeliculaService.js';
//import PaginaError from '../component/PaginaError.js';
import '../App.css'
import Peliculas from '../Pelicula.json';
import { Row, Card } from "reactstrap";

function Pelicula(props){

    // const {traerPeliculaId} = useService();
//    const id = props.id;
    const peli = Peliculas[0];
  /*  const [pelicula, setPelicula] = useState();
    const {cargandoPagina, setCargandoPagina} = useState(true);
    const {obtuvoRespuesta, seetObtuvoRespuesta} = useState(true);
    const {error, setError} = useState();
*/
    useEffect(() => {
       // buscarPelicula();
        return () => {}});

    /*const buscarPelicula = () => {
        setCargandoPagina(true);
        traerPeliculaId(id)
        .then((response) => {
            setPelicula(response.content);
            setCargandoPagina(false);
        })
        .catch((message) => setError(message))
    }*/

    return(
        <>
        <Header/>
        <div className="p-3 mb-2 bg-info text-white" id="headerPelicula">
          <h2>Pelicula - {peli.titulo}</h2>
        </div>
        <div className="container-video">
            <Row>
                <Card>
                    <iframe className="video"
                    height="200"
                    width="300"
                    src={peli.linkYT}
                    frameBorder="0"
                    allow="encrypted-media"
                    allowFullScreen
                    title="vidtitle"
                    />

                </Card>
            </Row>

        </div>
        </>
    );
}

export default Pelicula;