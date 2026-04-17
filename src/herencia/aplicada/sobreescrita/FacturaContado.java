package herencia.aplicada.sobreescrita;

public class FacturaContado extends Factura{
	private double descuento;

	public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
		super(numero, cliente, total);
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		if (descuento<0)
			System.out.println("El descuento no puede ser negativo");
		else 
		this.descuento = descuento;
	}
	@Override
	public double calcularTotal() {
		return total-this.descuento;
	}
	@Override
	public String toString() {
		return "FacturaContado [numero = " + numero + ", descuento = " + descuento + ", total = "
				+ total + ", Total Final = " + calcularTotal() + "]";
	}

}
