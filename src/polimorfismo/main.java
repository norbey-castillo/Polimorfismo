package polimorfismo;

public class main {

	public static void main(String[] args) {
		Animal Perro = new Perro();
		Figura Rectangulo = new Rectangulo();
		Empleado Vendedor = new Vendedor("Norbey", 850);
		Cuenta CuentaAhorro = new CuentaAhorro(5800, 10 );
		
		Perro.hacerSonido();
		Rectangulo.area(8,5);
		Vendedor.resumen();
		CuentaAhorro.depositar(350);
		
	}
}
