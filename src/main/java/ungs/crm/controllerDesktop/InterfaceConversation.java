package ungs.crm.controllerDesktop;

import java.util.List;

import ungs.crm.entity.Conversation;
import ungs.crm.entity.Customer;

public interface InterfaceConversation {
	
	public List<Conversation> getConversations(Customer customer);

}
