package MVC_NEW;


import java.awt.event.ActionEvent;

import ungs.crm.entity.Customer;

public class Controller implements java.awt.event.ActionListener {
	private Model model;
	private View view;
	

	
	public void addModel(Model model)	
	{
		this.model = model;
	}
	
	public void addView(View view)
	{
		this.view = view;
	}

	public void actionPerformed(ActionEvent arg0) {
		model.setState(new Customer("G001","GOOGLE"));		
	}
}
