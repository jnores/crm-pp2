package ungs.crm.vista;

import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

public class ClienteVistaDesktop extends JFrame {

	private JPanel contentPane;
	private JTextField txtRazonSocial;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClienteVistaDesktop frame = new ClienteVistaDesktop();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws UnsupportedLookAndFeelException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws ClassNotFoundException 
	 */
	public ClienteVistaDesktop()  {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		JLabel lblRaznSocial = new JLabel("Razón social:");
		lblRaznSocial.setBounds(22, 70, 72, 14);
		contentPane.add(lblRaznSocial);
		
		txtRazonSocial = new JTextField();
		txtRazonSocial.setBounds(100, 67, 324, 20);
		contentPane.add(txtRazonSocial);
		txtRazonSocial.setColumns(10);
		
		btnGuardar = new JButton("Guardar");		
		btnGuardar.setBounds(22, 11, 89, 23);
		contentPane.add(btnGuardar);
	}
	
	
	
	//si se presiona el boton guardar, se ejecuta el metodo en el controlador (actionperformed
    public void agregarEvtGuardado(ActionListener listenBotonGuardar){
        btnGuardar.addActionListener(listenBotonGuardar);
    }

	public String getRazonSocial() {
		// TODO Auto-generated method stub
		return txtRazonSocial.getText();
	}
	
	public void mensajeError(String error){
		
        JOptionPane.showMessageDialog(this, error);

    }

}
