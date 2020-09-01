import React from 'react';
import ReactDOM from 'react-dom';
import { BrowserRouter, Route, Switch } from "react-router-dom";
import './index.css';
import './series-pelis.css';
import Pelicula from './view/Pelicula.js';
import Series from './view/Series.js';
import Peliculas from './view/Peliculas.js';
import Registrar from './view/Registrar.js';
import ConfirmarCodigo from './view/ConfirmarCodigo.js';
import Home from './view/Home.js';
import * as serviceWorker from './serviceWorker';
import {UserProvider} from "./context/UserContext.js";

ReactDOM.render(
  <UserProvider>
    <BrowserRouter forceRefresh={true}>
      <Switch>
        <Route path="/confirmar-codigo" render={props => <ConfirmarCodigo {...props} />} />
        <Route path="/registrar" render={props => <Registrar {...props} />} />
        <Route path="/pelicula/:id" render={props => <Pelicula {...props} />} />
        <Route path="/series" render={props => <Series {...props} />} />
        <Route path="/peliculas" render={props => <Peliculas {...props} />} />
        <Route path="/home" render={props => <Home {...props} />} />
        <Route path="/" render={props => <Home {...props} />} />
      </Switch>
    </BrowserRouter>
  </UserProvider>,
  document.getElementById('root')
);

// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
