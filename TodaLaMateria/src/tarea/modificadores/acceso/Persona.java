package tarea.modificadores.acceso;

public class Persona {
	
	public String nombre; //Variable Public que será accedida por todos
	public String apellido; //Variable Public que será accedida por todos
	
	protected void jugar() { //Metodo protected que será accedido por la clase actual, las herencias y clases del mismo paquete
		System.out.println("COMIENZA EL JUEGO");
	}
}
