package polimorfismo;

public class Rectangulo extends Figura{

	@Override
	public double area(double base, double altura) {
		System.out.println("\nEl area del rectangulo es: "+ base * altura);
		return 0;
		
	}
	
	/*SE SOBREESCRIBIO ESTE METODO PARA VALIDAR CUAL ES EL AREA DEL RECTANGULO INGRESADO*/

}
