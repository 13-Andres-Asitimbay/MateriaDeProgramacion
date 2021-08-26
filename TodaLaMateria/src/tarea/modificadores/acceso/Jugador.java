package tarea.modificadores.acceso;

public class Jugador extends Persona{
	
	String correo; //Variable Default que será accedida por clases del mismo paquete y la clase actual
	String usuario; //Variable Default que será accedida por clases del mismo paquete y la clase actual
	String contraseña; //Variable Default que será accedida por clases del mismo paquete y la clase actual
	private String cuentaBancaria; //Variable Private que solo puede ser accedida por la clase actual
	private String datosFamiliares; //Variable Private que solo puede ser accedida por la clase actual
	
	public void crearCuenta() { //Metodo Public que puede ser accedido por todos
		jugar();
	}
	
}
