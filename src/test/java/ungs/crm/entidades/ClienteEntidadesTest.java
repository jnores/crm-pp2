package ungs.crm.entidades;

import junit.framework.TestCase;

import org.junit.Test;

public class ClienteEntidadesTest extends TestCase {
	@Test
	public void testCliente()
	{
		Cliente c = new Cliente();
		c.setId(1);
		c.setRazon_social("prueba");
		c.setIdEstado(1);
		assertTrue(c.getId()==1 &&
				   c.getRazon_social().equals("prueba") &&
				   c.getIdEstado()==1);
	}
	

}
