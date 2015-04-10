package ungs.crm.entity;

import junit.framework.TestCase;

import org.junit.Test;

import ungs.crm.entity.Customer;


public class CustomerEntityTest extends TestCase {
	@Test
	public void testCliente()
	{
		Customer granix = new Customer("GR001","GRANIX SA");
		assertTrue(granix.getRazonSocial().equalsIgnoreCase("granix sa"));
	}
	

}
