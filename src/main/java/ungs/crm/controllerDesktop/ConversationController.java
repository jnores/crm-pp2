package ungs.crm.controllerDesktop;

import java.util.List;

import ungs.crm.entity.Conversation;
import ungs.crm.entity.Customer;
import ungs.crm.model.ConversationModel;
import ungs.crm.viewDesktop.ContactoVistaDesktop;

public class ConversationController implements InterfaceConversation {
	private ContactoVistaDesktop vistaDesktop;
	//private Conversation conversation;
	private ConversationModel conversationModel;
	
	public ConversationController()
	{
		this.conversationModel = new ConversationModel();
		//this.conversation = new Conversation();
		this.vistaDesktop = new ContactoVistaDesktop(this);
	}

	@Override
	public List<Conversation> getConversations(Customer customer) {
		// TODO Auto-generated method stub
		return this.conversationModel.obtenerContactos(customer);
	}

}
