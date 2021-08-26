package ejercicios.ordenamiento.taller;

import java.util.Arrays;

public class MainPrimerDiaClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante danilo = new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setApellido("Alvarracin");
		danilo.setNumeroLista(1);
		danilo.setEdad(18);

		Estudiante andres = new Estudiante();
		andres.setNombre("Andres");
		andres.setApellido("Asitimbay");
		andres.setNumeroLista(2);
		andres.setEdad(19);

		Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setApellido("Pachacama");
		alex.setNumeroLista(22);
		alex.setEdad(22);

		Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setApellido("Cruz");
		stefany.setNumeroLista(10);
		stefany.setEdad(20);

		Estudiante jhonny = new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setApellido("Ninabanda");
		jhonny.setNumeroLista(21);
		jhonny.setEdad(21);

		 //Estudiantes, denme su edad
		System.out.println("Estudiantes, denme su edad:");
		System.out.println("Inge, tengo " + alex.getEdad() + " años.");
		System.out.println("Inge, tengo " + andres.getEdad() + " años.");
		System.out.println("Inge, tengo " + jhonny.getEdad() + " años.");
		System.out.println("Inge, tengo " + danilo.getEdad() + " años.");
		System.out.println("Inge, tengo " + stefany.getEdad() + " años.");

		Estudiante listaEstudiantes[] = new Estudiante[5];
		listaEstudiantes[0] = danilo;
		listaEstudiantes[1] = andres;
		listaEstudiantes[2] = alex;
		listaEstudiantes[3] = stefany;
		listaEstudiantes[4] = jhonny;
		//Vector antes de ordenar
		System.out.println(" ");
		System.out.println("Estudiantes antes de ordenar:");
		System.out.println(Arrays.toString(listaEstudiantes));
		//Aqui ordeno la lista
		System.out.println(" ");
		Arrays.sort(listaEstudiantes);
		System.out.println("Estudiantes despues de ordenar:");
		System.out.println(Arrays.toString(listaEstudiantes));
	}

}




