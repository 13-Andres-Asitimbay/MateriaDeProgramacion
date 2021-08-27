package tarea.tablero.ajedrez;

public class MainTableroAjedrez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Reinas
		Reina reinaNegra = new Reina();
		reinaNegra.setColor("Reina Negra");

		Reina reinaBlanca = new Reina();
		reinaBlanca.setColor("Reina Blanca");

		// Reyes
		Rey reyNegro = new Rey();
		reyNegro.setColor("Rey Negro");

		Rey reyBlanco = new Rey();
		reyBlanco.setColor("Rey Blanco");

		// Torres
		Torre torreNegra = new Torre();
		torreNegra.setColor("Torre Negra");

		Torre torreBlanca = new Torre();
		torreBlanca.setColor("Torre Blanca");

		// Alfiles
		Alfil alfilNegro = new Alfil();
		alfilNegro.setColor("Alfil Negro");

		Alfil alfilBlanco = new Alfil();
		alfilBlanco.setColor("Alfil Blanco");

		// Caballos
		Caballo caballoNegro = new Caballo();
		caballoNegro.setColor("CaballoNegro");

		Caballo caballoBlanco = new Caballo();
		caballoBlanco.setColor("CaballoBlanco");

		// Peones
		Peon peonNegro = new Peon();
		peonNegro.setColor(" Peon Negro");

		Peon peonBlanco = new Peon();
		peonBlanco.setColor(" Peon Blanco");

		// Matriz
		Pieza tableroAjedrez[][] = new Pieza[8][8];
		tableroAjedrez[0][0] = torreNegra;
		tableroAjedrez[0][1] = caballoNegro;
		tableroAjedrez[0][2] = alfilNegro;
		tableroAjedrez[0][3] = reinaNegra;
		tableroAjedrez[0][4] = reyNegro;
		tableroAjedrez[0][5] = alfilNegro;
		tableroAjedrez[0][6] = caballoNegro;
		tableroAjedrez[0][7] = torreNegra;
		tableroAjedrez[1][0] = peonNegro;
		tableroAjedrez[1][1] = peonNegro;
		tableroAjedrez[1][2] = peonNegro;
		tableroAjedrez[1][3] = peonNegro;
		tableroAjedrez[1][4] = peonNegro;
		tableroAjedrez[1][5] = peonNegro;
		tableroAjedrez[1][6] = peonNegro;
		tableroAjedrez[1][7] = peonNegro;

		tableroAjedrez[6][0] = peonBlanco;
		tableroAjedrez[6][1] = peonBlanco;
		tableroAjedrez[6][2] = peonBlanco;
		tableroAjedrez[6][3] = peonBlanco;
		tableroAjedrez[6][4] = peonBlanco;
		tableroAjedrez[6][5] = peonBlanco;
		tableroAjedrez[6][6] = peonBlanco;
		tableroAjedrez[6][7] = peonBlanco;
		tableroAjedrez[7][0] = torreBlanca;
		tableroAjedrez[7][1] = caballoBlanco;
		tableroAjedrez[7][2] = alfilBlanco;
		tableroAjedrez[7][3] = reinaBlanca;
		tableroAjedrez[7][4] = reyBlanco;
		tableroAjedrez[7][5] = alfilBlanco;
		tableroAjedrez[7][6] = caballoBlanco;
		tableroAjedrez[7][7] = torreBlanca;

		System.out.println("TABLERO DE AJEDREZ:");
		System.out.println(" ");
		for (int fila = 0; fila < 8; fila++) {
			for (int columna = 0; columna < 8; columna++) {
				System.out.print(tableroAjedrez[fila][columna] + " ");

			}
			System.out.println(" ");
		}

	}

}
