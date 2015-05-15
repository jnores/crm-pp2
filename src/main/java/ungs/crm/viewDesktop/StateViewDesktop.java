package ungs.crm.viewDesktop;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import ungs.crm.controller.Controller;
//import ungs.crm.controller.EstadoControlador;
//import ungs.crm.entity.Estado;
import ungs.crm.modelView.StatusModelView;

public class StateViewDesktop extends JFrame implements Observer {

	private Controller controller;
	private JPanel contentPane;
	private JTextField textField, txtRojo;
	
//	private InterfaceState interfaceState;


	/**
	 * Create the frame.
	 */
	public StateViewDesktop(Controller controller) {
		this.controller = controller;
		controller.addStatusObserver(this);
		
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
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				if(arg0.getKeyCode() == 10) {
					if (textField.getText().isEmpty())
						JOptionPane.showMessageDialog(null, "Debe ingresar un nombre de cliente!!");
					else
						asignData();
				}
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
//		State state = interfaceState.getState(new Customer("G001","GOOGLE"));
//		txtRojo.setText(state.getNombre());
//		System.out.println("procesando: "+textField.getText());
		this.controller.getState(textField.getText());
	}
	
	@Override
	public void update(Observable o, Object arg) {
		StatusModelView sv = (StatusModelView) arg;
		if (sv.status==null) {
			if (sv.razonesSociales.size() == 0 ) {
				JOptionPane.showInputDialog("No se encontraron coincidencias");
			} else {
				String opcion = (String) JOptionPane.showInputDialog(null, "Selecciona una Razon Social", "Razon Social",
			        JOptionPane.QUESTION_MESSAGE, null, sv.razonesSociales.toArray(),sv.razonesSociales.get(0));
				textField.setText(opcion);
				
			}
		} else {
			txtRojo.setText(sv.status);
			textField.setText(sv.razonesSociales.get(0));
		}

		
	}	
}
