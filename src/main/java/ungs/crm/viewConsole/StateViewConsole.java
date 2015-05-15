package ungs.crm.viewConsole;

import java.util.Observable;
import java.util.Observer;

import ungs.crm.modelView.StatusModelView;

public class StateViewConsole implements Observer{

	public StateViewConsole() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void update(Observable o, Object arg) {
		StatusModelView sv = (StatusModelView) arg;
		if (sv.status==null) {
			if (sv.razonesSociales.size() == 0 ) {
				System.out.println("[No se encontraron coincidencias]");
				System.out.println("=======================================");
			} else {
				System.out.println("[Se encontraron los siguientes razones sociales compatibles]");
				for (String razonSocial : sv.razonesSociales) {
					System.out.println("\t* "+razonSocial);
				}
				System.out.println("=======================================");
			}
		} else {
			System.out.println("[ Razon Social: "+sv.razonesSociales.get(0)+" ]");
			System.out.println("[ Estado: "+sv.status+" ]");
			System.out.println("=======================================");
		}

		
	}
}
