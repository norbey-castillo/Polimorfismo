package polimorfismo;

public class Guitarra extends Instrumento {
	
	@Override
	public void tocar() {
		System.out.println("\nEl solo de Guitarra suena, bien! ");
	}

	/*SE SOBREESCRIBIO ESTE METDO PARA VALIDAR QUE LA GUITARRA SONABA BIEN*/
	
}
