package ungs.crm.modelo;

import java.util.ArrayList;
import java.util.List;

import ungs.crm.entidades.Contacto;

public class ContactoModelo {

	public List<Contacto> obtenerContactos(int idcliente)
	{
		//esto es cochino
		List<Contacto> ret = new ArrayList<>();
		Contacto c = new Contacto();
		Contacto c1 = new Contacto();
		Contacto c2 = new Contacto();
		Contacto c3 = new Contacto();
		c.setIdCliente(1);
		c.setTipoContacto("Telefonico");
		c.setDescripcion("Solicitó presupuesto sobre pack arduino");
		c.setFecha_Hora("20/03/2015 15:30");
		
		c1.setIdCliente(1);
		c1.setTipoContacto("Telefonico");
		c1.setDescripcion("Manifestó queja por tardanza de envío");
		c1.setFecha_Hora("20/03/2015 16:30");
		
		c2.setIdCliente(1);
		c2.setTipoContacto("Correo electrónico");
		c2.setDescripcion("Se envió notificación x");
		c2.setFecha_Hora("20/03/2015 17:30");
		
		c3.setIdCliente(1);
		c3.setTipoContacto("Correo electrónico");
		c3.setDescripcion("Otra descripción");
		c3.setFecha_Hora("20/03/2015 18:30");
		
		
		ret.add(c);
		ret.add(c1);
		ret.add(c2);
		ret.add(c3);
		return ret;
		
	}
}
