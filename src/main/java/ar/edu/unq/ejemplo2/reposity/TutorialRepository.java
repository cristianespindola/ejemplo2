package ar.edu.unq.ejemplo2.reposity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.unq.ejemplo2.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
	List<Tutorial> findByNombre(String nombre);

}
