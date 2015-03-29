package ungs.crm.mvcPrueba;

import ungs.crm.controlador.ClienteControlador;
import ungs.crm.modelo.ClienteModelo;
import ungs.crm.vista.ClienteVistaDesktop;

public class MVCPRueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		ClienteVistaDesktop vistaCli= new ClienteVistaDesktop();
		
		ClienteModelo modeloCli= new ClienteModelo();

        ClienteControlador controlCli = new ClienteControlador(vistaCli, modeloCli);

        vistaCli.setVisible(true);
	}

}
