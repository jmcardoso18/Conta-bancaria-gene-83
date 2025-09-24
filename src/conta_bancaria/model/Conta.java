package conta_bancaria.model;

public class Conta {

	// Atributos da classe conta
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;

	public Conta(int numero, int agencia, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean sacar(float valor) {
		if (valor > this.saldo) {
			System.out.println("\nSalto Insuficiente");
			return false;
		}
		this.saldo -= valor;
		return true;
	}
	
	public void depositar(float valor) {
	
		this.saldo += valor;
	}

	public void visualizar() {
		String tipo = " ";

		switch (this.tipo) {
		case 1 -> tipo = "1 - Conta Corrente";
		case 2 -> tipo = "2 - Conta Poupança";
		default -> tipo = "Desconhecido";

		}

		System.out.println("\n******************************************");
		System.out.println("\n***********  DADOS DA CONTA  *************");
		System.out.println("\n******************************************");
		System.out.printf("Número da conta: %d%n", this.numero);
		System.out.printf("Número da agência: %d%n", this.agencia);
		System.out.printf("Tipo: %s%n", tipo);
		System.out.printf("Titular da conta: %s%n", this.titular);
		System.out.printf("Saldo da conta: R$ %.2f%n", this.saldo);

	}

}
