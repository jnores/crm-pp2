package ungs.crm.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import ungs.crm.model.EstadoModelo;
import ungs.crm.view.EstadoVistaDesktop;

public class EstadoControlador {
	private EstadoModelo estadoMod;
	private EstadoVistaDesktop estadoVista;
	
	public EstadoControlador(EstadoVistaDesktop vista,
							 EstadoModelo mod)
	{
		this.estadoMod = mod;
		this.estadoVista = vista;
		vista.setControlador(this);
		this.estadoVista.evtBusquedaEstado(new estadosListener());
	}
	
	class estadosListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			try{
				estadoVista.setEstado(estadoMod.getEstadoByCli(1));
			}
			catch(Exception e)
			{
				
			}			
		}
		
	}
}
