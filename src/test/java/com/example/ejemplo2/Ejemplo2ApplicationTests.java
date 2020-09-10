package com.example.ejemplo2;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ejemplo2ApplicationTests {

	@Test
	void testPrueba() {
		assertThat("").isEqualTo("");
	}

}
