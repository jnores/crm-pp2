package MVC_NEW.copy;

//import ungs.crm.entity.Customer;
import ungs.crm.entity.State;
//import ungs.crm.model.Data;

public class Model extends java.util.Observable {
	private State state;
	
	public void setState(String customer,String state)
	{
		//this.state = Data.getState(c);
		setChanged();
		notifyObservers(state);
	}
}
