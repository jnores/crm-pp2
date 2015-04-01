package ungs.crm.modelo;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;

import ungs.crm.entidades.Cliente;

public class ClienteModeloTest extends TestCase{
	
	@Test
	public void testGuardar()
	{
		//este está así nomás porque el guardar persistido aún no está implementado bien, pero igual anda
		ClienteModelo.getInstance().guardar(new Cliente());
	}
	
	@Test
	public void testGetAll()
	{
		//este está así nomás porque el guardar persistido aún no está implementado bien, pero igual anda
		List<Cliente> clientes = ClienteModelo.getInstance().buscarTodos();
		System.out.println("cantidad: "+clientes.size());
		
		for(Cliente c:clientes){
			
			System.out.println(c.toString());
		}
	}
	
	@Test
	public void testGetbyName()
	{
		//este está así nomás porque el guardar persistido aún no está implementado bien, pero igual anda
		List<Cliente> clientes = ClienteModelo.getInstance().buscarPorNombre("Google");
		System.out.println("cantidad: "+clientes.size());
		
		for(Cliente c:clientes){
			
			System.out.println(c.toString());
		}
	}
	
}
