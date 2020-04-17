package ar.edu.unq.ejemplo2.service;

import java.util.List;

import ar.edu.unq.ejemplo2.model.Tutorial;

public interface TutorialService {

	List<Tutorial> get();
	
	void save(Tutorial employee);
}
