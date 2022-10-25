package Banco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuentaTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		Cuenta.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngreso(double x) {
		Cuenta.ingreso(500);
		assertEquals(500,Cuenta.getSaldo());
	}
	@Test
	void testReintegro(double x) {
		Cuenta.reintegro(200);
		assertEquals(-200,Cuenta.getSaldo());
	}
}
