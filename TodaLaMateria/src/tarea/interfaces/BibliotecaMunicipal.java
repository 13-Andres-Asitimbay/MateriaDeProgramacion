package tarea.interfaces;

public class BibliotecaMunicipal implements BibliotecaInterfaz{
	
	public void tomarDatosCliente() {
		System.out.println("Nombre: ");
		System.out.println("Institución educativa: ");
		System.out.println("Curso: ");
		System.out.println("Teléfono: ");
		System.out.println("Correo: ");
	}
	
	public void tomarListaDeLibros() {
		System.out.println("Nº Libros: 3");
		System.out.println("Libro 1: ");
		System.out.println("Libro 2: ");
		System.out.println("Libro 3: ");
	}
	
	public void entregarLibros() {
		System.out.println(" *Le entrega el libro al estudiante* ");
	}
	
	public void verificarTiempoDeTrabajo() {
		System.out.println(" *Se empieza a tomar el tiempo a partir de entregar los libros* ");
		System.out.println(" *Se solicitan los libros una vez finalizado el tiempo* ");
	}
	
	public void recibirYRevisarLibros() {
		System.out.println(" *Recibe los libros* ");
		System.out.println(" *Revisa que los libros esten completos y en buen estado* ");
	}
	
}
