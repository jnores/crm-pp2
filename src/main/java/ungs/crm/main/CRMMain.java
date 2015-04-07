package ungs.crm.main;

//import java.security.Principal;
//
//import ungs.crm.controllerDesktop.ConversationController;
//import ungs.crm.controllerDesktop.StateController;
import ungs.crm.viewDesktop.PrincipalView;

public class CRMMain {
	//private ConversationController conversationControllerDesk;
	private PrincipalView principalView;
	
	
	public CRMMain()
	{
		//this.conversationControllerDesk = new ConversationController();
		//new StateController();
		this.principalView = new PrincipalView();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CRMMain();
	}

}
