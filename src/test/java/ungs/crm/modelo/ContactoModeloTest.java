package ungs.crm.modelo;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import ungs.crm.entidades.Contacto;

public class ContactoModeloTest extends TestCase{
	
	@Test
	public void testObtenerContactos()
	{
		boolean clienteCorrecto = true;
		List<Contacto> conts = new ContactoModelo().obtenerContactos(1);
		for (Contacto c : conts)
			if (c.getIdCliente()!=1)
				clienteCorrecto=false;
		assertTrue(clienteCorrecto);
	}
	
	@Test
	public void testObtenerContCliInexistente()
	{
		assertTrue(new ContactoModelo().obtenerContactos(2).size()==0);
	}

}
