package ejercicios.varios.vectores.matrices;
import java.util.Scanner;
public class MainVector2 {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

/*Declare un vector X cuya longitud se solicite al usuario de tipo int, y finalmente se
impriman los valores asignados*/
		System.out.print("Ingrese la dimension del vector: ");
		Scanner teclado = new Scanner(System.in);
		int Z = teclado.nextInt();
		int X[] = new int[Z];
		System.out.println(" ");
				
		for(int i = 0 ; i < Z ; i++) {
			System.out.print("Ingrese un valor para la posicion " + i + ": ");
			int N = teclado.nextInt();
			X[i] = N;
		}
				
		System.out.println(" ");
	
		for(int i = 0 ; i < Z ; i++) {
			System.out.print("El valor de la posicion " + i + " es: ");
			System.out.println(X[i]);
		}
				
	}

}
