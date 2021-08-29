package diagramas.de.flujo;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Se ingresa por teclado un número, el programa debe imprimir los 5 numeros consecutivos que le siguen.
		System.out.println("Por favor ingrese un número cualquiera: ");
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
				
		for(int C = N + 1 ; C <= N + 5 ; C = C + 1) {
			System.out.println(C);
		}
		System.out.println("Se ha finalizado la impresión de los cinco.");
	}

}
