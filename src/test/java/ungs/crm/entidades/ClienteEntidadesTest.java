package ungs.crm.entidades;

import junit.framework.TestCase;

import org.junit.Test;

public class ClienteEntidadesTest extends TestCase {
	@Test
	public void testCliente()
	{
		Cliente c = new Cliente();
		c.setId(1);
		c.setRazonSocial("prueba");
		c.setEstado(new Estado());
		assertTrue(c.getId()==1 &&
				   c.getRazonSocial().equals("prueba")
				   );
	}
	

}
