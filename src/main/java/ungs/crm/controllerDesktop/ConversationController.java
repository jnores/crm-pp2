package ungs.crm.controllerDesktop;

import java.util.List;

import ungs.crm.entity.Conversation;
import ungs.crm.entity.Customer;
import ungs.crm.model.ConversationModel;
import ungs.crm.viewDesktop.ConversationViewDesktop;

public class ConversationController implements InterfaceConversation {
	private ConversationViewDesktop viewDesktop;
	//private Conversation conversation;
	private ConversationModel conversationModel;
	
	public ConversationController()
	{
		this.conversationModel = new ConversationModel();
		//this.conversation = new Conversation();
		this.viewDesktop = new ConversationViewDesktop(this);
	}

	@Override
	public List<Conversation> getConversations(Customer customer) {
		return this.conversationModel.getDataConversations(customer);
	}

}
