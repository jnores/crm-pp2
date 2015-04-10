package ungs.crm.controllerDesktop;

import java.util.List;

import org.junit.Test;

import ungs.crm.controllerDesktop.ConversationController;
import ungs.crm.entity.Conversation;
import ungs.crm.entity.Customer;

import junit.framework.TestCase;

public class ConversationControllerTest extends TestCase {
	
	@Test
	public void testConversationController()
	{
		assertNotNull(new ConversationController());
	}
	
	@Test
	public void testGetConversation()
	{
		ConversationController cc = new ConversationController();
		Customer customer = new Customer("G001","GOOGLE");
		
		List<Conversation> conversations = cc.getConversations(customer);
		assertEquals(conversations.size(),4);
	}

}
