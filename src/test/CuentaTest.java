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
	/**
	 * Tests contemplanto saldo inicial a 0
	 */
	void testIngreso() {
		cuenta1.ingreso(500);
		assertEquals(500, cuenta1.getSaldo());
		
		cuenta1.ingreso(100);
		assertEquals(600, cuenta1.getSaldo());
		
		// ingreso negativo
		cuenta1.ingreso(-100);
		assertEquals(600, cuenta1.getSaldo());
		
	}

	@Test
	/**
	 * Tests contemplando saldo inicial a 0
	 */
	void testReintegro() {
		System.out.println(cuenta1.getSaldo());
		cuenta1.reintegro(500);
		assertEquals(-500, cuenta1.getSaldo());
		
		// caso límite
		cuenta1.reintegro(1);
		assertEquals(-500, cuenta1.getSaldo());
	
		// reintegro negativo
		cuenta1.reintegro(-100);
		assertEquals(-500, cuenta1.getSaldo());
		
	}

}
