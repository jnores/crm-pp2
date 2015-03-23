package ungs.crm.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;

import ungs.crm.modelo.Cliente;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmClientes extends JFrame {

	private JPanel contentPane;
	private JTextField txtRazonSocial;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmClientes frame = new frmClientes();
					frame.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public frmClientes() {
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e){}
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRaznSocial = new JLabel("Razón social:");
		lblRaznSocial.setBounds(22, 70, 72, 14);
		contentPane.add(lblRaznSocial);
		
		txtRazonSocial = new JTextField();
		txtRazonSocial.setBounds(100, 67, 324, 20);
		contentPane.add(txtRazonSocial);
		txtRazonSocial.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				guardar();
			}
		});
		btnGuardar.setBounds(22, 11, 89, 23);
		contentPane.add(btnGuardar);
	}
	
	private void guardar()
	{
		//Cochinada para el profesor
		try
		{
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistenceUnit");
            EntityManager manager = factory.createEntityManager();           
            EntityTransaction tx = manager.getTransaction();
            //Esto lo necesita si o si, aunque no entiendo por que, esto no se necesita grabar con transacciones
            tx.begin();            
			manager.persist(new Cliente(txtRazonSocial.getText()));
			tx.commit();
			JOptionPane.showMessageDialog(null,"Cliente grabado");
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e.getMessage());
		}
		//Cochinada para el profesor
	}
}
