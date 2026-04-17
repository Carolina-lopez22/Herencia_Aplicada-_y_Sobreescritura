package herencia.aplicada.sobreescrita;

public class LibroDigital extends Libro{
	private double tamaño;

	public LibroDigital(String titulo, String autor, double tamaño) {
		super(titulo, autor);
		this.tamaño = tamaño;
	}
@Override
public String mostrarInfo() {
	return "Titulo: "+titulo+ " Autor: "+autor +" Tamaño: "+tamaño+ "MB";
	}
	
}
