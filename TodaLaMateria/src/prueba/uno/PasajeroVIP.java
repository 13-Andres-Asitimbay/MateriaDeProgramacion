package prueba.uno;

public class PasajeroVIP extends Pasajero{
	
	private String codigoMembresia;
	
	public PasajeroVIP() {
		
	}
	
	public PasajeroVIP(String nombre, String apellido, String codigoMembresia, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.codigoMembresia = codigoMembresia;
		this.edad = edad;
	}

	//Metodos SET y GET
	public String getCodigoMembresia() {
		return codigoMembresia;
	}

	public void setCodigoMembresia(String codigoMembresia) {
		this.codigoMembresia = codigoMembresia;
	}

	
	public String toString() {
		return "PasajeroVIP [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", codigoMembresia=" + codigoMembresia + "]";
	}
	
}
