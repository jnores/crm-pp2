package ungs.crm.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public CustomerController()
	{
		super();
	}

	protected void doPost(HttpServletRequest request,
						  HttpServletResponse response) 
						  throws ServletException, IOException {

		//acá viene del postback lo que hay en el campo razon social
		//String razonSocial = request.getParameter("razonSocial");
		
		RequestDispatcher rd = null;
		
		//esto es una prueba, acá tiene que hacer toda la perorata para grabar.
		rd = request.getRequestDispatcher("/index.jsp");
	
		rd.forward(request, response);
	}
}
