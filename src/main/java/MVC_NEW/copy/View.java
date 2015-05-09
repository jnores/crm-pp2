package MVC_NEW.copy;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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

public class View extends JFrame implements java.util.Observer {

	private JPanel contentPane;
	private JTextField textField, txtEstado;

	private JButton btnVer;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public View() {
		setTitle("Estados de clientes");		
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

		textField.setBounds(73, 11, 351, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 39, 414, 14);
		contentPane.add(label_1);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 64, 61, 14);
		contentPane.add(lblEstado);
		
		txtEstado = new JTextField();
		txtEstado.setText("");
		txtEstado.setEditable(false);
		txtEstado.setBounds(73, 64, 77, 20);
		contentPane.add(txtEstado);
		txtEstado.setColumns(10);
		
		btnVer = new JButton("Ver");
		btnVer.setBounds(335, 60, 89, 23);
		contentPane.add(btnVer);
				
		setVisible(true);
	}

	public void addController(ActionListener controller){
		btnVer.addActionListener(controller);
	}

	@Override
	public void update(Observable arg0, Object arg1) {
		//en teoría, la vista no debe saber como el estado muestra sus cosas.. 
		//adapter "Mostrable" o algo así.. muchas clases de tipo interfaces y esas cosas me imagino
		txtEstado.setText(((State)arg1).getNombre());
	}
}
