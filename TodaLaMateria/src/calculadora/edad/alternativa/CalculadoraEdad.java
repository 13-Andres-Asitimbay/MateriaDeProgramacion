package calculadora.edad.alternativa;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class CalculadoraEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0,b = 0,c = 0;
		int a1 = 0,b1 = 0,c1 = 0;
		Scanner lector= new Scanner(System.in);
		System.out.println("Bienvenido\n");
		System.out.println("Digite su fecha de nacimiento:\n");
		  System.out.println("Digite el año:");
	        a = lector.nextInt();
	        System.out.println("Digite el mes:");
	        b = lector.nextInt();
	        System.out.println("Digite el dia:");
	        c = lector.nextInt();
	        
	        System.out.println("Digite la fecha actual\n");
	        
	        System.out.println("Digite el año:");
	        a1 = lector.nextInt();
	        System.out.println("Digite el mes:");
	        b1 = lector.nextInt();
	        System.out.println("Digite el dia:");
	        c1 = lector.nextInt();
	        if((c < 0 | c > 31)||(c1 < 0 | c1 > 31)) {
	        	 System.out.println("el día está mal puesto");
	        	 return;

	        }
	        else if((b< 0 | b >12)|(b1 < 0 | b1 >12)){
	        	 System.out.println("el mes está mal puesto");
	        	 return;
	     	 }
	        else if((a1 <= 0)|(a <= 0)){
	        	 System.out.println("el año está mal puesto");
	        	 return;
	        	 }
	        	 else {Period edad = Period.between(LocalDate.of(a, b, c), LocalDate.of(a1,b1,c1));
		System.out.println(String.format("Su edad es : %d años, %d meses y %d días",
		        edad.getYears(),
		        edad.getMonths(),
		        edad.getDays()));
	}
	}

}
