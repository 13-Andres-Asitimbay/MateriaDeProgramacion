package ejercicios.varios.vectores.matrices;
import java.util.Scanner;
public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Lo mismo pero ingresado por teclado
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese el numero de filas: ");
		int dimenFilas = teclado.nextInt();
				
		System.out.print("Ingrese el numero de columnas: ");
		int dimenColumnas = teclado.nextInt();
				
		char A[][] = new char[dimenFilas][dimenColumnas];
				
		System.out.println(" ");
			
		for(int fila = 0 ; fila < dimenFilas ; fila++) {
			for(int columna = 0 ; columna < dimenColumnas ; columna++) {
				System.out.print("Ingrese el valor de la fila: " + fila + " y de la columna: " + columna + " = ");
				char N = teclado.next().charAt(0);
				A[fila][columna] = N;
			}
		}
				
		System.out.println(" ");
		System.out.println("Comenzamos a imprimir la matriz:");
		for(int fila = 0 ; fila < dimenFilas ; fila++) {
			for(int columna = 0 ; columna < dimenColumnas ; columna++) {
				System.out.print(A[fila][columna] + " ");
			}
			System.out.println(" ");
		}
	}

}
