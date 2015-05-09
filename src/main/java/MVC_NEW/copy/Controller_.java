package MVC_NEW.copy;


import java.awt.event.ActionEvent;

import ungs.crm.entity.Customer;

//esto está bien, pero buscar alternativa a awt
public class Controller_ implements java.awt.event.ActionListener {
	private Model model;

	public Controller_(Model model)
	{
		this.model = model;
	}
	
//	public void setModel(Model model)	
//	{
//		this.model = model;
//	}
	
	public void actionPerformed(ActionEvent arg0) {
		//esto es kako, no va así.. hardcode cochino
		model.setState("GOOGLE","ROJO");		
	}
}
