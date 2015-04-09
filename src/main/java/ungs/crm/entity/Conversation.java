package ungs.crm.entity;

public class Conversation {
	private String tipoContacto,
				   descripcion,
				   fecha_Hora;
	
	
	public Conversation(String tipoContacto, String descripcion,
			String fecha_Hora) {
		this.tipoContacto = tipoContacto;
		this.descripcion = descripcion;
		this.fecha_Hora = fecha_Hora;
	}

	public String getTipoContacto() {
		return tipoContacto;
	}

//	public void setTipoContacto(String tipoContacto) {
//		this.tipoContacto = tipoContacto;
//	}

	public String getDescripcion() {
		return descripcion;
	}

//	public void setDescripcion(String descripcion) {
//		this.descripcion = descripcion;
//	}

	public String getFecha_Hora() {
		return fecha_Hora;
	}

//	public void setFecha_Hora(String fecha_Hora) {
//		this.fecha_Hora = fecha_Hora;
//	}	
	
}
