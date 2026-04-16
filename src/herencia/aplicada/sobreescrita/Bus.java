package herencia.aplicada.sobreescrita;

public class Bus extends Transporte{
	private String ruta;

	public Bus(int capacidad, String ruta) {
		super(capacidad);
		this.ruta = ruta;
	}
	
public String descripcion() {
	return "Capacidad: "+ capacidad+" Personas" + " Ruta: " + ruta;
}
}
