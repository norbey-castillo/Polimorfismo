package polimorfismo;

public class Empleado {
	private String nombre;
	
	
	
	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void resumen() {
		System.out.println("El nombre del empleado es: " + nombre);
	}

}
