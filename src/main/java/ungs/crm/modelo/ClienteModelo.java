package ungs.crm.modelo;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

import ungs.crm.entidades.Cliente;

//el modelo es el mismo para desktop, web, y cualquier otro universo
public class ClienteModelo {

	public void guardar(Cliente cliente)
	{		
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
            EntityManager manager = factory.createEntityManager();           
            EntityTransaction tx = manager.getTransaction();
            //Esto lo necesita si o si, aunque no entiendo por que, esto no se necesita grabar con transacciones
            tx.begin();            
				manager.persist(cliente);
			tx.commit();
			JOptionPane.showMessageDialog(null,"Cliente grabado");
	}		
}
