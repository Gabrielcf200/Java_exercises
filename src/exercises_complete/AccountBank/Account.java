package exercises_complete.AccountBank;

public class Account {
	private int numeroconta;
	private String nomeconta;
	private double valorconta = 0;
	
	public Account(int numeroconta, String nomeconta){
		this.numeroconta = numeroconta;
		this.nomeconta = nomeconta;	
	}

	public void DepositoConta(double valor) {
		valorconta += valor;
	}
	
	public boolean SacarConta(double valor) {
		if (valorconta >= valor) {
			valorconta -= valor - 5;
			System.out.println("Saldo Realizado!");
			return true;
		}
		else {
			System.out.println("Saldo Insuficente!");
			return false;
		}
	}
	
	

	
	// get e set
	public int getNumeroconta() {
		return numeroconta;
	}
	
	
	public String getNomeconta() {
		return nomeconta;
	}

	public void setNomeconta(String nomeconta) {
		this.nomeconta = nomeconta;
	}

	public double getValorconta() {
		return valorconta;
	}

	@Override
	public String toString() {
		return "%nUpdated account data:%nAccount " + numeroconta + ", Holder " + nomeconta.toUpperCase() + ", Balance " + valorconta +"%n";
	}
	
	

		
}
