package ungs.crm.model;

import java.util.Observable;
import java.util.Observer;

public class Model extends Observable {
	StateModel statusModel;
	public Model() {
		statusModel=new StateModel();
	}	

	public void getState(String razonSocial) {
		System.out.println("Model");
		statusModel.getState(razonSocial);
		
	}

	public void addStatusObserver(Observer observer) {
		statusModel.addObserver(observer);
	}

}
