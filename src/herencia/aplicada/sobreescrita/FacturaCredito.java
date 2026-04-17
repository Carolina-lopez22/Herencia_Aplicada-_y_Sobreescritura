package herencia.aplicada.sobreescrita;

public class FacturaCredito extends Factura {
	private double recargo;
	private int cuotas;
	
	public FacturaCredito(int numero, Cliente cliente, double total, double recargo, int cuotas) {
		super(numero, cliente, total);
		setRecargo(recargo);
		setRecargo(cuotas);
	}

	public double getRecargo() {
		return recargo;
	}

	public void setRecargo(double recargo) {
		if (recargo>=0)
		this.recargo = recargo;
		else
			this.recargo = 0;
	}

	public int getCuotas() {
		return cuotas;
	}

	public void setCuotas(int cuotas) {
		if(cuotas>=0)
		this.cuotas = cuotas;
		else
			this.cuotas = 0;
	}
	@Override
	public double calcularTotal() {
		double totalFinal = total+this.recargo;
		if (totalFinal < 0)
			return 0;
		else
		return totalFinal; 
		//sobrescribi este metodo para calcular el total la factura añadiendole el cargo correspondiente
	}

	@Override
	public String toString() {
		return "FacturaCredito [numero = " + numero + ", recargo = " + recargo + ", cuotas = "
				+ cuotas + ", total = " + total + ", Total Final = " + calcularTotal() + "]";
	}
}
//Aplique herencia de la clase padre Factura ya que se necesitaban usar atributos de esa clase