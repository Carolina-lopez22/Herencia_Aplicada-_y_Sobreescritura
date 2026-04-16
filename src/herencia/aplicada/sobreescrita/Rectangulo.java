package herencia.aplicada.sobreescrita;

public class Rectangulo extends Figura {

	public Rectangulo(String color, double base, double altura) {
		super(color, base, altura);
	}
	@Override
	public double area() {
		return this.base*this.altura;

	}
	

}
