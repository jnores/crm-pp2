package MVC_NEW;


import java.awt.event.ActionEvent;

import ungs.crm.entity.Customer;

//esto está bien, pero buscar alternativa a awt
public class Controller implements java.awt.event.ActionListener {
	private Model model;

	public Controller(Model model)
	{
		this.model = model;
	}
	
//	public void setModel(Model model)	
//	{
//		this.model = model;
//	}
	
	public void actionPerformed(ActionEvent arg0) {
		//esto es kako, no va así.. hardcode cochino
		model.setState(new Customer("G001","GOOGLE"));		
	}
}
