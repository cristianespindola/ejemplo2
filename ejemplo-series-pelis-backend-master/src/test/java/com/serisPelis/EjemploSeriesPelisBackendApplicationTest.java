package com.serisPelis;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class EjemploSeriesPelisBackendApplicationTest {

	@Autowired
    protected EntityManager em;
}
