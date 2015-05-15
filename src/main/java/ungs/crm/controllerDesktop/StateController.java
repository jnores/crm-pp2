package ungs.crm.controllerDesktop;

import ungs.crm.entity.Customer;
import ungs.crm.entity.State;
import ungs.crm.model.StateModel;
import ungs.crm.viewDesktop.StateViewDesktop;

public class StateController implements InterfaceState {
	private StateViewDesktop stateView;
	private StateModel stateModel;
	
	public StateController()
	{
		this.stateModel = new StateModel();
//		this.stateView = new StateViewDesktop(this);
	}

	@Override
	public State getState(Customer customer) {
		return null;//this.stateModel.getState(customer);
	}
}
