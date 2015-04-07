package ungs.crm.model;

import ungs.crm.entity.Customer;
import ungs.crm.entity.State;

public class StateModel {
	public State getState(Customer customer)
	{
		return Data.getState(customer);
	}
}
