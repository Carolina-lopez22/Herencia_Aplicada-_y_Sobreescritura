package herencia.aplicada.sobreescrita;

public class Perro extends Animal{
	private String raza;

	public Perro(String nombre, String raza) {
		super(nombre);
		this.raza = raza;
	}
	
	@Override 
	public void hacerSonido() {
		System.out.println("Sonido: El perro ladra");
		//sobrescribi este metodo para definir cual es el sonido que hace el perro
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", nombre=" + nombre + "]";
	}
}
//Se aplico herencia en esta clase usando atributos de la clase padre Animal y asi mismo sobreescribiendo metodo