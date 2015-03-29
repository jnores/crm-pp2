package ungs.crm.modelo;

import junit.framework.TestCase;

import org.junit.Test;

import ungs.crm.entidades.Cliente;

public class ClienteModeloTest extends TestCase{
	
	@Test
	public void testGuardar()
	{
		//este está así nomás porque el guardar persistido aún no está implementado bien, pero igual anda
		new ClienteModelo().guardar(new Cliente());
	}
	

}
