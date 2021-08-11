package ejercicios.varios.vectores.matrices;
import java.util.Scanner;
public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	
/*Declare una matriz A [3 , 4], desarrolle un programa que vaya solicitando cada una de sus posiciones.*/
		char A[][] = new char[3][4];
		for(int fila = 0 ; fila < 3 ; fila++) {
			for(int columna = 0 ; columna < 4 ; columna++) {
				System.out.print("Ingrese el valor de la fila: " + fila + " y de la columna: " + columna + " = ");
				Scanner teclado = new Scanner(System.in);
				char N = teclado.next().charAt(0);
				A[fila][columna] = N;
			}
		}
		
		System.out.println(" ");
		System.out.println("Comenzamos a imprimir la matriz:");
		for(int fila = 0 ; fila < 3 ; fila++) {
			for(int columna = 0 ; columna < 4 ; columna++) {
				System.out.print(A[fila][columna] + " ");
			}
			System.out.println(" ");
		}
	}

}
