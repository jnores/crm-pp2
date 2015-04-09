package ungs.crm.entity;

import junit.framework.TestCase;

import org.junit.Test;

import ungs.crm.entity.Conversation;

public class ConversationEntityTest extends TestCase{
	@Test
	public void testConversation()
	{
		Conversation conversation = new Conversation("Telefono","Descripcion1","01/01/2015");
		assertTrue(conversation.getTipoContacto().equals("Telefono") && 
					conversation.getDescripcion().equals("Descripcion1") && 
					conversation.getFecha_Hora().equals("01/01/2015"));
	}

}
