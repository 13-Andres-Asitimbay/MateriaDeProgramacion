package trabajos.grupales;
import java.util.Scanner;
public class MainFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//La clase main Factura de mi compañero
		Scanner teclado = new Scanner(System.in);
		System.out.println("SELECCIONE PODUCTOS ");
		System.out.println("1---> Pan");
		System.out.println("2---> Fideos");
		System.out.println("3---> Leche");
		System.out.println("0---> Salir ");
		int Z = teclado.nextInt();
		Productos imprimir = new Productos();
		imprimir.seleccion(Z);
		System.out.println("INGRESE METODO DE PAGO");
		String pago = teclado.next();
		Productos imprimirMetodoPago = new Productos();
		imprimirMetodoPago.MetodoPago(pago);
	}

}