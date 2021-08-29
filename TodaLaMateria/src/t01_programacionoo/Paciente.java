package t01_programacionoo;

public class Paciente extends Persona{

    private String nombre;
	
	void hablarPersona() {
		Persona persona = new Persona();
		persona.comer(nombre);
	}
	
	void comer() {
		
	}

}
