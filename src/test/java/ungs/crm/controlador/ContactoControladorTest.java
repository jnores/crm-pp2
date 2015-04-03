package ungs.crm.controlador;

import org.junit.Test;

import ungs.crm.controller.ContactoControlador;
import ungs.crm.model.ContactoModelo;
import ungs.crm.view.ContactoVistaDesktop;
import junit.framework.TestCase;

public class ContactoControladorTest extends TestCase {
	
	@Test
	public void testControladoresContacto()
	{
		ContactoControlador contControlador = new ContactoControlador(new ContactoVistaDesktop(),
											  new ContactoModelo());
		assertNotNull(contControlador);
	}
	

}
