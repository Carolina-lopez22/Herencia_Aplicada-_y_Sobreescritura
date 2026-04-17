
package herencia.aplicada.sobreescrita;

public class Docente extends Persona {
	protected String especialidad;

	public Docente(String nombre, int edad, String especialidad) {
		super(nombre, edad);
		this.especialidad = especialidad;
	}
	
	@Override
	public String mostrar() {
		return "Nombre=" + nombre + ", edad=" + edad +" Especialidad = "+ especialidad ;
	}
}
//Aplique herencia en esta clase al acceder a los atributos de la clase padre Persona 