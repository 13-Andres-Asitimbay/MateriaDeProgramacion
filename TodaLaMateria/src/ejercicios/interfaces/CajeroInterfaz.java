package ejercicios.interfaces;

public interface CajeroInterfaz {
	
	public void solicitarTarjeta(String numero);
	
	public void verificarTarjeta();
	
	public void solicitarClave(String clave);
	
	public void solicitarTipoTransaccion(String transaccion);
	
	public void solicitarMonto(int monto);
	
	public void validarElSaldo();
	
	public void entregarDinero();
	
	public void realizarTransaccion();
	
	public void entregarRecibo();
}
