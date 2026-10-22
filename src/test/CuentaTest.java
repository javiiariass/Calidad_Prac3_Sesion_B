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
		System.out.println("--------------- inicio testIngreso ---------------");
		cuenta1.ingreso(500);
		assertEquals(500, cuenta1.getSaldo());
		
		cuenta1.ingreso(100);
		assertEquals(600, cuenta1.getSaldo());
		
		// ingreso negativo
		cuenta1.ingreso(-100);
		assertEquals(600, cuenta1.getSaldo());
		
		System.out.println("--------------- fin testIngreso ---------------\n\n");
	}

	@Test
	/**
	 * Tests contemplando saldo inicial a 0
	 */
	void testReintegro() {
		System.out.println("--------------- inicio testReintegro ---------------");
		System.out.println(cuenta1.getSaldo());
		cuenta1.reintegro(500);
		assertEquals(-500, cuenta1.getSaldo());
		
		// caso límite
		cuenta1.reintegro(1);
		assertEquals(-500, cuenta1.getSaldo());
	
		// reintegro negativo
		cuenta1.reintegro(-100);
		assertEquals(-500, cuenta1.getSaldo());
		
		System.out.println("--------------- fin testReintegro ---------------\n\n");
	}
	
	
	@Test
	/**
	 * Test 0014
	 * Caso de prueba visto en clase
	 */
	void test0014() {
		System.out.println("--------------- inicio test0014 ---------------");
		
		Cuenta cuenta45 = new Cuenta("12345","Pepe", 50);
		Cuenta cuenta90 = new Cuenta("67890", "Juan", 0);
		
		assertEquals(50, cuenta45.getSaldo());
		assertEquals(0, cuenta90.getSaldo());
		
		cuenta45.reintegro(200);
		cuenta90.reintegro(350);
		cuenta45.ingreso(100);
		cuenta90.reintegro(200);
		cuenta90.reintegro(150);
		cuenta45.reintegro(200);
		cuenta90.ingreso(50);
		cuenta90.reintegro(100);

		
		assertEquals(-250, cuenta45.getSaldo());
		assertEquals(-450, cuenta90.getSaldo());
		
		System.out.println("--------------- fin test0014 ---------------\n\n");
	}

}
