package com.serisPelis;

import java.time.LocalDate;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.serisPelis.model.Pelicula;
import com.serisPelis.repository.PeliculaRepository;
import com.serisPelis.utils.ConversorDeArchivos;

@SpringBootApplication
public class EjemploSeriesPelisBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploSeriesPelisBackendApplication.class, args);
	}
	
	@Bean
    ApplicationRunner applicationRunner(PeliculaRepository peliDao) {
		return args -> {
			String a_clockwork_orange = ConversorDeArchivos.convertirABase64("imagenes/A-Clockwork-Orange.jpg");
			Pelicula pelicula1 = new Pelicula();
			pelicula1.setTitulo("A Clockwork Orange");
			pelicula1.setCategorias("Drama");
			pelicula1.setClasificacion("+18");
			pelicula1.setFechaDeEstreno(LocalDate.now());
			pelicula1.setDirectores("Stanley Kubrick");
			pelicula1.setActores("Malcolm McDowell, Patrick Magee, Michael Bates"); 
			pelicula1.setLinkYT("https://www.youtube.com/embed/SPRzm8ibDQ8");
			pelicula1.setPortada(a_clockwork_orange);
			peliDao.save(pelicula1);
		};
		
	}

}
