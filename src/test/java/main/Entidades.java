package main;

import org.junit.Test;

import ungs.crm.entidades.*;
import junit.framework.TestCase;

public class Entidades extends TestCase {
	@Test
	public void testCliente()
	{
		Cliente c = new Cliente("prueba");
		c.setId(1);
		c.setRazon_social("prueba");
		assertTrue(c.getId()==1 && c.getRazon_social().equals("prueba"));
	}
	
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
