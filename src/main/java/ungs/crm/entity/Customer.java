package ungs.crm.entity;

public class Customer {
	private String razonSocial,codigo;
	
	public Customer(String codigo,
					String razonSocial)
	{
		this.codigo = codigo;
		this.razonSocial = razonSocial;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	

}
