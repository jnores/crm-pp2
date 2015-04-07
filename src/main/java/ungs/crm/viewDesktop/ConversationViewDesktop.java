package ungs.crm.viewDesktop;

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

import ungs.crm.controllerDesktop.InterfaceConversation;
import ungs.crm.entity.Conversation;
import ungs.crm.entity.Customer;

import java.awt.event.ActionEvent;
import java.util.List;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ConversationViewDesktop extends JFrame {

	private JPanel contentPane;
	private JTextField txtBusqueda;
	private JTable table;
	private JButton btnVer;
	private int NUMEROS_COLUMNA = 3;
	private InterfaceConversation interfaceConversation;

	/**
	 * Launch the application.
	 */
	
	//esto es KAKO
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					ContactoVistaDesktop frame = new ContactoVistaDesktop(null);
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	//esto es KAKO
	/**
	 * Create the frame.
	 */
	public ConversationViewDesktop(InterfaceConversation interConversation) {
		/*************/
		this.interfaceConversation = interConversation;
		/*************/
		setTitle("Historial de conversaciones");
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
		txtBusqueda.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if(arg0.getKeyCode() == 10)
					setGrid();
			}
		});
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
		
		JLabel lblGoogleArgentinaSrl = new JLabel("");
		lblGoogleArgentinaSrl.setBounds(10, 39, 414, 14);
		contentPane.add(lblGoogleArgentinaSrl);
				
		setVisible(true);
	}

	private void setGrid()
	{	
		List<Conversation> listConversation = interfaceConversation.getConversations(
				new Customer("G001","GOOGLE"));
		
		Object[] datos = new Object[NUMEROS_COLUMNA];
		DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
		modeloTabla.setRowCount(0);
		
		for(Conversation c : listConversation)
		{
			datos[0] = c.getTipoContacto();
			datos[1] = c.getDescripcion();
			datos[2] = c.getFecha_Hora();
			modeloTabla.addRow(datos);
		}
		table.setModel(modeloTabla);
	}
}
