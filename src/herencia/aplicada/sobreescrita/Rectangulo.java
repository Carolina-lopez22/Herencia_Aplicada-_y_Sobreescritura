package herencia.aplicada.sobreescrita;

public class Rectangulo extends Figura {

	private double base;
	private double altura;
		
	public Rectangulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}


	@Override
	public double calcularArea() {
		return this.base*this.altura;

	}


	@Override
	public String toString() {
		return "Rectangulo [color = " + color + ", Area = " + calcularArea() + "]";
	}
	

}
