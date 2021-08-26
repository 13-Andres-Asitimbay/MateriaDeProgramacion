package tarea.modificadores.acceso;
import java.util.Scanner;
public class Juego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println("¿JUGADOR 1 O JUGADOR 2?");
		int seleccion = teclado.nextInt();
		if(seleccion == 1){
			System.out.println(" ");
			System.out.println("PARA CREAR SU CUENTA INGRESE LOS SIGUIENTES DATOS");
			System.out.print("Nombre: ");
			String N = teclado.next();
			System.out.print("Apellido: ");
			String A = teclado.next();
			System.out.print("Correo: ");
			String C = teclado.next();
			System.out.print("Usuario: ");
			String U = teclado.next();
			System.out.print("Contraseña: ");
			String CO = teclado.next();
			Jugador juanito = new Jugador(); //Creo una instancia de la clase Jugador
			juanito.nombre = N; //Llamo a la variable Public nombre de la clase Persona, y por herencia pasa a Jugador
			juanito.apellido = A; //Llamo a la variable Public apellido de la clase Persona, y por herencia pasa a Jugador
			juanito.correo = C; /*Llamo a la variable correo de la clase Jugador, al ser Default puede ser accedida 
			por la clase de su mismo paquete*/
			juanito.usuario = U; /*Llamo a la variable usuario de la clase Jugador, al ser Default puede ser accedida 
			por la clase de su mismo paquete*/
			juanito.contraseña = CO; /*Llamo a la variable contraseña de la clase Jugador, al ser Default puede ser accedida 
			por la clase de su mismo paquete*/
			//juanito.cuentaBancaria = ""; //Da error porque la variable cuentaBancaria es private
			System.out.println(" ");
			System.out.println("DATOS INGRESADOS CON ÉXITO");
			System.out.println("Nombre: " + N);
			System.out.println("Apellido: " + A);
			System.out.println("Correo: " + C);
			System.out.println("Usuario: " + U);
			System.out.println("Contraseña: " + CO);
			System.out.println(" ");
			juanito.crearCuenta(); //Llamo al metodo crearCuenta() de la clase Jugador, al ser Public puede ser accedida por todos
			
		}else if(seleccion == 2) {
			System.out.println(" ");
			System.out.println("PARA CREAR SU CUENTA INGRESE LOS SIGUIENTES DATOS");
			System.out.print("Nombre: ");
			String N = teclado.next();
			System.out.print("Apellido: ");
			String A = teclado.next();
			System.out.print("Correo: ");
			String C = teclado.next();
			System.out.print("Usuario: ");
			String U = teclado.next();
			System.out.print("Contraseña: ");
			String CO = teclado.next();
			Jugador2 kiradrast = new Jugador2(); //Creo una instancia de la clase Jugador2
			kiradrast.nombre = N; //Llamo a la variable Public nombre de la clase Persona, y por herencia pasa a Jugador2
			kiradrast.apellido = A; //Llamo a la variable Public apellido de la clase Persona, y por herencia pasa a Jugador2
			kiradrast.correo2 = C; /*Llamo a la variable correo de la clase Jugador2, al ser Default puede ser accedida 
			por la clase de su mismo paquete*/
			kiradrast.usuario2 = U; /*Llamo a la variable usuario de la clase Jugador2, al ser Default puede ser accedida 
			por la clase de su mismo paquete*/
			kiradrast.contraseña2 = CO; /*Llamo a la variable contraseña de la clase Jugador2, al ser Default puede ser accedida 
			por la clase de su mismo paquete*/
			//kiradrast.datosFamiliares2 = ""; //Da error porque la variable datosFamiliares es private
			System.out.println(" ");
			System.out.println("DATOS INGRESADOS CON ÉXITO");
			System.out.println("Nombre: " + N);
			System.out.println("Apellido: " + A);
			System.out.println("Correo: " + C);
			System.out.println("Usuario: " + U);
			System.out.println("Contraseña: " + CO);
			System.out.println(" ");
			kiradrast.jugar(); /*Llamo al metodo jugar() de la clase Persona, al ser Protected puede ser accedida por 
			clases del mismo paquete*/
			
		}else if(seleccion < 1 || seleccion > 2) {
			System.out.println(" ");
			System.out.println("JUGADOR INEXISTENTE!!!");
		}
		
	}

}
