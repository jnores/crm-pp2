package ungs.crm.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ungs.crm.entity.Conversation;
import ungs.crm.entity.Customer;
import ungs.crm.model.ConversationModel;

public class ConversationController extends HttpServlet  {

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	
	public ConversationController()
	{
		super();
	}
	
	protected void doGet(HttpServletRequest request,
			  HttpServletResponse response) 
			  throws ServletException, IOException 
			  {		
				//aca viene del postback lo que hay en el campo de busqueda
				String op = request.getParameter("Cliente");				
				RequestDispatcher rd = null;
				try
				{
					Customer cliente = new Customer("G001","GOOGLE");
					if (op.toUpperCase().equals(cliente.getRazonSocial()))
					{	
						ArrayList<Conversation> conversaciones = new ConversationModel().obtenerContactos(cliente);
						request.setAttribute("conversaciones", conversaciones);
						rd = request.getRequestDispatcher("conversation.jsp");					
						rd.forward(request, response);
					}
				}
				catch(Exception e)
				{				
			        throw new ServletException("NO HAY CONVERSACIONES O HUBO ERROR", e);
				}			
			  }
	
	//POR AHORA NO SE USA
//	protected void doPost(HttpServletRequest request,
//			  HttpServletResponse response) 
//			  throws ServletException, IOException 
//			  {
//				//acá viene del postback lo que hay en el campo razon social
//				String razonSocial = request.getParameter("razonSocial");
//				
//				RequestDispatcher rd = null;
//				
//				//esto es una prueba, acá tiene que hacer toda la perorata para grabar.
//				//rd = request.getRequestDispatcher("/index.jsp");
//				
//				rd.forward(request, response);
//			  }
}
