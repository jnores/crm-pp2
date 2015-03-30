package ungs.crm.modelo;

import ungs.crm.entidades.Estado;

public class EstadoModelo {
	public Estado getEstadoByCli(long idCliente)
	{
		Estado ret = new Estado();
		ret.setNombre("Rojo");
		ret.setDescripcion("malo");		
		return ret;
	}	
}
