package ungs.crm.entidades;

import junit.framework.TestCase;

import org.junit.Test;

public class EstadoEntidadesTest extends TestCase{	
	@Test
	public void testEstado()
	{
		Estado e = new Estado();
		e.setNombre("Rojo");
		e.setDescripcion("malo");
		assertTrue(e.getNombre().equalsIgnoreCase("Rojo") && e.getDescripcion().equals("malo"));
	}

}
