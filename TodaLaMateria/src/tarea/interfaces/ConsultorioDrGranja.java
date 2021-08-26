package tarea.interfaces;

public class ConsultorioDrGranja implements ConsultorioInterfaz{

	public void tomarDatosPaciente() {
		System.out.println("Nombres: ");
		System.out.println("Apellidos: ");
		System.out.println("Dirección: ");
		System.out.println("Teléfono: ");
		System.out.println("Correo: ");
	}

	public void registrarCita() {
		System.out.println(" *La secretaria registra la hora y fecha de la cita* ");
	}

	public void llamarPacientePorAltavoz() {
		System.out.println(" *La secretaria llama al paciente verificando el dia y hora de su cita* ");
	}

	public void examinarPaciente() {
		System.out.println(" *El doctor examina al paciente de acuerdo a los sintomas que presente* ");
	}

	public void recetarPaciente() {
		System.out.println(" *Terminada la revision el doctor escribe la receta que debera seguir el paciente* ");
	}
	
}



