package bucles;
import java.util.Scanner;
public class ParticipacionDoWhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		do {
		System.out.print("Ingrese un número entre 1 y 10: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		}while(n < 1 || n > 10);
		
		System.out.print("Número Correcto.");
	}
}
