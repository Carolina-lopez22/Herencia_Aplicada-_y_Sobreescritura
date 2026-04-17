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
		//sobrescribi este metodo para modificar los datos que se mostraron del estudiante
	}
}
//aplique herencia en esta clase para acceder a atributos de la clase persona,
//de esta manera se ahorro codigo ya que dos clases necesitaron de la Clase padre Persona
