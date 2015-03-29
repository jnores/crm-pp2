package ungs.crm.modelo;

import ungs.crm.entidades.Estado;

public class EstadoModelo {
	public Estado getEstadoByCli(long idCliente)
	{
		Estado ret = new Estado();
		ret.setId(1);
		ret.setDescripcion("ROJO");		
		return ret;
	}	
}
