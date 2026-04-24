package polimorfismo;

public class Estudiante extends Persona{
	private String carnet;
	private String carrera;
	
	public Estudiante(String nombre, String apellido, int edad, String carnet, String carrera) {
		super(nombre, apellido, edad);
		this.carnet = carnet;
		this.carrera = carrera;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public void presentarse() {
		System.out.println("\nHola!");
		System.out.println("Hola, mi nombre es: "+ nombre + " " + apellido);
		System.out.println("mi edad es: "+ edad);
		System.out.println("Estoy estudiando: " + this.carrera);
		System.out.println("Mi carnet es: " + this.carnet);
	}
	
	
	/*SE SOBREESCRIBIO ESTE METODO PARA AGREGAR LA CARRERA Y EL CARNET DEL ESTUDIANTE ASIGNADO*/
	

}
