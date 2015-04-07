package ungs.crm.model;

import java.util.ArrayList;

import ungs.crm.entity.Conversation;
import ungs.crm.entity.Customer;

public class ConversationModel {

	public ArrayList<Conversation> getDataConversations(Customer cliente)
	{
		return Data.obtenerContactos(cliente);
	}
}
