package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gestionCuentas.Cuenta;

class CuentaTest {

	Cuenta cuenta1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		cuenta1 = new Cuenta();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	
	@Test
	void testIngreso() {
		cuenta1.ingreso(500);
		assertEquals(500, cuenta1.getSaldo());
	}

	@Test
	void testReintegro() {
		cuenta1.reintro(500);
		assertEquals(-500, cuenta1.getSaldo());
	}

}
