package ejercicios.ordenamiento;

import java.util.Arrays;

public class MainPrimerDiaClase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante danilo = new Estudiante();
		danilo.setNombre("Danilo");
		danilo.setNumeroLista(1);
		System.out.println("DANILO:");
		System.out.println(danilo);

		 Estudiante andres = new Estudiante();
		andres.setNombre("Andres");
		andres.setNumeroLista(2);

		 Estudiante alex = new Estudiante();
		alex.setNombre("Alex");
		alex.setNumeroLista(22);

		 Estudiante stefany = new Estudiante();
		stefany.setNombre("Stefany");
		stefany.setNumeroLista(10);

		 Estudiante jhonny = new Estudiante();
		jhonny.setNombre("Jhonny");
		jhonny.setNumeroLista(21);

		 // Alex dame tu numero de lista
		System.out.println("Inge, soy el: " + alex.getNumeroLista());
		System.out.println("Inge, soy el: " + jhonny.getNumeroLista());

		Estudiante listaEstudiantes[] = new Estudiante[5];
		listaEstudiantes[0] = danilo;
		listaEstudiantes[1] = andres;
		listaEstudiantes[2] = alex;
		listaEstudiantes[3] = stefany;
		listaEstudiantes[4] = jhonny;
		//Vector antes de ordenar
		System.out.println("Estudiantes antes de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));
		//Aqui ordeno la lista
		Arrays.sort(listaEstudiantes);
		System.out.println("Estudiantes despues de ordenar");
		System.out.println(Arrays.toString(listaEstudiantes));
	}

}
