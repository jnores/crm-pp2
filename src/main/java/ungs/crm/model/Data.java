package ungs.crm.model;

import java.util.ArrayList;

import ungs.crm.entity.Conversation;
import ungs.crm.entity.Customer;

public class Data {
	public Conversation obtenerContacto(int idCliente,
			int idContacto)
	{
		Conversation ret = new Conversation();
		if (idContacto == 2 && idCliente == 1)
			ret = null;
		return ret;
	}
	
	public static ArrayList<Conversation> obtenerContactos(Customer cliente)
	{
		//esto es cochino
		ArrayList<Conversation> ret = new ArrayList<Conversation>();
		
		if (cliente.getRazonSocial().equals("GOOGLE"))
		{
			Conversation c = new Conversation();
			Conversation c1 = new Conversation();
			Conversation c2 = new Conversation();
			Conversation c3 = new Conversation();
			
			c.setTipoContacto("Telefonico");
			c.setDescripcion("Solicitó presupuesto sobre pack arduino");
			c.setFecha_Hora("20/03/2015 15:30");
			
			
			c1.setTipoContacto("Telefonico");
			c1.setDescripcion("Manifestó queja por tardanza de envío");
			c1.setFecha_Hora("20/03/2015 16:30");
			
			
			c2.setTipoContacto("Correo electrónico");
			c2.setDescripcion("Se envió notificación x");
			c2.setFecha_Hora("20/03/2015 17:30");
			
			
			c3.setTipoContacto("Correo electrónico");
			c3.setDescripcion("Otra descripción");
			c3.setFecha_Hora("20/03/2015 18:30");
			
			
			ret.add(c);
			ret.add(c1);
			ret.add(c2);
			ret.add(c3);
		}
		
		return ret;
		
	}

}
