package herencia.aplicada.sobreescrita;

public class Estudiante extends Persona{
	private String carnet;

	public Estudiante(String nombre, int edad, String carnet) {
		super(nombre, edad);
		this.carnet = carnet;
	}
	
	@Override
	public String mostrar() {
		return "Carnet= " + carnet +" Nombre=" + nombre + ", edad=" + edad ;
	}

}
