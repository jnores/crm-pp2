package ungs.crm.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

import ungs.crm.entidades.Contacto;

import java.awt.event.ActionEvent;
import java.util.List;

public class ContactoVistaDesktop extends JFrame {

	private JPanel contentPane;
	private JTextField txtBusqueda;
	private JTable table;
	private JButton btnVer;
	private int NUMEROS_COLUMNA = 3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ContactoVistaDesktop frame = new ContactoVistaDesktop();
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
	public ContactoVistaDesktop() {
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
					
			},
			new String[] {
				"Tipo de Contacto", "Descripción", "Fecha-hora"
			}
		));
		scrollPane.setViewportView(table);
		
		JLabel lblGoogleArgentinaSrl = new JLabel("GOOGLE ARGENTINA S.R.L");
		lblGoogleArgentinaSrl.setBounds(10, 39, 414, 14);
		contentPane.add(lblGoogleArgentinaSrl);
		
		btnVer = new JButton("Ver");		
		btnVer.setBounds(463, 35, 89, 23);
		contentPane.add(btnVer);
	}

	public void agregarEvtVerDatos(ActionListener verDatosListener) {		
		btnVer.addActionListener(verDatosListener);
	}
	
	public void setearGrilla(List<Contacto> listaContactos)
	{
		Object[] datos = new Object[NUMEROS_COLUMNA];
		DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
		
		for(Contacto c : listaContactos)
		{
			datos[0] = c.getTipoContacto();
			datos[1] = c.getDescripcion();
			datos[2] = c.getFecha_Hora();
			modeloTabla.addRow(datos);
		}
		table.setModel(modeloTabla);
	}

	public void mensajeError(String message) {
		JOptionPane.showMessageDialog(this, message);		
	}
}
