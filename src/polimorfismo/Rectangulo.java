package polimorfismo;

public class Rectangulo extends Figura{

	@Override
	public double area(double base, double altura) {
		System.out.println("\nEl area del rectangulo es: "+ base * altura);
		return 0;
		
	}
	

}
