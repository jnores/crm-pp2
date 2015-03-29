package main;

import org.junit.Test;

import ungs.crm.controlador.*;
import ungs.crm.modelo.*;
import ungs.crm.vista.*;
import junit.framework.TestCase;

public class Controlador extends TestCase {
	@Test
	public void testControladoresContacto()
	{
		ContactoControlador contControlador = new ContactoControlador(new ContactoVistaDesktop(),
											  new ContactoModelo());
		assertNotNull(contControlador);
	}
	
	@Test
	public void testControladoresCliente()
	{
		ClienteControlador cliControlador = new ClienteControlador(new ClienteVistaDesktop(),
				  new ClienteModelo());
		assertNotNull(cliControlador);
	}

}
