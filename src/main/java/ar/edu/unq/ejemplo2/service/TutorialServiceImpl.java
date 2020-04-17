package ar.edu.unq.ejemplo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.unq.ejemplo2.model.Tutorial;
import ar.edu.unq.ejemplo2.reposity.TutorialRepository;

@Service
public class TutorialServiceImpl implements TutorialService {

	@Autowired
	private TutorialRepository dao;
	
	@Transactional
	@Override
	public List<Tutorial> get() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Transactional
	@Override
	public void save(Tutorial employee) {
		// TODO Auto-generated method stub
		dao.save(employee);
	}

}
