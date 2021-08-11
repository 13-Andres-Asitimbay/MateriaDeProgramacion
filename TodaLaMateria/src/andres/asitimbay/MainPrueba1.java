package andres.asitimbay;
import java.util.Scanner;
public class MainPrueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int S = 0;
		float P = 0;
		int i = 0;
		int C = 0;
		 
		for (i = 1 ; i != 0 ; i++) {
			System.out.print("Ingrese un número positivo: ");
			Scanner teclado = new Scanner(System.in);
			int N = teclado.nextInt();
			if (N == 0){
				i = -1;
				
			}else if (N > 0){
				S = S + N;
				P = S / i;
				C = C + 1;
				
			}
		}
		System.out.println(" ");
		System.out.println("La suma es: " + S);
		System.out.println("El promedio es: " + P);
		System.out.println("La cantidad de números ingresados es: " + C);
	}

}
