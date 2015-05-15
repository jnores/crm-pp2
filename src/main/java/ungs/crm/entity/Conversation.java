package ungs.crm.entity;

import java.util.Date;


public class Conversation {

	private long id;

	private String tipoContacto;

	private String descripcion;

	private Date fecha_Hora;
	
	
	public Conversation(String tipoContacto, String descripcion,
			Date fecha_Hora) {
		this.tipoContacto = tipoContacto;
		this.descripcion = descripcion;
		this.fecha_Hora = fecha_Hora;
	}

	public String getTipoContacto() {
		return tipoContacto;
	}

	protected void setTipoContacto(String tipoContacto) {
		this.tipoContacto = tipoContacto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha_Hora() {
		return fecha_Hora;
	}

	protected void setFecha_Hora(Date fecha_Hora) {
		this.fecha_Hora = fecha_Hora;
	}	
	
}
