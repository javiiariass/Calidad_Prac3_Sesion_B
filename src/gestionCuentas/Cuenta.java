package gestionCuentas;

public class Cuenta {
	String numero;
	String titular;
	double saldo = 0;

	public Cuenta() {
		this.saldo = 0;
	}

	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Cuenta(String numero, String titular) {
		super();
		this.numero = numero;
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void ingreso(double valor) {
		if (valor < 0) {
			System.out.println("No se pueden hacer ingresos negativos");
			return;
		}

		saldo += valor;
	}

	public void reintegro(double valor) {
		if (valor < 0) {
			System.out.println("No se pueden hacer reintegros negativos");
			return;
		}

		if (saldo - valor < -500) {
			System.out.println("Fondos insuficientes (Saldo " + saldo + "€) en la cuenta " + numero
					+ " para el reintegro" + " de " + valor + "€");
			return;
		}

		saldo -= valor;
	}

}
