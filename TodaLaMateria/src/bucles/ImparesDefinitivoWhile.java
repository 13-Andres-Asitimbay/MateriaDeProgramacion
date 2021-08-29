package bucles;
import java.util.Scanner;
public class ImparesDefinitivoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//PROGRAMA CUANDO LOS IMPARES EMPIEZAN EN 1
		System.out.print("Ingrese un número cualquiera: ");
		Scanner teclado = new Scanner(System.in);
		int n = teclado.nextInt();
		int i = 0;
		int z = 1;
		while(z <= n){
			int R = i+z;
			if(R == 7 || R == 17 || R == 27) {
				System.out.println("*" + R);
	
			} else {
				System.out.println(R);
			}
			i = i + 1;
			z = z + 1;
		}
	}

}
