package ungs.crm.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import ungs.crm.modelo.ContactoModelo;
import ungs.crm.vista.ContactoVistaDesktop;

public class ContactoControlador {
	private ContactoModelo contModelo;
	private ContactoVistaDesktop contVista;
	
	public ContactoControlador(ContactoVistaDesktop vistaCon, ContactoModelo modeloCont)
	{
		this.contModelo = modeloCont;
		this.contVista = vistaCon;
		this.contVista.agregarEvtVerDatos(new verDatosListener());
	}
	
	class verDatosListener implements ActionListener{

		
		@Override
		public void actionPerformed(ActionEvent arg0) {			
			try
			{
				contVista.setearGrilla(contModelo.obtenerContactos(1));
			}
			catch(Exception e)
			{
				contVista.mensajeError(e.getMessage());
			}
		}
		
	}
	
}
