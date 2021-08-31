package prueba.practica.asientos.bus;
import java.util.Scanner;
public class MainReservaViajes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adulto juan = new Adulto();
		juan.setNombre("Juan");
		juan.setApellido("Estratosferico");
		juan.setCodigoSeguroSocial("123456789");
		juan.setEmpresaDeTrabajo("Hololive");
		juan.getNombre();
		juan.getApellido();
		
		Adulto carlos = new Adulto();
		carlos.setNombre("Carlos");
		carlos.setApellido("Panchana");
		carlos.setCodigoSeguroSocial("7548+9");
		carlos.setEmpresaDeTrabajo("Stark Industries");
		
		Adulto esteban = new Adulto();
		esteban.setNombre("Esteban");
		esteban.setApellido("Alegria");
		esteban.setCodigoSeguroSocial("5512845");
		esteban.setEmpresaDeTrabajo("Pinguino");
		
		Adulto kira = new Adulto();
		kira.setNombre("Kira");
		kira.setApellido("Drast");
		kira.setCodigoSeguroSocial("578614879");
		kira.setEmpresaDeTrabajo("Globos");
		
		Adulto guitar = new Adulto();
		guitar.setNombre("Guitar");
		guitar.setApellido("HeroStyles");
		guitar.setCodigoSeguroSocial("5545512");
		guitar.setEmpresaDeTrabajo("Youtube");
		
		Adulto ruben = new Adulto();
		ruben.setNombre("Ruben");
		ruben.setApellido("Doblas");
		ruben.setCodigoSeguroSocial("57821");
		ruben.setEmpresaDeTrabajo("YouTube");
		
		Adulto oscar = new Adulto();
		oscar.setNombre("Oscar");
		oscar.setApellido("Doblas");
		oscar.setCodigoSeguroSocial("57821");
		oscar.setEmpresaDeTrabajo("YouTube");
		
		Adulto fernando = new Adulto();
		fernando.setNombre("Fernando");
		fernando.setApellido("Doblas");
		fernando.setCodigoSeguroSocial("57821");
		fernando.setEmpresaDeTrabajo("YouTube");
		
		Adulto andres = new Adulto();
		andres.setNombre("Andres");
		andres.setApellido("Asitimbay");
		andres.setCodigoSeguroSocial("57821");
		andres.setEmpresaDeTrabajo("YouTube");
		
		Adulto alfonso = new Adulto();
		alfonso.setNombre("Alfonso");
		alfonso.setApellido("Asitimbay");
		alfonso.setCodigoSeguroSocial("57821");
		alfonso.setEmpresaDeTrabajo("YouTube");
		
		
		Adolescente shawn = new Adolescente();
		shawn.setNombre("Swah");
		shawn.setApellido("Nute");
		shawn.setDeporte("Soccer");
		
		Adolescente loose = new Adolescente();
		loose.setNombre("Loose");
		loose.setApellido("Nute");
		loose.setDeporte("Soccer");
		
		Adolescente coco = new Adolescente();
		coco.setNombre("Kiryu");
		coco.setApellido("Coco");
		coco.setDeporte("Soccer");
		
		Adolescente watame = new Adolescente();
		watame.setNombre("Tsunomaki");
		watame.setApellido("Watame");
		watame.setDeporte("Soccer");
		
		Adolescente marine = new Adolescente();
		marine.setNombre("Houshou");
		marine.setApellido("Marine");
		marine.setDeporte("Soccer");
		
		Adolescente pekora = new Adolescente();
		pekora.setNombre("Usada");
		pekora.setApellido("Pekora");
		pekora.setDeporte("Soccer");
		
		Adolescente gura = new Adolescente();
		gura.setNombre("Gawr");
		gura.setApellido("Gura");
		gura.setDeporte("Soccer");
		
		Adolescente anastasia = new Adolescente();
		anastasia.setNombre("Anastasia");
		anastasia.setApellido("White");
		anastasia.setDeporte("Soccer");
		
		Adolescente lebrian = new Adolescente();
		lebrian.setNombre("Lebriah");
		lebrian.setApellido("Negro");
		lebrian.setDeporte("Soccer");
		
		Adolescente korone = new Adolescente();
		korone.setNombre("Korone");
		korone.setApellido("Dog");
		//korone.setDeporte("Soccer");
		
		
		Persona bus[][] = new Persona[4][5];
		bus[0][0] = juan;
		bus[0][1] = carlos;
		bus[0][2] = esteban;
		bus[0][3] = kira;
		bus[0][4] = guitar;
		bus[3][0] = ruben;
		bus[3][1] = oscar;
		bus[3][2] = fernando;
		bus[3][3] = andres;
		bus[3][4] = alfonso;

		bus[1][0] = shawn;
		bus[1][1] = loose;
		bus[1][2] = coco;
		bus[1][3] = watame;
		bus[1][4] = marine;
		bus[2][0] = pekora;
		bus[2][1] = gura;
		bus[2][2] = anastasia;
		bus[2][3] = lebrian;
		bus[2][4] = korone;
	
		System.out.println("Seleccione al pasajero:");
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese fila:");
		int fila = teclado.nextInt();
		System.out.println("Ingrese columna:");
		int columna = teclado.nextInt();
		System.out.println("Pasajero: " + bus[fila][columna]);
	}

}
