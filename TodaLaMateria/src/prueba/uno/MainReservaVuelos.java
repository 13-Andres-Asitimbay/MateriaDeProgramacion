package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner tecladoInt = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);
		System.out.println("Ingrese informacion de pasajero");
		System.out.println("Ingrese nombre:");
		String nombre = tecladoString.nextLine();
		System.out.println("Ingrese apellido:");
		String apellido = tecladoString.nextLine();
		System.out.println("Ingrese edad:");
		int edad = tecladoInt.nextInt();
		System.out.println("Que tipo de pasajero es: 1.Pasajero VIP - 2.Pasajero Economico");
		int opcion = tecladoInt.nextInt();
		
		String membresia = "";
		String descuento = "";
		if(opcion == 1){
			System.out.println("Ingrese codigo de membresia");
			membresia = tecladoString.nextLine();
			
		}else if(opcion == 2){
			System.out.println("Ingrese codigo de descuento");
			descuento = tecladoString.nextLine();
		}
		
		PasajeroVIP pasajero1 = new PasajeroVIP();
		pasajero1.setNombre(nombre);
		pasajero1.setApellido(apellido);
		pasajero1.setCodigoMembresia(membresia);
		pasajero1.setEdad(edad);
		
		PasajeroVIP pasajero2 = new PasajeroVIP("Javier", "Cruz", "57854", 21);
		
		PasajeroEconomico pasajeroEconomico1 = new PasajeroEconomico();
		pasajeroEconomico1.setNombre("Chucho");
		pasajeroEconomico1.setApellido("Calderon");
		pasajeroEconomico1.setCodigoDescuento("574+");
		pasajeroEconomico1.setEdad(23);
		
		PasajeroEconomico pasajeroEconomico2 = new PasajeroEconomico();
		pasajeroEconomico2.setNombre("Brayan");
		pasajeroEconomico2.setApellido("Jackson");
		pasajeroEconomico2.setCodigoDescuento("545872+");
		pasajeroEconomico2.setEdad(45);
		
		Pasajero[][] asientos = new Pasajero[4][5];
		asientos[0][0] = pasajero1;
		asientos[0][1] = pasajero2;
		asientos[0][2] = pasajeroEconomico1;
		asientos[3][2] = pasajeroEconomico2;
		
		int opcionSalir;
		do {
			System.out.println("Ingrese datos del asiento: 0. Continuar - 1.Salir");
			opcionSalir= tecladoInt.nextInt();
			if(opcionSalir == 0) {
				System.out.println("Ingrese datos del asiento");
				System.out.print("Ingrese fila del asiento: ");
				int fila = tecladoInt.nextInt();
				System.out.print("Ingrese columna del asiento: ");
				int columna = tecladoInt.nextInt();
				
				System.out.println("Los datos del pasajero son: ");
				System.out.println(asientos[fila][columna]);
				
			}else {
				System.out.println("Va a salir del sistema");
			}
			
		}while(opcionSalir != 1);
		
	}

}
