package herencia.aplicada.sobreescrita;

public class Main {

	public static void main(String[] args) {
		System.out.println("********** Ejemplo Practico **********");
		ejemploPractico();
		System.out.println("________________________________________________________________________________");
		System.out.println("********** Ejercicio 1  **********");
		ejercicio1();
		System.out.println("________________________________________________________________________________");
		System.out.println("********** Ejercicio 2  **********");
		ejercicio2();
		System.out.println("________________________________________________________________________________");
		System.out.println("********** Ejercicio 3  **********");
		ejercicio3();
		System.out.println("________________________________________________________________________________");
		System.out.println("********** Ejercicio 4  **********");
		ejercicio4();
		System.out.println("________________________________________________________________________________");
		System.out.println("********** Ejercicio 5  **********");
		ejercicio5();
		System.out.println("________________________________________________________________________________");
		System.out.println("********** Ejercicio 6  **********");
		ejercicio6();
		System.out.println("________________________________________________________________________________");
		System.out.println("********** Ejercicio 7  **********");
		ejercicio7();
		System.out.println("________________________________________________________________________________");
		System.out.println("********** Ejercicio 8  **********");
		ejercicio8();
		System.out.println("________________________________________________________________________________");
		System.out.println("********** Ejercicio 9  **********");
		ejercicio9();
		System.out.println("________________________________________________________________________________");
		System.out.println("********** Ejercicio 10 **********");
		ejercicio10();
		System.out.println("________________________________________________________________________________");
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
		Docente doc = new Docente("Manuel", 35, "Matematicas");//Caso de prueba para mostrar la informacion correctamente
		Estudiante estud = new Estudiante("Erica", 22, "0502");//Caso de prueba para mostrar la informacion correctamente
		
		System.out.println("Docente: "+ doc.mostrar()); 
		System.out.println("Estudiante: "+ estud.mostrar());
	}
	public static void ejercicio2() {
		CuentaCorriente cuenta2 = new CuentaCorriente(500);
		cuenta2.retirar(1000);//Caso de prueba que comprueba como se puede sobregirar la cuenta
		cuenta2.retirar(6000);//Caso que comprueba que no permite pasar el limite de sobregiro
		System.out.println("Saldo de cuenta Corriente: "+ cuenta2.saldo);
	}
	public static void ejercicio3() {
		ProductoPerecedero produc = new ProductoPerecedero ("Leche", 15.20, 25,3,2020);//Caso de prueba que muestra la comprobacion de un articulo vencido
		ProductoPerecedero product = new ProductoPerecedero ("Jamon", 25.50, 15,5,2029);//Caso de prueba que muestra la comprobacion de un articulo que no ha vencido
		
		System.out.println("Producto: "+produc.nombre+ " Precio:"+ produc.precio + " "+produc.estaVencido());
		System.out.println("Producto: "+product.nombre+ " Precio:"+ product.precio + " "+product.estaVencido());
	}
	public static void ejercicio4() {
		Bus bus = new Bus (60, "De Jutiapa hacia Jalapa");//Caso de prueba para mostrar la informacion correctamente
		System.out.println(bus.descripcion()); 
	}
	public static void ejercicio5() {
		Gerente gerente = new Gerente("David", 8000, 1000);//Caso de prueba que muestra el calculo del salario
		System.out.println("Nombre: "+ gerente.nombre);
		System.out.println("Salario total: "+gerente.calcularSalario()); 	
	}
	public static void ejercicio6() {
		Perro perro = new Perro("Bruno","Chihuahua");//Caso de prueba para mostrar la informacion correctamente y que se muestre el sonido
		System.out.println(perro);
		perro.hacerSonido();
	}
	public static void ejercicio7() {
		Moto moto = new Moto ("Honda",150,220);//Caso de prueba para mostrar la informacion correctamente 
		System.out.println(moto.mostrarInfo());
	}
	public static void ejercicio8() {
	Rectangulo rectangulo = new Rectangulo ("Rojo",6.2,7.4);//Caso de prueba para comprobar que se calcule el area del rectangulo correctamente
	Circulo circulo = new Circulo("Verde",4);//Caso de prueba para comprobar que se calcule el area del circulo correctamente
	rectangulo.calcularArea();
	circulo.calcularArea();
	
	System.out.println(rectangulo);
	System.out.println(circulo);
	}
	public static void ejercicio9(){
		Libro lib1 =new Libro("El Principito","Hugo.Vela");
		LibroDigital lib2 =new LibroDigital("La Escalera","Angel.Ortiz",50.6);
		System.out.println(lib1.mostrarInfo());
		System.out.println(lib2.mostrarInfo());
		//casos de prueba para que se muestre la info correctamente
	}
	public static void ejercicio10() {
		Cliente cliente = new Cliente ("David Solis", 45258);
		Cliente cliente2 = new Cliente ("Sara Oliva ", 52359);
	
		FacturaContado factura1 = new FacturaContado(01,cliente,5000,10000);//Caso de prueba para comprobar que no se admite un total negativo
		FacturaCredito factura2 = new FacturaCredito(02,cliente2,7000,-5,-50);//caso de prueba para comprobar que no se admite negativos
		
		System.out.println("Nombre: "+cliente.getNombre()+ " NIT: "+cliente.getNIT());
		System.out.println(factura1);

		System.out.println("Nombre: "+cliente2.getNombre()+ " NIT: "+cliente2.getNIT());
		System.out.println(factura2);

	}
	}







