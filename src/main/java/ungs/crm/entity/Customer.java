package ungs.crm.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private long id;
	@Column
	private String razonSocial;
	@Column
	private String codigo;
	@ManyToOne(fetch=FetchType.EAGER)
	private State estado;

	public Customer(){}
	
	public Customer(String codigo,
					String razonSocial)
	{
		this.codigo = codigo;
		this.razonSocial = razonSocial;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	protected void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCodigo() {
		return codigo;
	}

	protected void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public State getEstado() {
		return estado;
	}

	public void setEstado(State estado) {
		this.estado = estado;
	}
}
