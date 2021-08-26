package ejercicios.interfaces;

public class CajeroBancoPichincha implements CajeroInterfaz{

	@Override
	public void solicitarTarjeta(String numero) {
		System.out.println("BIENVENIDO A BANCO PICHINCHA POR FAVOR INGRESE SU TARJETA");
	}

	@Override
	public void verificarTarjeta() {
		System.out.println("ERROR TARJETA NO LEIDA / TARJETA VERIFICADA CON EXITO");
	}
	
	@Override
	public void solicitarClave(String clave) {
		System.out.println("INGRESE SU CLAVE POR FAVOR");
	}

	@Override
	public void solicitarTipoTransaccion(String transaccion) {
		System.out.println("SELECCIONE LA OPERACION A REALIZAR");
	}

	@Override
	public void solicitarMonto(int monto) {
		System.out.println("INGRESE EL MONTO");
	}

	@Override
	public void validarElSaldo() {
		System.out.println("SALDO INSUFICIENTE / TRANSACCION REALIZADA CON EXITO");
	}

	@Override
	public void entregarDinero() {
		System.out.println("RETIRE SU DINERO POR FAVOR");
	}

	@Override
	public void realizarTransaccion() {
		System.out.println("SE HA DESCONTADO EL MONTO DE SU CUENTA / SE HA DEPOSITADO EL MONTO A SU CUENTA");
	}

	@Override
	public void entregarRecibo() {
		System.out.println("POR FAVOR RETIRE SU RECIBO");
	}
	
}
