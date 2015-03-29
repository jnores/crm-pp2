package ungs.crm.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frmVerEstados extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtRojo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVerEstados frame = new frmVerEstados();
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
	public frmVerEstados() {
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
		
		JLabel label_1 = new JLabel("GOOGLE ARGENTINA S.R.L");
		label_1.setBounds(10, 39, 414, 14);
		contentPane.add(label_1);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 64, 61, 14);
		contentPane.add(lblEstado);
		
		txtRojo = new JTextField();
		txtRojo.setText("ROJO");
		txtRojo.setBounds(73, 64, 77, 20);
		contentPane.add(txtRojo);
		txtRojo.setColumns(10);
	}
}
