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
