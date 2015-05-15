package ungs.crm.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import ungs.crm.entity.State;

public class StatusDao {
	private static StatusDao sd = new StatusDao();
	
	private EntityManager manager;
	
	private StatusDao() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        manager = factory.createEntityManager();
	}
	public static StatusDao getInstance(){
		return sd;
	}
	
	public State getStateByID(long id){
		State c = null;
		c = manager.find(State.class, id);
		return c;
	}
	
	public void guardar(State estado)
	{           
            EntityTransaction tx = manager.getTransaction();
            tx.begin();            
				manager.persist(estado);
			tx.commit();
	}	

}
