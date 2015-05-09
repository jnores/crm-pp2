package MVC_NEW.copy;

public class Adapter implements Controller {
	private Model model;
	
	public Adapter(Model model)
	{
		this.model = model;
	}

	@Override
	public void setState(String customer, String state) {
		this.model.setState(customer,state);
	}
}
