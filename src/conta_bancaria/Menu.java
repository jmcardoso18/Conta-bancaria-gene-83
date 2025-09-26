package conta_bancaria;

import java.util.InputMismatchException;
import java.util.Scanner;

import conta_bancaria.controller.ContaController;
import conta_bancaria.model.Conta;
import conta_bancaria.model.Conta_corrente;
import conta_bancaria.model.Conta_poupanca;
import conta_bancaria.util.Cores;

public class Menu {
	// Moedas = bigdecimal

	// Instanciando classe Scanner
	private static final Scanner sc = new Scanner(System.in);
	private static final ContaController contraController = new ContaController();

	// Declarando constantes para as variaveis do switch case

	private static final int CRIAR_CONTA = 1;
	private static final int LISTAR_CONTAS = 2;
	private static final int BUSCAR_CONTA = 3;
	private static final int ATUALIZAR_CONTA = 4;
	private static final int APAGAR_CONTA = 5;
	private static final int SACAR = 6;
	private static final int DEPOSITAR = 7;
	private static final int TRANSFERIR = 8;
	private static final int SAIR = 9;

	public static void main(String[] args) {

		// Declarando variaveis
		int opcao = 0;

		criarContasTeste();

		// iniciando lopping
		while (opcao != 9) {

			exibirMenu();

			// Colocar em um Loop para só sair quando usuario entrar com um valor válido
			boolean loop = true;
			do {

				try {
					opcao = sc.nextInt();
					sc.nextLine();
					loop = false;
				} catch (InputMismatchException e) {
					opcao = -1;
					System.err.println(Cores.TEXT_RESET + "Opção inválida! Digite um número inteiro:");
					sc.nextLine();
				}
			} while (loop);

			// Iniciando switch para direcionar as ações necessarias
			switch (opcao) {
			case CRIAR_CONTA -> {
				System.out.println("Cadastrar nova conta");
				cadastrarConta();

				keyPress();
				break;
			}
			case LISTAR_CONTAS -> {
				System.out.println("Listar todas as contas");
				listarContas();

				keyPress();
				break;
			}

			case BUSCAR_CONTA -> {
				System.out.println("Procurar conta por número");
				procurarContaPorNumero();
				keyPress();
				break;
			}
			case ATUALIZAR_CONTA -> {
				System.out.println("Atualizar conta");
				atualizarConta();
				
				keyPress();
				break;
			}
			case APAGAR_CONTA -> {
				System.out.println("Deletar conta");
				deletarConta();
				keyPress();
				break;
			}
			case SACAR -> {
				System.out.println("Opção 6");
				keyPress();
				break;
			}
			case DEPOSITAR -> {
				System.out.println("Opção 7");
				keyPress();
				break;
			}

			case TRANSFERIR -> {
				System.out.println("Opção 8");
				keyPress();
				break;
			}
			case SAIR -> {
				sobre();
				System.exit(0);
				break;
			}
			default -> {
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "⚠ Opção inválida! Tente novamente.");
			}
			}

		}
		System.out.println(Cores.TEXT_RESET + Cores.ANSI_BLACK_BACKGROUND);
		// Fechando scanner
	}

	private static void exibirMenu() {
		System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND);
		System.out.println("************************************************************************");
		System.out.println("                                                                        ");
		System.out.println("                          BANCO FLORESTAL                               ");
		System.out.println("                                                                        ");
		System.out.println("************************************************************************");
		System.out.println("                                                                        ");
		System.out.println("                      1- Criar conta                                    ");
		System.out.println("                      2- Listar todas as contas                         ");
		System.out.println("                      3- Buscar conta por Numero                        ");
		System.out.println("                      4- Atualizar Dados da Conta                       ");
		System.out.println("                      5- Apagar conta                                   ");
		System.out.println("                      6- Sacar                                          ");
		System.out.println("                      7- Depositar                                      ");
		System.out.println("                      8- Transferir valores entre contas                ");
		System.out.println("                      9- Sair                                           ");
		System.out.println("                                                                        ");
		System.out.println("************************************************************************");
		System.out.println("                                                                        ");
		System.out.print("Entre com a opção desejada:");

	}

	private static void sobre() {
		System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND);
		System.out.println("BANCO FLORESTAL AGRADECE PELA PREFERÊNCIA! VOLTE SEMPRE                 ");
		System.out.println("                                                                        ");
		System.out.println("************************************************************************");
		System.out.println("                          BANCO FLORESTAL                               ");
		System.out.println("************************************************************************");
		System.out.println("Projeto desenvolvido por:                                               ");
		System.out.println("Jamila Moraes Cardoso - jmc18.ads@gmail.com                             ");
		System.out.println("github.com/jmcardoso18                                                  ");
		System.out.println("************************************************************************");
	}

	private static void keyPress() {
		System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para continuar...");
		sc.nextLine();
	}

	private static void criarContasTeste() {
		contraController.cadastrar(
				new Conta_corrente(contraController.gerarNumero(), 456, 1, "Thuany Silva", 1000000.00f, 100000.00f));
		contraController
				.cadastrar(new Conta_poupanca(contraController.gerarNumero(), 456, 2, "Rafaela Lemes", 100000.00f, 15));
	}

	private static void listarContas() {
		contraController.listasTodas();
	}

	private static void cadastrarConta() {
		System.out.println("Digite o número da agência:");
		int agencia = sc.nextInt();

		System.out.println("Digite o nome do titular:");
		sc.skip("\\R");
		String titular = sc.nextLine();

		System.out.println("Digite o tipo da conta (1 - CC| 2 - CP):");
		int tipo = sc.nextInt();

		System.out.println("Digite o Saldo inicial: ");
		float saldo = sc.nextFloat();

		switch (tipo) {
		case 1 -> {
			System.out.println("Digite o limite inicial da conta: ");
			float limite = sc.nextFloat();
			contraController.cadastrar(
					new Conta_corrente(contraController.gerarNumero(), agencia, tipo, titular, saldo, limite));
		}
		case 2 -> {
			System.out.println("Digite a data do aniversário: ");
			int aniversario = sc.nextInt();
			contraController.cadastrar(
					new Conta_poupanca(contraController.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
		}
		default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválida" + Cores.TEXT_RESET);
		}
	}

	private static void procurarContaPorNumero() {
		System.out.println("Digite o numéro da conta: ");
		int numero = sc.nextInt();
		sc.nextLine();

		contraController.procurarPorNumero(numero);
	}

	private static void deletarConta() {
		System.out.println("Digite o numéro da conta: ");
		int numero=sc.nextInt();
		sc.nextLine();
		Conta conta = contraController.buscarNaColletion(numero);
		if(conta != null) {
			System.out.println("\nTem certeza que deseja excluir essa conta?(S/N):");
		    String confirmacao = sc.nextLine();
		
		if(confirmacao.equalsIgnoreCase("S")) {
			contraController.deletar(numero);
		}else {
			System.out.println("\nOperação cancelada!");
		}
		}else {
			System.out.printf("A conta número: %d não foi encontrada!%n", numero);
		}
		
	}
	
	private static void atualizarConta() {
		System.out.println("Digite o numéro da conta: ");
		int numero=sc.nextInt();
		sc.nextLine();
		Conta conta = contraController.buscarNaColletion(numero);
		if(conta != null) {
			
			int agencia=conta.getAgencia();
			String titular = conta.getTitular();
			int tipo=conta.getTipo();
			float saldo=conta.getSaldo();
			
			System.out.printf("A Agência atual: %d\nNova Agência (Pressione ENTER para manter o valor atual):",agencia);
			String entrada=sc.nextLine();
			agencia=entrada.isEmpty() ? agencia:Integer.parseInt(entrada);
			
			
			//System.out.printf("O titular atual: %s\nNovo Titular (Pressione ENTER para manter o valor atual):",titular);
			//entrada=sc.nextLine();
			//titular=entrada.isEmpty() ? titular:entrada;

			System.out.printf("O nome do Titular atual: %s\nNovo Titular (Pressione ENTER para manter o valor atual): ", titular);
			entrada = sc.nextLine();
			titular = entrada.isEmpty() ? titular : entrada;
			
			System.out.printf("O saldo atual: %.f\nNovo Saldo (Pressione ENTER para manter o valor atual):",saldo);
			entrada=sc.nextLine();
			saldo=entrada.isEmpty() ? saldo :Float.parseFloat(entrada);

			switch (tipo) {
			case 1 -> {
				float limite = ((Conta_corrente)conta).getLimite();
				System.out.printf("O saldo atual: %.f\nNovo Saldo (Pressione ENTER para manter o valor atual:)",limite);
				entrada=sc.nextLine();
				limite=entrada.isEmpty() ? limite :Float.parseFloat(entrada);
				contraController.atualizar(
						new Conta_corrente(numero, agencia, tipo, titular, saldo, limite));
			}
			case 2 -> {
				int aniversario = ((Conta_poupanca)conta).getAniversario();
				System.out.printf("O saldo atual: %.f\nNovo Saldo (Pressione ENTER para manter o valor atual:)",aniversario);
				entrada=sc.nextLine();
				aniversario=entrada.isEmpty() ? aniversario : Integer.parseInt(entrada);
				contraController.atualizar(
						new Conta_poupanca(numero, agencia, tipo, titular, saldo, aniversario));
			}
			default -> System.out.println(Cores.TEXT_RED + "Tipo de conta inválida" + Cores.TEXT_RESET);
			}
			
		}else {
			System.out.printf("A conta número: %d não foi encontrada!%n", numero);
		}
		
	}
}
