package ungs.crm.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

public class frmVerContactos extends JFrame {

	private JPanel contentPane;
	private JTextField txtBusqueda;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVerContactos frame = new frmVerContactos();
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
	public frmVerContactos() {
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Exception e){}
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 578, 227);		
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBsqueda = new JLabel("B\u00FAsqueda:");
		lblBsqueda.setBounds(10, 14, 59, 14);
		contentPane.add(lblBsqueda);
		
		txtBusqueda = new JTextField();
		txtBusqueda.setBounds(73, 11, 479, 20);
		contentPane.add(txtBusqueda);
		txtBusqueda.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 58, 542, 131);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Telefónico", "Solicitó presupuesto sobre pack arduino","20/03/2015 15:30"},
				{"Telefónico", "Manifestó queja por tardanza de envío","21/03/2015 16:30"},
				{"Correo electrónico", "Se envió notificación x","22/03/2015 17:30"},
				{"Correo electrónico", "Otra descripción","23/03/2015 18:30"},				
			},
			new String[] {
				"Tipo de Contacto", "Descripción", "Fecha-hora"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblGoogleArgentinaSrl = new JLabel("GOOGLE ARGENTINA S.R.L");
		lblGoogleArgentinaSrl.setBounds(10, 39, 414, 14);
		contentPane.add(lblGoogleArgentinaSrl);

	}
}
