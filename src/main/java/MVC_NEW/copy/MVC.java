package MVC_NEW.copy;

public class MVC {

	public MVC() {

		//crea modelo y vista
		Model model = new Model();
		View view = new View();

		//informa al modelo sobre la vista. 
		model.addObserver(view);			

		//Crea el controlador. se le informa sobre el modelo
		Controller_ controller = new Controller_(model);

		//se le informa a la vista acerca del controlador 
		view.addController(controller);
		
		
		
		
	} 
} 
