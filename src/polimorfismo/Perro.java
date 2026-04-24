package polimorfismo;

public class Perro extends Animal{

	@Override
	public void hacerSonido() {
		System.out.println("El perro ladra! ");
		
	}
/*ESTE METODO SE SOBREESCRIBIO PARA IDENTIFICAR QUE EL PERRO EFECTIVAMENTE PUEDE LADRAR*/
}
