package Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {
	static Cuenta cuenta1;
	static Cuenta cuenta2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta1 = new Cuenta("12345","Santi",50.0);
		cuenta2 = new Cuenta("67890","Pepe",0.0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	/*
	@Test
	void testIngreso() {
		cuenta1.ingreso(500.0);
		assertEquals(550,cuenta1.getSaldo());
	}
	@Test
	void testReintegro() {
		cuenta1.reintegro(200.0);
		assertEquals(350,cuenta1.getSaldo());
	}
	*/
	@Test
	void testMovimientos() {
		cuenta1.reintegro(200.0);
		cuenta2.reintegro(350.0);
		cuenta1.ingreso(100.0);
		cuenta2.reintegro(200.0);
		cuenta2.reintegro(150.0);
		cuenta1.reintegro(200.0);
		cuenta2.ingreso(50.0);
		cuenta2.reintegro(100.0);
		assertEquals(-450.0,cuenta2.getSaldo());
		assertEquals(-250.0,cuenta1.getSaldo());
	}
}
