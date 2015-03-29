package ungs.crm.entidades;

import junit.framework.TestCase;

import org.junit.Test;

public class EstadoEntidadesTest extends TestCase{	
	@Test
	public void testEstado()
	{
		Estado e = new Estado();
		e.setId(1);
		e.setDescripcion("Rojo");
		assertTrue(e.getId()==1 && e.getDescripcion().equals("Rojo"));
	}

}
