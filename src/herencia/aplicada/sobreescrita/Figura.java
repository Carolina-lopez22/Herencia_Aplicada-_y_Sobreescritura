package herencia.aplicada.sobreescrita;

public class Figura {
	protected String color;
	protected double base;
	protected double altura;
	
	public Figura(String color, double base, double altura) {
		super();
		this.color = color;
		this.base = base;
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
public double area() {
	return 0;
}
}
