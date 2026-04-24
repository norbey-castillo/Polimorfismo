package polimorfismo;

public class main {

	public static void main(String[] args) {
		Animal Perro = new Perro();
		Figura Rectangulo = new Rectangulo();
		Empleado Vendedor = new Vendedor("Norbey", 850);
		Cuenta CuentaAhorro = new CuentaAhorro(5800, 10 );
		Transporte Avion = new Avion();
		Persona Estudiante = new Estudiante("Oscar","Gonzalez",20,"0905-25-9175","Ingenieria en sistemas");
	
		
		Perro.hacerSonido();
		Rectangulo.area(5, 5);
		Vendedor.resumen();
		CuentaAhorro.depositar(350);
		Avion.moverse();
		Estudiante.presentarse();
		
		
	}
}
