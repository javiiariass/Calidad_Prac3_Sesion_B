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
		saldo += valor;
	}
	
	public void reintegro(double valor) {
		saldo -= valor;
	}

	

}
