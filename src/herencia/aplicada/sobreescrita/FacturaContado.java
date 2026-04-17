package herencia.aplicada.sobreescrita;

public class FacturaContado extends Factura{
	private double descuento;

	public FacturaContado(int numero, Cliente cliente, double total, double descuento) {
		super(numero, cliente, total);
		setDescuento(descuento);
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		if (descuento>=0)
			this.descuento = descuento;
		else
			this.descuento = 0;
	}
	@Override
	public double calcularTotal() {
		double totalFinal = total-this.descuento;
		if (totalFinal < 0)
			return 0;
		else
		return totalFinal;
		//sobrescribi este metodo porque se necesitaba calcular cuanto era el total de la factura sin el descuento que se le esta haciendo
	}
	@Override
	public String toString() {
		return "FacturaContado [numero = " + numero + ", descuento = " + descuento + ", total = "
				+ total + ", Total Final = " + calcularTotal() + "]";
	}
}
//Aplique herencia en esta clase ya que necesitaba atributos de la clase Padre Factura que utilice aqui tambien