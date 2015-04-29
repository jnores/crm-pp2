package ungs.crm.controllerDesktop;

import org.junit.Test;

import ungs.crm.controllerDesktop.StateController;
import ungs.crm.entity.Customer;
import junit.framework.TestCase;

public class StateControllerTest extends TestCase{
	
	@Test
	public void testStateController()
	{
		assertNotNull(new StateController());
	}


	@Test
	public void testStateRojo()
	{
		
		StateController sc = new StateController();
		Customer google = new Customer("G0001","GOOGLE");
		assertEquals(sc.getState(google).getNombre(),"ROJO");
	}
	
	@Test
	public void testStateVerde()
	{
		StateController sc = new StateController();
		Customer sistemGlobal = new Customer("SG001","SISTEMAS GLOBALES SA");
		assertEquals(sc.getState(sistemGlobal).getNombre(), "VERDE");
	}
	
	@Test
	public void testStateClienteInexistente()
	{
		StateController sc = new StateController();
		Customer granix = new Customer("GR001","GRANIX SA");
		assertNull(sc.getState(granix));
	}
}
