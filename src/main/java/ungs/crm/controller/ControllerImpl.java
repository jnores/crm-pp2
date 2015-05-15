package ungs.crm.controller;

import java.util.Observer;

import ungs.crm.entity.Customer;
import ungs.crm.entity.State;
import ungs.crm.model.Model;

public class ControllerImpl implements Controller {
	Model modelo;
	
	public ControllerImpl(Model modelo){
		this.modelo=modelo;
	}
	@Override
	public void getState(String razonSocial) {
//		System.out.println("Controller Impl");
		this.modelo.getState(razonSocial);
	}

	@Override
	public void addStatusObserver(Observer observer) {
		this.modelo.addStatusObserver(observer);
		
	}
	
}
