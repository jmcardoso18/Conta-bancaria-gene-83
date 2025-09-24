package conta_bancaria.model;

public class Conta_poupanca extends Conta {
	
	private int aniversario;

	public Conta_poupanca(int numero, int agencia, int tipo, String titular, float saldo,int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		this.aniversario=aniversario;
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.printf("Dia do aniversário: %d%n",aniversario);
	}
}
