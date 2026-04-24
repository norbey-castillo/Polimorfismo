package polimorfismo;

public class Cuenta {
	private double Saldo;

	public Cuenta(double saldo) {
		super();
		Saldo = saldo;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}
	
	public double depositar(double monto) {
		if(monto > 0) {
			double total = this.Saldo + monto;
			System.out.println("\nDeposito realizado correctamente! ");
			System.out.println("Su saldo total es de: " + total);
		}else {
			System.out.println("El deposito no se pudo efectuar! ");
		}
		return 0;
	}

}
