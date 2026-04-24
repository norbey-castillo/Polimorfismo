package polimorfismo;

public class CuentaAhorro extends Cuenta{
	private double interes;

	public CuentaAhorro(double saldo, double interes) {
		super(saldo);
		this.interes = interes;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
	
	@Override
	public double depositar(double monto) {
		if(monto > 0) {
			double interes = monto * this.interes / 100;
			double total = getSaldo() + (monto - interes);
			System.out.println("\nDeposito realizado correctamente! ");
			System.out.println("El interes es de: " + interes);
			System.out.println("Su saldo total es de con : " + total);
		}else {
			System.out.println("El deposito no se pudo efectuar! ");
		}
		return 0;
	}

}
