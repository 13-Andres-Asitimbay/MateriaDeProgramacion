package tareaDiagramas;

import java.util.Scanner;

public class Bonificacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Por favor ingrese el sueldo del empleado: ");
		Scanner teclado = new Scanner(System.in);
		int S = teclado.nextInt();
		
		if(S < 300) {
			System.out.println("El sueldo total es: $" + (S + 100));
		} else if (S >= 300 && S <= 400) { 
			System.out.println("El sueldo total es: $" + (S + 70));
		} else if (S > 400) { 
			System.out.println("El sueldo total es: $" + (S + 50));
		} 
	}

}
