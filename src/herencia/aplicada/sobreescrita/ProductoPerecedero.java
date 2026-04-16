package herencia.aplicada.sobreescrita;

public class ProductoPerecedero extends Producto {
private int dia;
private int mes;
private int año;

public ProductoPerecedero(String nombre, double precio, int dia, int mes, int año) {
	super(nombre, precio);
	this.dia = dia;
	this.mes = mes;
	this.año = año;
}
public String estaVencido() {
	int diaActual = 18;
	int mesActual = 4;
	int añoActual = 2026;
	
	if (año < añoActual) 
		return "El producto esta vencido";
	if(año == añoActual && mes > mesActual) 
		return "El producto esta vencido";
	if(año == añoActual && mes == mesActual && dia <= diaActual) 
		return "El producto esta vencido";

	return "Producto bueno";
	}
}

