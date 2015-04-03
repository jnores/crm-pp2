package ungs.crm.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estado")
public class Estado {
	@Id
	@GeneratedValue
	@Column(name="id_estado")
	private long id;
	private String nombre;
	private String descripcion;

	public long getId(){
		return id;
	}
	public void setId(long id){
		this.id= id;
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
	
	@Override
	public String toString(){
		return "id:"+id+" |nombre:"+nombre+" |descripcion:"+ descripcion;
	}
}