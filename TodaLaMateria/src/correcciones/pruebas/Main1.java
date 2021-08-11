package correcciones.pruebas;
import java.util.Scanner;
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int S = 0;
		float P = 0;
		int C = 0;
		System.out.print("Ingrese un número positivo: ");
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		
		while(N != 0){
			S = S + N;
			C = C + 1;
			P = S / C;
			System.out.print("Ingrese un número positivo: ");
			N = teclado.nextInt();
				 
			}
		System.out.println(" ");
		System.out.println("La suma es: " + S);
		System.out.println("El promedio es: " + P);
		System.out.println("La cantidad de números ingresados es: " + C);
	    }
    }