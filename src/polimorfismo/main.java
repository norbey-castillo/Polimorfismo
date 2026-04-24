package polimorfismo;

public class main {

	public static void main(String[] args) {
		Animal Perro = new Perro();
		Figura Rectangulo = new Rectangulo();
		Empleado Vendedor = new Vendedor("Norbey", 850);
		Cuenta CuentaAhorro = new CuentaAhorro(5800, 10 );
		Transporte Avion = new Avion();
		Persona Estudiante = new Estudiante("Oscar","Gonzalez",20,"0905-25-9175","Ingenieria en sistemas");
		Vehiculo Motocicleta = new Motocicleta();
		Producto Producto = new ProductoDigital("Azucar",5,"Sin endulzantes artificiales");
		Instrumento Guitarra = new Guitarra();
		Trabajador TrabajadorPorHora = new TrabajadorPorHora();
		
		
		Perro.hacerSonido();
		Rectangulo.area(5, 5);
		Vendedor.resumen();
		CuentaAhorro.depositar(350);
		Avion.moverse();
		Estudiante.presentarse();
		Motocicleta.encender();
		Producto.MostrarDescripcion();
		Guitarra.tocar();
		TrabajadorPorHora.calcularPago(5);
		
		
	}
}

/*¿COMO APLIQUE LA HERENCIA?
 * 
 * La herencia la aplique en todos los ejercicios a la hora de implementar una clase padre
 * que le pudiera heredar atributos o en algunos casos metodos a las clases hijas, dando asi
 * herencia aplicada a cada ejercicio... 
 * 
 * juntamente se aplico el polimorfismo para referenciar
 * a la clase padre cuando se quiere usar una clase hija que hereda atributos o metodos de la
 * clase padre. */
