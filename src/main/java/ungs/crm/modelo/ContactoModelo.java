package ungs.crm.modelo;

import java.util.ArrayList;
import java.util.List;

import ungs.crm.entidades.Contacto;

public class ContactoModelo {

	public List<Contacto> obtenerContactos(int idcliente)
	{
		List<Contacto> ret = new ArrayList<>();
		Contacto c = new Contacto();
		Contacto c1 = new Contacto();
		Contacto c2 = new Contacto();
		Contacto c3 = new Contacto();
		c.setIdCliente(1);
		c.setTipoContacto("Telefonico");
		c.setDescripcion("prueba");
		c.setFecha_Hora("01/01/2015");
		
		c1.setIdCliente(1);
		c1.setTipoContacto("Telefonico");
		c1.setDescripcion("prueba");
		c1.setFecha_Hora("01/01/2015");
		
		c2.setIdCliente(1);
		c2.setTipoContacto("Telefonico");
		c2.setDescripcion("prueba");
		c2.setFecha_Hora("01/01/2015");
		
		c3.setIdCliente(1);
		c3.setTipoContacto("Telefonico");
		c3.setDescripcion("prueba");
		c3.setFecha_Hora("01/01/2015");
		
		
		ret.add(c);
		ret.add(c1);
		ret.add(c2);
		ret.add(c3);
		return ret;
		
	}
}
