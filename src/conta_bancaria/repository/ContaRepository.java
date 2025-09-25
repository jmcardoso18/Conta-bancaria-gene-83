package conta_bancaria.repository;

import conta_bancaria.model.Conta;

public interface ContaRepository {
	//Métodos do CRUD
	
	public  void listasTodas();
	public void cadastrar(Conta conta);
	public void atualizar(Conta conta);
	public void procurarPorNumero(int numero);
	public void deletar(int numero);
	
	//Métodos bancarios
	
	public void sacar(int numero,float valor);
	public void depositar(int numero,float valor);
	public void tranferir(int numOrigem,int numDestino,float valor);
	
	

}
