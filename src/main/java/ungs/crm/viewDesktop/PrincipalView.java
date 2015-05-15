package ungs.crm.viewDesktop;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;

import ungs.crm.controller.Controller;
import ungs.crm.controllerDesktop.ConversationController;
import ungs.crm.controllerDesktop.StateController;
import ungs.crm.controllerWeb.*;
import ungs.crm.model.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrincipalView extends JFrame {

	private Controller controller;
	
	private JPanel contentPane;
	
	private JFrame stateView;

		/**
	 * Create the frame.
	 */
	public PrincipalView(Controller controller) {
		this.controller=controller;
		
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}		
		catch (Exception e){}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		setLocationRelativeTo(null);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnMain = new JMenu("Main");
		menuBar.add(mnMain);
		
		JMenuItem mntmClientes = new JMenuItem("Clientes");
		mntmClientes.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
//				ClienteVistaDesktop vistaCli= new ClienteVistaDesktop();
//				
//				ClienteModelo modeloCli= ClienteModelo.getInstance();
//
//				ClienteControlador controlCli = new ClienteControlador(vistaCli, modeloCli);
//
//		        vistaCli.setVisible(true);
			}
		});
		
		mnMain.add(mntmClientes);
		
		JMenuItem mntmVerContactos = new JMenuItem("Ver contactos");
		
		mntmVerContactos.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				new ConversationController();
			}
		});
		
		JMenuItem mntmMensajes = new JMenuItem("Mensajes");
		
		mnMain.add(mntmMensajes);
		
		mnMain.add(mntmVerContactos);
		
		JMenuItem mntmVerEstados = new JMenuItem("Ver estados");
		
		mntmVerEstados.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
//				new StateController();
				clickMenuEstados();
			}
		});
		
		
		mnMain.add(mntmVerEstados);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		setVisible(true);
	}
	
	private void clickMenuEstados(){
		if (this.stateView == null) {
			this.stateView = new StateViewDesktop(controller);
		} else {
			this.stateView.setVisible(true);
		}
	}

}
