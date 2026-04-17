package herencia.aplicada.sobreescrita;

public class Factura {
	protected int numero;
	protected Cliente cliente;
	protected double total;
	
	public Factura(int numero, Cliente cliente, double total) {
		this.numero = numero;
		this.cliente = cliente;
		setTotal(total);
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		if (total>=0)
		this.total = total;
		else 
			this.total = 0;
	}
	public double calcularTotal() {
		double totalFinal = this.total;
		if (totalFinal < 0)
			return 0;
		else
		return totalFinal;
	}
	
}
