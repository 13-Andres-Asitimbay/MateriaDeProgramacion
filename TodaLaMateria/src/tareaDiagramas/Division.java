package tareaDiagramas;

import java.util.Scanner;

public class Division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Por favor ingrese dos números: ");
		Scanner teclado = new Scanner(System.in);
		int A = teclado.nextInt();
		int B = teclado.nextInt();
		
		if(B == 0) {
			System.out.println("No es posible realizar la división.");
		} else {
			int D = A/B;
			System.out.println("La divisón es: " + D);
		}
	}

}
