package ungs.crm.model;

import java.util.ArrayList;
import java.util.Observable;

import ungs.crm.dao.CustomerDao;
import ungs.crm.entity.Customer;
import ungs.crm.modelView.StatusModelView;

public class StateModel extends Observable {
	
	public void getState(String razonSocial)
	{ 
//		System.out.println("StateModel");
		StatusModelView smv =new StatusModelView();
		smv.razonesSociales = new ArrayList<String>();
		
		ArrayList<Customer> customers = (ArrayList)CustomerDao.getInstance().buscarPorNombre(razonSocial);
		
		if ( customers != null || customers.size() != 0 ) {
			if (customers.size() == 1 ) {
				smv.status = customers.get(0).getEstado().getNombre();
				smv.razonesSociales.add(customers.get(0).getRazonSocial());
			} else {
				smv.status = null;
				for (Customer customer : customers) {	
					smv.razonesSociales.add(customer.getRazonSocial());
				}
			}
		}
		
		setChanged();
		notifyObservers(smv);
	}
}
