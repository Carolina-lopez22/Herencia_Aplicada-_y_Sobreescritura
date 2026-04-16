package herencia.aplicada.sobreescrita;

public class Main {

	public static void main(String[] args) {
		ejemploPractico();
		ejercicio1();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
		ejercicio6();

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
	public static void ejercicio3() {
		ProductoPerecedero produc = new ProductoPerecedero ("Leche", 15.20, 25,3,2020);
		ProductoPerecedero product = new ProductoPerecedero ("Jamon", 25.50, 15,5,2029);
		
		System.out.println("Producto: "+produc.nombre+ " Precio:"+ produc.precio + " "+produc.estaVencido());
		System.out.println("Producto: "+product.nombre+ " Precio:"+ product.precio + " "+product.estaVencido());
	}
	public static void ejercicio4() {
		Bus bus = new Bus (60, "De Jutiapa hacia Jalapa");
		System.out.println(bus.descripcion()); 
	}
	public static void ejercicio5() {
		Gerente gerente = new Gerente("David", 8000, 1000);
		System.out.println("Nombre: "+ gerente.nombre);
		System.out.println("Salario total: "+gerente.calcularSalario()); 	
	}
	public static void ejercicio6() {
		Perro perro = new Perro("Bruno","Chihuahua");
		System.out.println(perro);
		perro.hacerSonido();
	}
}







