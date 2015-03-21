package main;

import junit.framework.TestCase;
//import main.prueba_maven;

import org.junit.Test;


public class prueba extends TestCase{
	@Test
	public void test() {
		System.out.println("Hola test 1");
		//prueba_maven pm =new prueba_maven(); 
		assertEquals(5,5);
	}

}
