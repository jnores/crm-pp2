package ungs.crm.mvcPrueba;

import ungs.crm.controlador.*;
import ungs.crm.modelo.*;
import ungs.crm.vista.*;


public class MVCPRueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ClienteVistaDesktop vistaCli= new ClienteVistaDesktop();
		
		ClienteModelo modeloCli= new ClienteModelo();

        ClienteControlador controlCli = new ClienteControlador(vistaCli, modeloCli);

        vistaCli.setVisible(true);
		
//		ContactoVistaDesktop vistaCli= new ContactoVistaDesktop();
//		
//		ContactoModelo modeloCli= new ContactoModelo();
//
//        ContactoControlador controlCli = new ContactoControlador(vistaCli, modeloCli);
//
//        vistaCli.setVisible(true);
		
//		EstadoVistaDesktop vistaCli= new EstadoVistaDesktop();
//		
//		EstadoModelo modeloCli= new EstadoModelo();
//
//        EstadoControlador controlCli = new EstadoControlador(vistaCli, modeloCli);
//
//        vistaCli.setVisible(true);
		
		
	}

}
