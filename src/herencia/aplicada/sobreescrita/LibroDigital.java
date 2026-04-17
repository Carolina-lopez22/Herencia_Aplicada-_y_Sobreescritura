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
//Sobrescribi este metodo porque necesitaba agregar informacion adicional del tamaño del libro digital
}
// Aplique herencia ya que tengo una clase padre Libro que teniene datos que iba a utilizar aqui tambien