package herencia.aplicada.sobreescrita;

public class Libro {
	protected String titulo;
	protected String autor;
	
	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	public String mostrarInfo() {
		return "Titulo: "+titulo+ " Autor: "+autor;
		
	}
}
