package clases;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class Pruebas {

	@Test
	public void test() {
		//fail("Not yet implemented");
		
		int numeros1[] = {1, 2, 3};
		int numeros2[] = {1, 2, 3};

		//assertEquals(101, miCoche.acelerar(100));
		//assertTrue(miCoche.multa());
		
		assertArrayEquals(numeros1, numeros2);;
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		
		int numeros1[] = {1, 2, 3};
		int numeros2[] = {1, 2, 5};

		//assertEquals(101, miCoche.acelerar(100));
		//assertTrue(miCoche.multa());
		
		assertArrayEquals(numeros1, numeros2);;
	}

}
