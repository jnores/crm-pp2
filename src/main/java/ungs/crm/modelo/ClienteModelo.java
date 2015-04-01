package ungs.crm.modelo;
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

import ungs.crm.entidades.Cliente;

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
	
	public void guardar(Cliente cliente)
	{		
			           
            EntityTransaction tx = manager.getTransaction();
            //Esto lo necesita si o si, aunque no entiendo por que, esto no se necesita grabar con transacciones
            tx.begin();            
				manager.persist(cliente);
			tx.commit();
			JOptionPane.showMessageDialog(null,"Cliente grabado");
	}

	public Cliente buscarPorId(long id) {
		// TODO Auto-generated method stub
		Cliente c = null;
		c = manager.find(Cliente.class, id);
		return c;
	}
	
	public List<Cliente> buscarTodos() {
		// TODO Auto-generated method stub
		List<Cliente> c = null;

		c= manager.createQuery("select p from Cliente p").getResultList();

		return c;
	}
	
	public List<Cliente> buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		List<Cliente> c = null;
		nombre+="%";
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Cliente> criteria = builder.createQuery(Cliente.class);
		Root<Cliente> pRoot = criteria.from(Cliente.class);

		criteria.where(
				builder.like(
						pRoot.<String>get("razonSocial"),
						builder.parameter(String.class,"nombre")
							)
						);


		TypedQuery<Cliente> tq = manager.createQuery(criteria);
        	tq.setParameter("nombre", nombre);
        c = tq.getResultList();


		return c;
	}
	
}
