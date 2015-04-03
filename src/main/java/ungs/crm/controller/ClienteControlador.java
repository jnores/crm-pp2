package ungs.crm.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ungs.crm.entity.Customer;
import ungs.crm.model.ClienteModelo;
import ungs.crm.view.ClienteVistaDesktop;

//Maneja la forma en que el modelo y la vista interactuan
public class ClienteControlador {

	//vista y modelo
	private ClienteModelo cliModelo;
	private ClienteVistaDesktop cliVista;
	
	
	public ClienteControlador(ClienteVistaDesktop vistaCl, ClienteModelo modeloCli)
	{
		this.cliModelo = modeloCli;
		this.cliVista = vistaCl;
		this.cliVista.agregarEvtGuardado(new GuardarListener());
	}
	
	//acá está la papa de todo
	class GuardarListener implements ActionListener{

		
		@Override
		public void actionPerformed(ActionEvent arg0) {			
			try
			{
				String nombreCliente = cliVista.getRazonSocial();
				Customer cli = new Customer();
				cli.setRazonSocial(nombreCliente);
				cliModelo.guardar(cli);
			}
			catch(Exception e)
			{
				cliVista.mensajeError(e.getMessage());
			}
		}
		
	}
}
