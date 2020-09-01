import Service from './personaService';

const server = 'http://localhost:8080/series-pelis';
const server1 = 'http://localhost:8080/persona';

export const usePeliculaService = () => {

  const traerTodas = (page) => {
    return new Promise((resolve, reject) => {
        server.get(`peliculas/${page}`)
            .then((response) => { resolve(response.data); })
            .catch((error) => { resolve(error)});

    });
  }
  
  const traerTodas1 = (id) => {
    return new Promise((resolve, reject) => {
      Service.get(`personas1/${id}`)
            .then((response) => { resolve(response.data); })
            .catch((e) => { 
              console.log("erroe1");
              console.log(e);
              console.log(e);
            });

    });
  }

  const traerTodas2 = (id) => {
    return new Promise((resolve, reject) => {
      Service.get(`personas/${id}`)
            .then((response) => { resolve(response.data); })
            .catch((e) => { 
              console.log("erroe2");
              console.log(e);
              console.log(e.response.status);
              console.log(e.response.data);
              console.log(e.response.data.message);
            });

    });
  }

  const traerTodas3 = (id) => {
    return new Promise((resolve, reject) => {
      Service.get(`personas3/${id}`)
            .then((response) => { resolve(response.data); })
            .catch((e) => { 
              console.log("erroe3");
              console.log(e);
              console.log(e.response.status);
              console.log(e.response.data);
              console.log(e.response.data.message);
            });

    });
  }
  return{traerTodas, traerTodas1, traerTodas2, traerTodas3}
}