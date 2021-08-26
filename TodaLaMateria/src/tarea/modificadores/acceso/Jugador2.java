package tarea.modificadores.acceso;

public class Jugador2 extends Persona{
	
	String correo2; //Variable Default que será accedida por clases del mismo paquete y la clase actual
	String usuario2; //Variable Default que será accedida por clases del mismo paquete y la clase actual
	String contraseña2; //Variable Default que será accedida por clases del mismo paquete y la clase actual
	private String cuentaBancaria2; //Variable Private que solo puede ser accedida por la clase actual
	private String datosFamiliares2; //Variable Private que solo puede ser accedida por la clase actual
	
	public void crearCuenta2() { //Metodo Public que puede ser accedido por todos
		jugar();
	}
}
