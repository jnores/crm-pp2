package ungs.crm.mvcPrueba;

import ungs.crm.controlador.*;
import ungs.crm.modelo.*;
import ungs.crm.vista.*;
import ungs.crm.entidades.*;

public class MVCPRueba {
	
	private static void cargarEstados(){
		EstadoModelo em = new EstadoModelo();
			
			Estado estadoOK= new Estado();
			estadoOK.setNombre("Verde");
			estadoOK.setDescripcion("bien");
		em.guardar(estadoOK);
		
			Estado estadoWrong= new Estado();
			estadoWrong.setNombre("Amarillo");
			estadoWrong.setDescripcion("masomenos");
		em.guardar(estadoWrong);
			
			Estado estadoBad= new Estado();
			estadoBad.setNombre("Rojo");
			estadoBad.setDescripcion("mal");
		em.guardar(estadoBad);
	}
	
	private static void cargarClientes(){
		ClienteModelo cm = new ClienteModelo();
		
			Cliente google = new Cliente();
			google.setEstado(new EstadoModelo().getEstadoById(3));
			google.setRazonSocial("Google Argentina S.R.L");
		cm.guardar(google);
		
//			Cliente kukiku = new Cliente();
//			kukiku.setEstado(new EstadoModelo().getEstadoById(1));
//			kukiku.setRazonSocial("kukiku soft S.R.L");
//		cm.guardar(kukiku);
	
		
	}
	private static void cargarDatos(){
		cargarEstados();
		
		cargarClientes();
	}
	
	public static void main(String[] args) {
		
		cargarDatos();
		 
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
