package ungs.crm.controlador;

import org.junit.Test;

import ungs.crm.modelo.ContactoModelo;
import ungs.crm.vista.ContactoVistaDesktop;
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
