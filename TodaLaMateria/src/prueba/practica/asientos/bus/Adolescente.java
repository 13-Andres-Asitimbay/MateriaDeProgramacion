package prueba.practica.asientos.bus;

public class Adolescente extends Persona{
	
	public String deporte;

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	@Override
	public String toString() {
		return "Adolescente [nombre:" + nombre + ", Apellido: " + apellido + ", deporte=" + deporte + "]";
	}

}
