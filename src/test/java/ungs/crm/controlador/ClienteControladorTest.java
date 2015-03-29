package ungs.crm.controlador;

import org.junit.Test;

import ungs.crm.modelo.ClienteModelo;
import ungs.crm.vista.ClienteVistaDesktop;
import junit.framework.TestCase;

public class ClienteControladorTest extends TestCase {
	@Test
	public void testControladoresCliente()
	{
		ClienteControlador cliControlador = new ClienteControlador(new ClienteVistaDesktop(),
				  new ClienteModelo());
		assertNotNull(cliControlador);
	}

}
