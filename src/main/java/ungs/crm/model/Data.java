package ungs.crm.model;

import java.util.ArrayList;

import ungs.crm.entity.Conversation;
import ungs.crm.entity.Customer;
import ungs.crm.entity.State;

public class Data {
//	public Conversation obtenerContacto(int idCliente,
//			int idContacto)
//	{
////		Conversation ret = new Conversation();
////		if (idContacto == 2 && idCliente == 1)
////			ret = null;
////		return ret;
//		return null;
//	}
	
	public static ArrayList<Conversation> obtenerContactos(Customer cliente)
	{
		//esto es cochino
		ArrayList<Conversation> ret = new ArrayList<Conversation>();
		
		if (cliente.getRazonSocial().equalsIgnoreCase("GOOGLE"))
		{
			Conversation c = new Conversation("Telefónico","Solicitó presupuesto sobre pack arduino","20/03/2015 15:30");
			Conversation c1 = new Conversation("Telefonico","Manifestó queja por tardanza de envío","20/03/2015 16:30");
			Conversation c2 = new Conversation("Correo electrónico","Se envió notificación x","20/03/2015 17:30");
			Conversation c3 = new Conversation("Correo electrónico","Otra descripción","20/03/2015 18:30");			
			
			ret.add(c);
			ret.add(c1);
			ret.add(c2);
			ret.add(c3);
		}
		
		return ret;
		
	}

	public static State getState(Customer customer) {
		State stateRet = null;
		if (customer.getRazonSocial().equalsIgnoreCase("GOOGLE"))
			stateRet = new State("ROJO", "Descripción para rojo");
		else if(customer.getRazonSocial().equalsIgnoreCase("SISTEMAS GLOBALES SA"))
			stateRet = new State("VERDE", "Descripción para verde");
		return stateRet;
	}

}
