package condiciones.e.ingreso.datos.teclado;

import java.util.Scanner;

public class MainCondicion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Rombo
		Scanner teclado = new Scanner(System.in);
		System.out.print("Por favor ingrese un número: ");
		int n = teclado.nextInt();
		if (n == 1) {
			System.out.println("Número correcto.");
		} else {
			System.out.println("Número incorrecto.");
			System.out.println("El numero correcto es: " + 1);
		}
	}

}
