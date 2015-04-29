package MVC_NEW;

public class MVC {

	public MVC() {

		//crea modelo y vista
		Model model 	= new Model();
		View view 	= new View();

		//informa al modelo sobre la vista. 
		model.addObserver(view);			

		//Crea el controlador. se le informa sobre el modelo y la vista
		Controller controller = new Controller();
		controller.addModel(model);
		controller.addView(view);

		//se le informa a la vista acerca del controlador 
		view.addController(controller);
	} 
} 
