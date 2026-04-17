package herencia.aplicada.sobreescrita;

public class Gerente extends Empleado {
	private double bonoAdicional;

	public Gerente(String nombre, double salario, double bonoAdicional) {
		super(nombre, salario);
		this.bonoAdicional = bonoAdicional;
	}
	
	@Override 
	public double calcularSalario() {
		return salario + bonoAdicional;
	}
//sobrescribi este metodo para calcular el salario del gerente 
}
//Aplique herencia en esta clase al redifinir un metodo y para poder ahorrarme codigo con atributos que necesitaba 
// y que estaban en la clase padre Empleado