package ungs.crm.entidades;

import junit.framework.TestCase;

import org.junit.Test;

public class ContactoEntidadesTest extends TestCase{
	@Test
	public void testContacto()
	{
		Contacto c = new Contacto();
		c.setDescripcion("prueba");
		c.setFecha_Hora("01/01/2015");
		c.setTipoContacto("Telefono");
		c.setIdCliente(1);
		assertTrue(c.getDescripcion().equals("prueba") && 
				   c.getFecha_Hora().equals("01/01/2015") && 
				   c.getTipoContacto().equals("Telefono") &&
				   c.getIdCliente() == 1);
	}

}
