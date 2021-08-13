package trabajos.grupales;
import java.util.Scanner; 
public class MainPaciente{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Mi clase main
		Scanner teclado = new Scanner(System.in);
		System.out.print("Ingrese turno: ");
		int Z = teclado.nextInt();
		Sistema turnos = new Sistema();
		turnos.tomarTurnos("Andrés", "Asitimbay", "1234567890", "0962898223", Z);
		turnos.metodoPago("Tarjeta de Crédito");
	}

}