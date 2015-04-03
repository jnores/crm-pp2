package ungs.crm.model;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.swing.JOptionPane;

import ungs.crm.entity.Customer;

//el modelo es el mismo para desktop, web, y cualquier otro universo
public class ClienteModelo {
	
	private static ClienteModelo cm = new ClienteModelo();
	
	private EntityManager manager;
	
	private ClienteModelo(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
        manager = factory.createEntityManager();
	}
	
	public static ClienteModelo getInstance(){
		return cm;
	}
	
	public void guardar(Customer cliente)
	{		
			           
            EntityTransaction tx = manager.getTransaction();
            //Esto lo necesita si o si, aunque no entiendo por que, esto no se necesita grabar con transacciones
            tx.begin();            
				manager.persist(cliente);
			tx.commit();
			JOptionPane.showMessageDialog(null,"Cliente grabado");
	}

	public Customer buscarPorId(long id) {
		// TODO Auto-generated method stub
		Customer c = null;
		c = manager.find(Customer.class, id);
		return c;
	}
	
	public List<Customer> buscarTodos() {
		// TODO Auto-generated method stub
		List<Customer> c = null;

		c= manager.createQuery("select p from Cliente p").getResultList();

		return c;
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
