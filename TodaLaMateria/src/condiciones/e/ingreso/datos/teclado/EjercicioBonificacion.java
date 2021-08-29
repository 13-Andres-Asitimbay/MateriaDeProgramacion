package condiciones.e.ingreso.datos.teclado;

import java.util.Scanner;

public class EjercicioBonificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el valor del sueldo: ");
		int s = teclado.nextInt();
		if (s < 300) {
			int B = 40;
			System.out.println("Su bonificación es: " + B);
		} else {
			int B = 0;
			System.out.println("Su bonificación es: " + B);
		}
	}
}
