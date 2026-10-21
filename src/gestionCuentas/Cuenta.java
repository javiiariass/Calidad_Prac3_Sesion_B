package gestionCuentas;

public class Cuenta {
	String numero;
	String titular;
	double saldo;
	
	public double getSaldo() {
		return saldo;
	}
	
	public void ingreso(double valor) {
		saldo = 500;
	}
	
	public void reintegro(double valor) {
		saldo = -500;
	}

	

}
