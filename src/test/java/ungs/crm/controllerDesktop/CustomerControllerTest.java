package ungs.crm.controllerDesktop;

import org.junit.Test;

import ungs.crm.controllerWeb.CustomerController;
//import ungs.crm.controller.ClienteControlador;
//import ungs.crm.model.ClienteModelo;
//import ungs.crm.view.ClienteVistaDesktop;
import junit.framework.TestCase;

public class CustomerControllerTest extends TestCase {
	@Test
	public void testCustomerController()
	{
		CustomerController customerController = new CustomerController();
		assertNotNull(customerController);
	}

}
