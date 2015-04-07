package ungs.crm.entity;

public class State {
	private long id;
	private String nombre,
				   descripcion;
	
	public State(String nombre,
				 String descripcion)
	{
		this.nombre = nombre;
		this.descripcion = descripcion;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
