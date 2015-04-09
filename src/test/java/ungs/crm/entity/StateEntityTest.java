package ungs.crm.entity;

import junit.framework.TestCase;

import org.junit.Test;



public class StateEntityTest extends TestCase{	
	@Test
	public void testEstadoConstructor()
	{
		State s = new State("Rojo","malo malo");
		s.setNombre("Verde");
		assertTrue(s.getNombre().equalsIgnoreCase("Rojo") && s.getDescripcion().equals("malo malo"));
	}
	
	@Test
	public void testEstadoName()
	{
		State s = new State("Rojo","malo malo");
		s.setNombre("Verde");
		assertTrue(s.getNombre().equalsIgnoreCase("Verde"));
	}
	
	@Test
	public void testEstadoDescription()
	{
		State s = new State("Rojo","malo malo");
		s.setDescripcion("malo");
		assertTrue( s.getDescripcion().equals("malo"));
	}
	
	@Test
	public void testEstadoSetters()
	{
		State s = new State("Rojo","malo malo");
		s.setNombre("Amarillo");
		s.setDescripcion("medio");
		assertTrue(s.getNombre().equalsIgnoreCase("Amarillo") && s.getDescripcion().equals("medio"));
	}
}
