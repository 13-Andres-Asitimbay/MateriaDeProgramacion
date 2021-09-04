package prueba.uno;

public class PasajeroEconomico extends Pasajero{
	
	private String codigoDescuento;

	//Metodos SET y GET
	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	
	public String toString() {
		return "PasajeroEconomico [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", codigoDescuento=" + codigoDescuento + "]";
	}
	
}
