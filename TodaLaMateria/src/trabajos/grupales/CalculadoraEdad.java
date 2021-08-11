package trabajos.grupales;
import java.util.Scanner;
public class CalculadoraEdad { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese la fecha de nacimiento: ");
		Scanner teclado = new Scanner(System.in);
		int d1 = teclado.nextInt();
		int m1 = teclado.nextInt();
		int a1 = teclado.nextInt();
		
		System.out.println("Ingrese la fecha actual: ");
		Scanner teclado2 = new Scanner(System.in);
		int d2 = teclado2.nextInt();
		int m2 = teclado2.nextInt();
		int a2 = teclado2.nextInt();
		
		if(d1 > 31 || d2 > 31 || m1 > 12 || m2 > 12 || a1 > a2) {
			System.out.println("Fechas inválidas.");
		//Separación else if general	
		} else if(d1 <= d2) {
			if(m1 <= m2) {
				if(a1 <= a2) {
					int dt = d2 - d1;
					int mt = m2 - m1; 
					int at = a2 - a1;
					System.out.println("Su edad es: " + at + " años, " + mt + " meses, " + dt + " días.");
				}
			}
		//Separación else if general
		} else if(d1 > d2) {
			if(m1 <= m2) {
				if(a1 <= a2) {
					if(a2 % 4 == 0) {//Comprobar si el año actual es bisiesto
						if(m2==1 || m2==2 || m2==4 || m2==6 || m2==8 || m2==9 || m2==11) {//Cuando hay 31 dias antes del mes actual 
							d2 = d2 + 31;
							int dt = d2 - d1;
							int mt = m2 - m1;
							int mt2 = mt - 1;
							int at = a2 - a1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						} else if(m2==5 || m2==7 || m2==10 || m2==12) {//Cuando hay 30 dias antes del mes actual
							d2 = d2 + 30;
							int dt = d2 - d1;
							int mt = m2 - m1;
							int mt2 = mt - 1;
							int at = a2 - a1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						}else if(m2==3) {//Cuando hay 29 dias antes del mes actual (Año bisiesto)
							d2 = d2 + 29;
							int dt = d2 - d1;
							int mt = m2 - m1;
							int mt2 = mt - 1; 
							int at = a2 - a1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						}
						
					} else if(a2 % 4 != 0) {//Comprobar si el año actual es bisiesto
						if(m2==1 || m2==2 || m2==4 || m2==6 || m2==8 || m2==9 || m2==11) {//Cuando hay 31 dias antes del mes actual
							d2 = d2 + 31;
							int dt = d2 - d1;
							int mt = m2 - m1;
							int mt2 = mt - 1;
							int at = a2 - a1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						} else if(m2==5 || m2==7 || m2==10 || m2==12) {//Cuando hay 30 dias antes del mes actual
							d2 = d2 + 30;
							int dt = d2 - d1;
							int mt = m2 - m1;
							int mt2 = mt - 1;
							int at = a2 - a1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						}else if(m2==3) {//Cuando hay 28 dias antes del mes actual (Año no bisiesto)
							d2 = d2 + 28;
							int dt = d2 - d1;
							int mt = m2 - m1;
							int mt2 = mt - 1;
							int at = a2 - a1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						}
					}
				}
			}
		//Separación else if general
		} if(d1 <= d2) {
			if(m1 > m2) {
				if(a1 <= a2) {
					int dt = d2 - d1;
					int mt = 12 - (m1 - m2);
					int at = (a2 - a1) - 1;
					System.out.println("Su edad es: " + at + " años, " + mt + " meses, " + dt + " días.");
				}
			}
		//Separacion else if general	
		}else if(d1 > d2) {
			if(m1 > m2) {
				if(a1 <= a2) {
					if(a2 % 4 == 0) {//Comprobar si el año actual es bisiesto
						if(m2==1 || m2==2 || m2==4 || m2==6 || m2==8 || m2==9 || m2==11) {//Cuando hay 31 dias antes del mes actual
							d2 = d2 + 31;
							int dt = d2 - d1;
							int mt = m1 - m2;
							int mt2 = 11 - mt;
							int at = (a2 - a1) - 1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						}else if(m2==5 || m2==7 || m2==10 || m2==12) {//Cuando hay 30 dias antes del mes actual
							d2 = d2 + 30;
							int dt = d2 - d1;
							int mt = m1 - m2;
							int mt2 = 11 - mt;
							int at = (a2 - a1) - 1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						}else if(m2==3) {//Cuando hay 29 dias antes del mes actual (Año bisiesto)
							d2 = d2 + 29;
							int dt = d2 - d1;
							int mt = m1 - m2;
							int mt2 = 11 - mt;
							int at = (a2 - a1) - 1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						}
						
					} else if(a2 % 4 != 0) {//Comprobar si el año actual es bisiesto
						if(m2==1 || m2==2 || m2==4 || m2==6 || m2==8 || m2==9 || m2==11) {//Cuando hay 31 dias antes del mes actual
							d2 = d2 + 31;
							int dt = d2 - d1;
							int mt = m1 - m2;
							int mt2 = 11 - mt;
							int at = (a2 - a1) - 1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						}else if(m2==5 || m2==7 || m2==10 || m2==12) {//Cuando hay 30 dias antes del mes actual
							d2 = d2 + 30;
							int dt = d2 - d1;
							int mt = m1 - m2;
							int mt2 = 11 - mt;
							int at = (a2 - a1) - 1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						}else if(m2==3) {//Cuando hay 28 dias antes del mes actual (Año no bisiesto)
							d2 = d2 + 28;
							int dt = d2 - d1;
							int mt = m1 - m2;
							int mt2 = 11 - mt;
							int at = (a2 - a1) - 1;
							System.out.println("Su edad es: " + at + " años, " + mt2 + " meses, " + dt + " días.");
							
						}
					}
				}
			}
		//Separacion if else general
		}
		
	}

}