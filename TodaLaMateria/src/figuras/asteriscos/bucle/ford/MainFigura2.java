package figuras.asteriscos.bucle.ford;

import java.util.Scanner;

public class MainFigura2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese el número de filas: ");
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		for (int f = N; f >= 1; f--) {

			for (int as = 1; as <= f; as++) {

				System.out.print("*");
			}

			System.out.println(" ");
		}
	}

}
