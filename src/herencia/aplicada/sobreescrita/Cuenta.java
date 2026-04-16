package herencia.aplicada.sobreescrita;

public class Cuenta {
	protected double saldo;

	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	public void depositar(double monto) {
		saldo += monto;
	}
	public void retirar(double monto) {
		saldo -= monto;
	}
	
}
