package ungs.crm.main;

import ungs.crm.controllerDesktop.ConversationController;

public class CRMMain {
	private ConversationController conversationControllerDesk;
	
	public CRMMain()
	{
		this.conversationControllerDesk = new ConversationController();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CRMMain();
	}

}
