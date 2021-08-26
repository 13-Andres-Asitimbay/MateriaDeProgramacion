package tarea.ordenamiento.objetos;

import java.util.Arrays;

public class MainEmpresaGPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado empleado1 = new Empleado();
		empleado1.setNombre("Andres");
		empleado1.setApellido("Asitimbay");
		empleado1.setEdad(19);
		empleado1.setSalario(300.25);
		
		Empleado empleado2 = new Empleado();
		empleado2.setNombre("Shawn");
		empleado2.setApellido("Tops");
		empleado2.setEdad(25);
		empleado2.setSalario(411.79);
		
		Empleado empleado3 = new Empleado();
		empleado3.setNombre("Josue");
		empleado3.setApellido("z5 TF");
		empleado3.setEdad(21);
		empleado3.setSalario(407.44);
		
		Empleado empleado4 = new Empleado();
		empleado4.setNombre("Juanito");
		empleado4.setApellido("Alcachofa");
		empleado4.setEdad(30);
		empleado4.setSalario(431.80);
		
		Empleado empleado5 = new Empleado();
		empleado5.setNombre("Tommy");
		empleado5.setApellido("Oliver");
		empleado5.setEdad(47);
		empleado5.setSalario(1062.87);
		
		Empleado empleado6 = new Empleado();
		empleado6.setNombre("Adolf");
		empleado6.setApellido("Hitler");
		empleado6.setEdad(56);
		empleado6.setSalario(698.87);
		
		Empleado empleado7 = new Empleado();
		empleado7.setNombre("Pepe");
		empleado7.setApellido("Merengue");
		empleado7.setEdad(17);
		empleado7.setSalario(0.05);
		
		Empleado empleado8 = new Empleado();
		empleado8.setNombre("Jose");
		empleado8.setApellido("Trespatines");
		empleado8.setEdad(80);
		empleado8.setSalario(550.20);
		
		Empleado empleado9 = new Empleado();
		empleado9.setNombre("Fabricio");
		empleado9.setApellido("Pilataxi");
		empleado9.setEdad(24);
		empleado9.setSalario(430.65);
		
		Empleado empleado10 = new Empleado();
		empleado10.setNombre("Ibrahim");
		empleado10.setApellido("Corona");
		empleado10.setEdad(25);
		empleado10.setSalario(800.13);
		
		Empleado nominaEmpleados[] = new Empleado[10];
		nominaEmpleados[0] = empleado1;
		nominaEmpleados[1] = empleado2;
		nominaEmpleados[2] = empleado3;
		nominaEmpleados[3] = empleado4;
		nominaEmpleados[4] = empleado5;
		nominaEmpleados[5] = empleado6;
		nominaEmpleados[6] = empleado7;
		nominaEmpleados[7] = empleado8;
		nominaEmpleados[8] = empleado9;
		nominaEmpleados[9] = empleado10;
		
		System.out.println("Reporte de empleados desordenado:");
		System.out.println(Arrays.toString(nominaEmpleados));
		
		System.out.println(" ");
		Arrays.sort(nominaEmpleados);
		System.out.println("Reporte de empleados ordenado:");
		System.out.println(Arrays.toString(nominaEmpleados));
		
	}

}
