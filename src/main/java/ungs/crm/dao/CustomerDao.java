package ungs.crm.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import ungs.crm.entity.Customer;

public class CustomerDao {

	private static CustomerDao cd = new CustomerDao();
	
	private EntityManager manager;
	
	private CustomerDao() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        manager = factory.createEntityManager();
	}
	public static CustomerDao getInstance(){
		return cd;
	}
	
	public void guardar(Customer cliente)
	{		
			           
            EntityTransaction tx = manager.getTransaction();
            //Esto lo necesita si o si, aunque no entiendo por que, esto no se necesita grabar con transacciones
            tx.begin();            
				manager.persist(cliente);
			tx.commit();
	}	

	
	public List<Customer> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		List<Customer> c = null;
		nombre+="%";
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);
		Root<Customer> pRoot = criteria.from(Customer.class);

		criteria.where(
				builder.like(
						pRoot.<String>get("razonSocial"),
						builder.parameter(String.class,"nombre")
							)
						);


		TypedQuery<Customer> tq = manager.createQuery(criteria);
        	tq.setParameter("nombre", nombre);
        c = tq.getResultList();


		return c;
	}
}
