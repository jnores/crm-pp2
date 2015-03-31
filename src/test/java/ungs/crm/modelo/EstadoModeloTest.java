package ungs.crm.modelo;

import junit.framework.TestCase;

import org.junit.Test;

public class EstadoModeloTest extends TestCase {
	@Test
	public void testEstado()
	{
		//Asumo que el estado 2 se asocia a sistemas Globales
		assertFalse(new EstadoModelo().getEstadoById(2).getNombre().equals("Rojo"));
		
		//Asumo que el estado 3 se asocia a google 
		assertTrue(new EstadoModelo().getEstadoById(3).getNombre().equals("Rojo"));
	}
	
	

}
