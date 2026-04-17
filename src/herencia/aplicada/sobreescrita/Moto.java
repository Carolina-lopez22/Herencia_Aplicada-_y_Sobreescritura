package herencia.aplicada.sobreescrita;

public class Moto extends Vehiculo{
	private  int cilindrada;

	public Moto(String marca, double velocidad, int cilindrada) {
		super(marca, velocidad);
		this.cilindrada = cilindrada;
	}

	public String mostrarInfo() {
		return "Marca: " + marca+" Velocidad: "+velocidad+" Cilindrada: "+cilindrada;
	}
}
//Aplique herencia en esta clase para no tener que repetir variables que estan en la clase padre que es la clase vehiculo
//De esta manera se ahorra codigo 
