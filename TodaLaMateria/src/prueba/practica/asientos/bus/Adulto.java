package prueba.practica.asientos.bus;

public class Adulto extends Persona{
	
	private String codigoSeguroSocial;
	public String empresaDeTrabajo;
	
	public String getCodigoSeguroSocial() {
		return codigoSeguroSocial;
	}
	
	public void setCodigoSeguroSocial(String codigoSeguroSocial) {
		this.codigoSeguroSocial = codigoSeguroSocial;
	}
	
	public String getEmpresaDeTrabajo() {
		return empresaDeTrabajo;
	}
	
	public void setEmpresaDeTrabajo(String empresaDeTrabajo) {
		this.empresaDeTrabajo = empresaDeTrabajo;
	}

	@Override
	public String toString() {
		return "Adulto [codigoSeguroSocial=" + codigoSeguroSocial + ", empresaDeTrabajo=" + empresaDeTrabajo + "]";
	}

}
