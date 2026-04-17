package herencia.aplicada.sobreescrita;

public class FacturaCredito extends Factura {
	private double recargo;
	private int cuotas;
	
	public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
		super(numero, cliente, total);
		this.recargo = recargo;
		this.cuotas = cuotas;
	}

	public double getRecargo() {
		return recargo;
	}

	public void setRecargo(double recargo) {
		if (recargo>0)
		this.recargo = recargo;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		if(cuotas>0)
		this.cuotas = cuotas;
	}
	@Override
	public double calcularTotal() {
		return total+this.recargo;
	}

	@Override
	public String toString() {
		return "FacturaCredito [numero = " + numero + ", recargo = " + recargo + ", cuotas = "
				+ cuotas + ", total = " + total + ", Total Final = " + calcularTotal() + "]";
	}
	
}
