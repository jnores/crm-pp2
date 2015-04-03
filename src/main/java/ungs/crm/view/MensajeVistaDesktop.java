package ungs.crm.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MensajeVistaDesktop extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MensajeVistaDesktop frame = new MensajeVistaDesktop();
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
	public MensajeVistaDesktop() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
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
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(73, 72, 351, 146);
		contentPane.add(textField_1);
		
		JLabel lblMensaje = new JLabel("Mensaje:");
		lblMensaje.setBounds(10, 72, 61, 14);
		contentPane.add(lblMensaje);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(165, 229, 89, 23);
		contentPane.add(btnEnviar);
	}
}
