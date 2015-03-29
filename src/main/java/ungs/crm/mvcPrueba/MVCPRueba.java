package ungs.crm.mvcPrueba;

import ungs.crm.controlador.ClienteControlador;
import ungs.crm.controlador.ContactoControlador;
import ungs.crm.modelo.ClienteModelo;
import ungs.crm.modelo.ContactoModelo;
import ungs.crm.vista.ClienteVistaDesktop;
import ungs.crm.vista.ContactoVistaDesktop;

public class MVCPRueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
//		ClienteVistaDesktop vistaCli= new ClienteVistaDesktop();
//		
//		ClienteModelo modeloCli= new ClienteModelo();
//
//        ClienteControlador controlCli = new ClienteControlador(vistaCli, modeloCli);
//
//        vistaCli.setVisible(true);
		
		ContactoVistaDesktop vistaCli= new ContactoVistaDesktop();
		
		ContactoModelo modeloCli= new ContactoModelo();

        ContactoControlador controlCli = new ContactoControlador(vistaCli, modeloCli);

        vistaCli.setVisible(true);
	}

}
