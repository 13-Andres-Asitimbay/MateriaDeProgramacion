package tarea.modificadores.acceso;

public class Persona {
	
	public String nombre; //Variable Public que ser� accedida por todos
	public String apellido; //Variable Public que ser� accedida por todos
	
	protected void jugar() { //Metodo protected que ser� accedido por la clase actual, las herencias y clases del mismo paquete
		System.out.println("COMIENZA EL JUEGO");
	}
}
