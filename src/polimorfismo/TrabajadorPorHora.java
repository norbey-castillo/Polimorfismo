package polimorfismo;

public class TrabajadorPorHora extends Trabajador {
	
	@Override
	public double calcularPago(double diasLaborados) {
		int horasPorDia = 8;
		double pagoPorHora = 80;
		
		double calculoHoras = diasLaborados * horasPorDia;
		double pagoSemanal = calculoHoras * pagoPorHora;
		double pagoMensual = pagoSemanal * 4;
		
		System.out.println("\nDias trabajados: "+ diasLaborados);
		System.out.println("Horas trabajadas: "+ calculoHoras);
		System.out.println("Pago por hora: "+ pagoPorHora);
		System.out.println("Pago Semanal: " + pagoSemanal);
		System.out.println("Pago Mensual Total: " + pagoMensual);
		
		return 0;
	}

}
