package correcciones.pruebas;
import java.util.Scanner;
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int SP = 0;
		int SI = 0;
		float PI = 0.0f;
		int CI = 0;
		int N;

		do {
			System.out.print("Ingrese un número positivo: ");
			Scanner teclado = new Scanner(System.in);
		    N = teclado.nextInt();
		    if(N != -1){
		    	if(N % 2 == 0){
		    		SP = SP + N;
				}else {
					SI = SI + N;
					CI = CI + 1;
					PI = SI/CI;
					}
		    }
			
		}while(N != -1);
		System.out.println(" ");
		System.out.println("La suma de numeros pares es: " + SP);
		System.out.println("El promedio de números impares es: " + PI); 
	}

}
