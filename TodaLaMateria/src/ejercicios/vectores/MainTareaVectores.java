package ejercicios.vectores;

public class MainTareaVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//1. Declare un vector X[8]
		char X[] = new char[8];
		
//2. Declarar un vector Y[3] de tipo char y asignar el valor de A a la posición 2.
		char Y[] = new char[3];
		Y[2] = 'A';
		
/*3. Declarar un vector A[5] asignar a la posición 0 el valor 25, a la posición 3 el valor 
49 y a la posición 2 el valor de la posición 0.*/
		int A[] = new int[5];
		A[0] = 25;
		A[3] = 49;
		A[2] = 25;
		
//4. Declarar un vector B[10], a la posición B[0] asignele el valor de la posicion A[3] del ejercicio anterior.
		int B[] = new int[10];
		B[0] = 49;
		
//5. Declare un vector Z[12] y asignar a todas sus posiciones valores que inician desde 1 y son secuenciales.
		int Z[] = new int[12];
		int N = 1;
		for(int i = 0 ; i < 12 ; i++) {
			Z[i] = N;
			N = N + 1;
		}
		
//6. Declarar un vector Y2[10] y asignar a todas sus posiciones valores impares que inician desde 1 y son secuenciales.
		int Y2[] = new int[10];
		int N2 = 1;
		for(int i = 0 ; i < 10 ; i++) {
			Y2[i] = N2;
			N2 = N2 + 2;
		}
		
//7. Declarar un vector H[10] y asignar solo a las posiciones impares letras que inician desde la A secuencialmente.
		char H[] = new char[10];
		H[1] = 'A';
		H[3] = 'B';
		H[5] = 'C';
		H[7] = 'D';
		H[9] = 'E';
		
/*8. Declarar un vector F[10] y en base al ejercicio anterior asignar los valores de la siguiente manera:
          F[0]=H[3]
          F[3]=H[2]
          F[4]=H[6]
          F[7]=H[0]
          F[8]=H[1]
          F[9]=H[9]*/
		char F[] = new char[10];
		F[0] = H[3];
		F[3] = H[2];
	    F[4] = H[6];
		F[7] = H[0];
		F[8] = H[1];
		F[9] = H[9];
		
/*9. Declarar un vector L[15] y asignar valores en base a los siguiente:
          L[0]= (promedio de 3,5,7 y 9)
          L[4]= (la suma de 5, 7, 8 y 15)
          L[7]= (la multiplicación de 6, 7 y 3)
          L[10]= (la división de 10/2)*/
		int L[] = new int[15];
		L[0]= (3 + 5 + 7 + 9)/4;
		L[4]= (5 + 7 + 8 + 15);
		L[7]= (6 * 7 * 3);
		L[10]= (10/2);
		
/*10. Declarar un vector N21[12] y realizar las siguientes asignaciones:
          N[0]= (promedio de 3,10 y 9)
          N[4]= (la suma de 7, 8 y 10)
          N[12]= (la multiplicación de 5, 7 y 3)
          N[20]= (la suma de 7, -3 y 8)
          en la última posición el valor de 20/4*/
		int N21[] = new int[12];
		N21[0] = (3 + 10 + 9)/3;
		N21[4] = (7 + 8 + 10);
		N21[12] = (5 * 7  * 3); //EN ESTA POSICION DA ERROR PORQUE NO EXISTE.
		N21[20] = (7 + (-3) + 8); //EN ESTA POSICION DA ERROR PORQUE NO EXISTE.
		N21[11] = 20/4;
		
	}
}
