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
//Sobrescribi este metodo porque tambien necesitaba calcular el area de un rectangulo
	}


	@Override
	public String toString() {
		return "Rectangulo [color = " + color + ", Area = " + calcularArea() + "]";
	}
}
// Aplique herencia en esta clase ya que habian varibales y metodos que iba a compartir con la clase Circulo