//1. Declaracion del paquete
package ejercicios.metodos;

//2. Declaracion de importacion

//3.Comentarios
//Clase que se encarga de realizar una impresion en formatos A4

//4. Declaracion de la clase 
public class Impresora {
	
	//5. Constantes
	//6. Variables
	public String color;
	
	//7. Constructor
	public Impresora() {
		
	}
	
	//8. Metodos
	public void imprimir(String datosAImprimir, int letra) {
		System.out.println("LOGO UCE");
		System.out.println("*************");
		System.out.println(datosAImprimir);
		System.out.println("*************");
		System.out.println("Pie de Firma");
	}
}
