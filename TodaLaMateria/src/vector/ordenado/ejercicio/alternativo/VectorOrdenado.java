package vector.ordenado.ejercicio.alternativo;
import java.util.Scanner;
public class VectorOrdenado {
	
	static void mezclar(int arr[], int izquierda[], int derecha[]) {
		int indiceIzq = 0;
		int indiceDer = 0;
		int indiceArr = 0;
		
		//Copia y ordena los elementos de los arreglos izquierda[] y derecha[] 
		while (indiceIzq < izquierda.length && indiceDer < derecha.length) { 
			if (izquierda[indiceIzq] < derecha[indiceDer]) { 
				arr[indiceArr] = izquierda[indiceIzq]; 
				indiceIzq+=1;
			}
			else { 
				arr[indiceArr] = derecha[indiceDer];
				indiceDer+=1;
			}
			indiceArr+=1;
		}
		
		//Verifica si aun hay elementos en alguna de las mitades
		while (indiceIzq < izquierda.length) {
			arr[indiceArr] = izquierda[indiceIzq];
			indiceIzq+=1;
			indiceArr+=1;
		}
		  
		while (indiceDer < derecha.length) { 
			arr[indiceArr] = derecha[indiceDer]; 
			indiceDer+=1;
			indiceArr+=1;
		}
	}
	
	static void ordenar(int arr[]) {
		if (arr.length >1) {
			int mitad = arr.length/2;
			int n1 = mitad;
			int n2 = arr.length - mitad;

			//Crea arreglos temporales para las dos mitades
			int izquierda[] = new int[n1];
			int derecha[] = new int[n2];

			//Copia los elementos que corresponden en cada mitad
			for (int indiceIzq = 0; indiceIzq < n1; ++indiceIzq)
				izquierda[indiceIzq] = arr[indiceIzq];
			for (int indiceDer = 0; indiceDer < n2; ++indiceDer)
				derecha[indiceDer] = arr[mitad + indiceDer];
			
			ordenar(izquierda); //Ordena la primera mitad 
			ordenar(derecha); //Ordena la segunda mitad
			mezclar(arr, izquierda, derecha); //Mezcla las dos mitades
		}
	}
		
	public static void main(String[] args) {
		System.out.print("Ingrese la dimension del vector: ");
		Scanner teclado = new Scanner(System.in);
		int Z = teclado.nextInt();
		int datos[] = new int[Z];
		System.out.println(" ");
		for(int i = 0 ; i < Z ; i++) {
			System.out.print("Ingrese un valor para la posicion " + i + ": ");
			int N = teclado.nextInt();
			datos[i] = N;
		}
		System.out.println(" ");
		for(int i = 0 ; i < Z ; i++) {
			System.out.print(datos[i] + " ");
		}
		System.out.println(" ");
		System.out.println(" ");
		ordenar(datos);
		
		System.out.println("VECTOR ORDENADO");
		for(int i = 0 ; i < Z ; i++) {
			System.out.print(datos[i] + " ");
		}	
	}
}
