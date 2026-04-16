package herencia.aplicada.sobreescrita;

public class Figura {
	protected String color;
	
	public Figura(String color) {
		super();
		this.color = color;
	}
	
public double calcularArea() throws Exception {
	throw new Exception ("No existe inf");
}
}
