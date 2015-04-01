package ungs.crm.entidades;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
//import javax.validation.constraints.NotNull;

@Entity
@Table(name = "cliente")
public class Cliente {
	@Id
	@GeneratedValue
	@Column(name="id_cliente")
	private long id;
	
//	@NotNull
	@Column(name="razon_social")
	private String razonSocial;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Estado estado;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;	
	}

	public Estado getEstado() {
		return estado;
	}
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	@Override
	public String toString(){
		return "id:"+id+" |nombre:"+(razonSocial!=null?razonSocial:"NULL")+" |estado("+(estado!=null?estado.toString():"NULL")+")" ;
	}

}
