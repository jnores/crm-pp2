package main;

import org.junit.Test;

import junit.framework.TestCase;

public class AppTest extends TestCase{
	
	@Test
	public void test() {
		System.out.println("Hola test 1");		
		assertTrue(new prueba_maven().get5()==5);
	}

}