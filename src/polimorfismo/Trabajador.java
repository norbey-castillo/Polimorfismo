package polimorfismo;

public class Trabajador {
	
	public double calcularPago(double diasLaborados) {
		int horasPorDia = 8;
		double pagoPorHora = 80;
		
		double calculoHoras = diasLaborados * horasPorDia;
		double pago = calculoHoras * pagoPorHora;
	
		return 0;
	}

}
