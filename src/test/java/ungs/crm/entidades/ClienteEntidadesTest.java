package ungs.crm.entidades;

import junit.framework.TestCase;

import org.junit.Test;

import ungs.crm.entity.Customer;
import ungs.crm.entity.Estado;

public class ClienteEntidadesTest extends TestCase {
	@Test
	public void testCliente()
	{
		Customer c = new Customer();
		c.setId(1);
		c.setRazonSocial("prueba");
		c.setEstado(new Estado());
		assertTrue(c.getId()==1 &&
				   c.getRazonSocial().equals("prueba")
				   );
	}
	

}
