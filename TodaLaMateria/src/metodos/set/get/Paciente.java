package metodos.set.get;

public class Paciente {
	
	private String nombre; //Debe tener su metodo SET y GET
	private String apellido; //Debe tener su metodo SET y GET
	private int edad; //Debe tener su metodo SET y GET
	
	private void caminar() {
		
	}
	
	private void correr() {
		
	}
	
	//Los metodos SET y GET siempre son publicos
	//Las siguientes nomenclaturas son regla fija:
	
	//Estructura del SET
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//Estructura del GET
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public int getEdad() {
		return this.edad;
	}
}
