package bucles;
import java.util.Scanner;
public class ParticipacionDoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		
		do {
		System.out.print("Ingrese un número mayor a cero: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		}while(n <= 0);
		
		if (n%2 == 0) {
			System.out.print(n + " es par.");
		}else {
			System.out.print(n + " es impar.");
		}
	}

}
