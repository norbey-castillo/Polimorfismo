package polimorfismo;

public class Vendedor extends Empleado{
	private double comision;

	public Vendedor(String nombre, double comision) {
		super(nombre);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public void resumen() {
		System.out.println("\nEl nombre del vendedor es: " + getNombre());
		System.out.println("La comision por las ventas es de: " + comision);
	}
	
	
	/*SE SOBREESCRIBIO ESTE METODO PARA AGREGAR LA COMISION QUE SE LE DARA
	 * AL VENDEDOR*/

}
