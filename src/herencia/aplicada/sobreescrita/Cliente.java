package herencia.aplicada.sobreescrita;

public class Cliente {
	private String nombre;
	private int NIT;
	
	public Cliente(String nombre, int nIT) {
		this.nombre = nombre;
		NIT = nIT;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNIT() {
		return NIT;
	}
	public void setNIT(int nIT) {
		NIT = nIT;
	}
}
