package ungs.crm.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String nombre;
	@Column
	private String descripcion;
	
	public State(){}
			
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
