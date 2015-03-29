package ungs.crm.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import ungs.crm.entidades.Estado;
import javax.swing.JButton;

public class EstadoVistaDesktop extends JFrame {

	private JPanel contentPane;
	private JTextField textField, txtRojo;
	private JButton btnBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EstadoVistaDesktop frame = new EstadoVistaDesktop();
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
	public EstadoVistaDesktop() {
		
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
		textField.setEditable(false);
		textField.setBounds(73, 11, 265, 20);
		contentPane.add(textField);
		
		JLabel label_1 = new JLabel("GOOGLE ARGENTINA S.R.L");
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
		
		btnBuscar = new JButton("Ver");
		btnBuscar.setBounds(345, 10, 89, 23);
		contentPane.add(btnBuscar);
	}

	public void setEstado(Estado estadoByCli) {		
		txtRojo.setText(estadoByCli.getDescripcion());
	}

	public void evtBusquedaEstado(ActionListener estadosListener) {
		btnBuscar.addActionListener(estadosListener);
	}
}
