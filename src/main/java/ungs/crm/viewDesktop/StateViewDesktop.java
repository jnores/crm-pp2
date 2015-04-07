package ungs.crm.viewDesktop;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

//import ungs.crm.controller.EstadoControlador;
//import ungs.crm.entity.Estado;

import javax.swing.JButton;

import ungs.crm.controllerDesktop.InterfaceState;
import ungs.crm.entity.Customer;
import ungs.crm.entity.State;

public class StateViewDesktop extends JFrame {

//	private EstadoControlador controlador;
	private JPanel contentPane;
	private JTextField textField, txtRojo;
	
	private InterfaceState interfaceState;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					EstadoVistaDesktop frame = new EstadoVistaDesktop();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public StateViewDesktop(InterfaceState interfaceState) {
		setTitle("Estados de clientes");
		this.interfaceState = interfaceState;
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 137);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Búsqueda:");
		label.setBounds(10, 14, 61, 14);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if(arg0.getKeyCode() == 10)
					asignData();
			}
		});
		textField.setBounds(73, 11, 351, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 39, 414, 14);
		contentPane.add(label_1);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 64, 61, 14);
		contentPane.add(lblEstado);
		
		txtRojo = new JTextField();
		txtRojo.setText("");
		txtRojo.setEditable(false);
		txtRojo.setBounds(73, 64, 77, 20);
		contentPane.add(txtRojo);
		txtRojo.setColumns(10);
				
		setVisible(true);
	}
	
	private void asignData()
	{
		State state = interfaceState.getState(new Customer("G001","GOOGLE"));
		txtRojo.setText(state.getNombre());
	}

}
