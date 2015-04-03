package ungs.crm.controlador;

import org.junit.Test;

import ungs.crm.controller.ClienteControlador;
import ungs.crm.model.ClienteModelo;
import ungs.crm.view.ClienteVistaDesktop;
import junit.framework.TestCase;

public class ClienteControladorTest extends TestCase {
	@Test
	public void testControladoresCliente()
	{
		ClienteControlador cliControlador = new ClienteControlador(new ClienteVistaDesktop(),
				  ClienteModelo.getInstance());
		assertNotNull(cliControlador);
	}

}
