package trabajos.grupales;

public class Productos {
	
//Clase que recibe datos de mi compañero 	
	
	public void seleccion(int producto) {

		if (producto == 1) {
			System.out.println("Precio: 3$");
		} else if (producto == 2) {
			System.out.println("Precio: 10$");
		} else if (producto == 3) {
			System.out.println("Precio: 2$");
		} else {
			System.out.println("El producto no existe");
		}

	}
	public void MetodoPago(String MetodoPago) {
		// TODO Auto-generated method stub
		System.out.println("Metodo de pago: " + MetodoPago);
	}
}