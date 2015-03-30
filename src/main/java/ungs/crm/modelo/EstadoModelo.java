package ungs.crm.modelo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ungs.crm.entidades.Estado;

public class EstadoModelo {
	public Estado getEstadoByCli(long idCliente)
	{
		Estado ret = new Estado();
		ret.setNombre("Rojo");
		ret.setDescripcion("malo");		
		return ret;
	}	
	
	public Estado getEstadoById (long idEstado)
	{
		Estado ret = new Estado();
		ret.setId(idEstado);
		switch((int)idEstado){
			case 1:
				ret.setNombre("Verde");
				ret.setDescripcion("bien");
			break;
			case 2:
				ret.setNombre("Amarillo");
				ret.setDescripcion("masomenos");
				break;
			case 3:
				ret.setNombre("Rojo");
				ret.setDescripcion("malo");
				break;
			default:
				ret=null;
		}
		return ret;
	}
	
	public void guardar(Estado estado)
	{		
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
            EntityManager manager = factory.createEntityManager();           
            EntityTransaction tx = manager.getTransaction();
            //Esto lo necesita si o si, aunque no entiendo por que, esto no se necesita grabar con transacciones
            tx.begin();            
				manager.persist(estado);
			tx.commit();
	}	
}
