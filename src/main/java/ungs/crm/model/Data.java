package ungs.crm.model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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
			SimpleDateFormat format =
			        new SimpleDateFormat("dd/mm/yyyy HH:mm");
			
			Date parsed;
			try {
				parsed = format.parse("20/03/2015 15:30");    
				Conversation c = new Conversation("Telefónico","Solicitó presupuesto sobre pack arduino", parsed);
				parsed = format.parse("20/03/2015 16:30");
				Conversation c1 = new Conversation("Telefonico","Manifestó queja por tardanza de envío",parsed);
				parsed = format.parse("20/03/2015 17:30");
				Conversation c2 = new Conversation("Correo electrónico","Se envió notificación x",parsed);
				parsed = format.parse("20/03/2015 18:30");
				Conversation c3 = new Conversation("Correo electrónico","Otra descripción",parsed);			

				ret.add(c);
				ret.add(c1);
				ret.add(c2);
				ret.add(c3);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return ret;
		
	}

	static public State getState(Customer customer) {
		State stateRet = null;
		if (customer.getRazonSocial().equalsIgnoreCase("GOOGLE"))
			stateRet = new State("ROJO", "Descripción para rojo");
		else if(customer.getRazonSocial().equalsIgnoreCase("SISTEMAS GLOBALES SA"))
			stateRet = new State("VERDE", "Descripción para verde");
		return stateRet;
	}

}
