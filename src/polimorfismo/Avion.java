package polimorfismo;

public class Avion extends Transporte{

	@Override
	public void moverse() {
		System.out.println("\nEl avion se mueve por el aire! ");
	}
	
	/* SOBREESCRIBI ESTE METODO PARA REFERENCIAR QUE EL AVION SE MUEVE POR EL AIRE
	 * UTILIZANDO UN METODO DECLARADO EN LA CLASE PADRE, TRANSPORTE*/

}
