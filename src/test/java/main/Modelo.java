package main;

import java.util.List;

import org.junit.Test;

import ungs.crm.entidades.Cliente;
import ungs.crm.entidades.Contacto;
import ungs.crm.modelo.ClienteModelo;
import ungs.crm.modelo.ContactoModelo;
import junit.framework.TestCase;

public class Modelo extends TestCase {
	
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
	public void testGuardar()
	{
		new ClienteModelo().guardar(new Cliente(""));
	}

}
