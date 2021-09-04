package ejercicios.interfaces;

public class CajeroProdubanco implements CajeroInterfaz{

	
	public void solicitarTarjeta(String numero) {
		System.out.println("BIENVENIDO A PRODUBANCO POR FAVOR INGRESE SU TARJETA");
	}

	
	public void verificarTarjeta() {
		System.out.println("ERROR TARJETA NO LEIDA / TARJETA VERIFICADA CON EXITO");
	}
	
	
	public void solicitarClave(String clave) {
		System.out.println("INGRESE SU CLAVE POR FAVOR");
	}

	
	public void solicitarTipoTransaccion(String transaccion) {
		System.out.println("SELECCIONE LA OPERACION A REALIZAR");
	}

	
	public void solicitarMonto(int monto) {
		System.out.println("INGRESE EL MONTO");
	}

	
	public void validarElSaldo() {
		System.out.println("SALDO INSUFICIENTE / TRANSACCION REALIZADA CON EXITO");
	}

	
	public void entregarDinero() {
		System.out.println("RETIRE SU DINERO POR FAVOR");
	}

	
	public void realizarTransaccion() {
		System.out.println("SE HA DESCONTADO EL MONTO DE SU CUENTA / SE HA DEPOSITADO EL MONTO A SU CUENTA");
	}

	
	public void entregarRecibo() {
		System.out.println("POR FAVOR RETIRE SU RECIBO");
	}
	
}
