package ejercicios.varios.vectores.matrices;
import java.util.Scanner;
public class MainVector1 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

/*1. Declare un vector X[3] de tipo char y construya un programa que pida al usuario que ingrese
los valores para cada posicion*/
		char X[] = new char[3];
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print("Ingrese un valor para la posicion " + i + ": ");
			Scanner teclado = new Scanner(System.in);
			char N = teclado.next().charAt(0);
			X[i] = N;
		}
				
		System.out.println(" ");
				
		for(int i = 0 ; i < 3 ; i++) {
			System.out.print("El valor de la posicion " + i + " es: ");
			System.out.println(X[i]);
		}
				
		System.out.println(" ");
		System.out.print("El vector completo es: ");
	    System.out.println(X);
				
	}

}
