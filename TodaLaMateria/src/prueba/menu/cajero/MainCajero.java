package prueba.menu.cajero;

import java.util.Scanner;

public class MainCajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("**Banco del Pichincha seleccione una opción**");
			System.out.println("      1. Retirar dinero");
			System.out.println("      2. Cambiar clave");
			System.out.println("      3. Bloquear cuenta");
			System.out.println("      4. SALIR");
			System.out.println(" ");
			N = teclado.nextInt();

			if (N == 1) {
				System.out.print("Ingrese el valor a retirar: ");
				int V = teclado.nextInt();
				System.out.println("El valor a retirar es: " + V);
				System.out.println(" ");

			} else if (N == 2) {
				System.out.println("Ingrese nueva clave: ");
				String C = teclado.next();
				System.out.println("Su clave ha sido cambiada con exito.");
				System.out.println(" ");

			} else if (N == 3) {
				System.out.println("Su cuenta ha sido bloqueada.");
				System.out.println(" ");

			} else if (N != 4) {
				System.out.println("OPCION INVALIDA");
				System.out.println(" ");

			}
		} while (N != 4);

	}

}
