package herencia.aplicada.sobreescrita;

public class Factura {
	protected int numero;
	protected Cliente cliente;
	protected double total;
	
	public Factura(int numero, Cliente cliente, double total) {
		this.numero = numero;
		this.cliente = cliente;
		this.total = total;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		if (total<0)
			System.out.println("El total no puedes ser negativo");
		else
		this.total = total;
	}
	public double calcularTotal() {
		return total;
	}
	
}
