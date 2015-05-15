package ungs.crm.main;

import ungs.crm.controller.Controller;
import ungs.crm.controller.ControllerImpl;
import ungs.crm.dao.CustomerDao;
import ungs.crm.dao.StatusDao;
import ungs.crm.entity.Customer;
import ungs.crm.entity.State;
import ungs.crm.model.Model;
import ungs.crm.viewConsole.StateViewConsole;
//import java.security.Principal;
//
//import ungs.crm.controllerDesktop.ConversationController;
//import ungs.crm.controllerDesktop.StateController;
import ungs.crm.viewDesktop.PrincipalView;

public class CRMMain {
	//private ConversationController conversationControllerDesk;
	private PrincipalView principalView;
	
	private static void cargarEstados(){
		StatusDao sd = StatusDao.getInstance();

			State estadoOK= new State("Verde","bien");
		sd.guardar(estadoOK);	
			
			State estadoWrong= new State("Amarillo","masomenos");
		sd.guardar(estadoWrong);
			
			State estadoBad= new State("Rojo","mal");
		sd.guardar(estadoBad);
	}
	
	private static void cargarClientes(){
		CustomerDao cd = CustomerDao.getInstance();
		
			Customer google = new Customer("GO0001","google");
			google.setEstado(StatusDao.getInstance().getStateByID(3));
		cd.guardar(google);
		Customer kukiku = new Customer("ku0001","kukiku soft S.R.L");
			kukiku.setEstado(StatusDao.getInstance().getStateByID(1));
		cd.guardar(kukiku);
	
		
	} 
	private static void cargarDatos(){
		cargarEstados();
		
		cargarClientes();
	}
	
	
	public CRMMain()
	{
		//cargarDatos();
		//this.conversationControllerDesk = new ConversationController();
		//new StateController();
		Model model = new Model();
		
		Controller controller = new ControllerImpl(model);
		controller.addStatusObserver(new StateViewConsole());
		this.principalView = new PrincipalView(controller);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CRMMain();
	}

}
