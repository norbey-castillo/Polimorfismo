package polimorfismo;

public class ProductoDigital extends Producto{
	
	private String descripcion;

	
	public ProductoDigital(String nombre, double precio, String descripcion) {
		super(nombre, precio);
		this.descripcion = descripcion;
	}

	@Override
	public void MostrarDescripcion() {
		System.out.println("\nNombre del producto: " + nombre);
		System.out.println("Precio del producto: " + precio);
		System.out.println("Descrpcion: " + this.descripcion);
	}
	
	
	/*SE SOBREESCRIBIO ESTE METODO PARA AGREGAR LA DESCRIPCION DEL PRODUCTO */
	

}
