package tarea.ordenamiento.objetos;

public class Empleado implements Comparable<Empleado> {

	//Prueba de nombre y correo
	private String nombre;
	private String apellido;
	private int edad;
	private double salario;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int compareTo(Empleado o) {
		// TODO Auto-generated method stub
		if (this.salario < o.getSalario()) {
			return -1;

		} else if (this.salario == o.getSalario()) {
			return 0;

		} else {
			return 1;
			
		}

	}

	
	public String toString() {
		return "Empleado [Nombre = " + nombre + ", Apellido = " + apellido + ", Edad = " + edad + ", Salario = $" + salario
				+ "]";
	}
	
}
