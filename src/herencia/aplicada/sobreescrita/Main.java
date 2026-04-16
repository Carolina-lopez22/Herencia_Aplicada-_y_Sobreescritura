package herencia.aplicada.sobreescrita;

public class Main {

	public static void main(String[] args) {
		ejemploPractico();
		ejercicio1();
		ejercicio2();

	}
	public static void ejemploPractico() {
		Cuenta cuenta = new Cuenta(200);
		CuentaAhorro cuenta1 = new CuentaAhorro(300, 20);
		cuenta.depositar(500);
		cuenta.retirar(100);
		cuenta1.depositar(50);
		cuenta1.retirar(800);
		
		System.out.println("Saldo de cuenta: "+cuenta.saldo);
		System.out.println("Saldo cuenta de ahorro: "+cuenta1.saldo);	
	}
	public static void ejercicio1() {
		Docente doc = new Docente("Manuel", 35, "Matematicas");
		Estudiante estud = new Estudiante("Erica", 22, "0502");
		
		System.out.println("Docente: "+ doc.mostrar()); 
		System.out.println("Estudiante: "+ estud.mostrar());
	}
	public static void ejercicio2() {
		CuentaCorriente cuenta2 = new CuentaCorriente(500);
		cuenta2.retirar(1000);
		cuenta2.retirar(6000);
		System.out.println("Saldo de cuenta Corriente: "+ cuenta2.saldo);
	}

}
