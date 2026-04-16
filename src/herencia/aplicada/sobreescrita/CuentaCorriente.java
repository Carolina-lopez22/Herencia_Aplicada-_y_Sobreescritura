package herencia.aplicada.sobreescrita;

public class CuentaCorriente extends Cuenta {

	public CuentaCorriente(double saldo) {
		super(saldo);
	}
	@Override
	public void retirar(double monto) {
		if (saldo - monto >= -5000) {
			saldo -= monto;
		}else {
			System.out.println("La cantidad excede el limite permitido");
		}
	}
}

