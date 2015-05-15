package ungs.crm.controller;

import java.util.Observer;

public interface Controller {
	
	public void getState(String razonSocial);

	public void addStatusObserver(Observer observer);

}
