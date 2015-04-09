package ungs.crm.model;

import junit.framework.TestCase;

import org.junit.Test;

import ungs.crm.entity.Customer;
import ungs.crm.entity.State;

public class StateModelTest extends TestCase {
	@Test
	public void testEstadoClienteInexistente()
	{
		//Cliente inexistente - no existe estado para el mismo
		StateModel stateModel = new StateModel();
		Customer granix = new Customer("GR001", "GRANIX SA");
		assertNull(stateModel.getState(granix));		
	}
	
	@Test
	public void testClienteEstadoNoRojo()
	{
		Customer globant = new Customer("GL001","SISTEMAS GLOBALES SA");
		State stateGlobant = new StateModel().getState(globant);
		assertFalse(stateGlobant.getNombre().equals("ROJO"));
	}
	
	@Test
	public void testClienteEstadoRojo()
	{
		Customer google = new Customer("G001","GOOGLE");
		assertTrue(new StateModel().getState(google).getNombre().equals("ROJO"));
	}
	
	

}
