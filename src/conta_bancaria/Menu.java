package conta_bancaria;

import java.util.Scanner;

import conta_bancaria.util.Cores;

public class Menu {
	// Moedas = bigdecimal
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

		// Instanciando classe Scanner
		Scanner sc = new Scanner(System.in);
		// Declarando variaveis
		int opcao = 0;

		// iniciando lopping
		while (opcao != 9) {

			exibirMenu();

			// Validando a entrada de opcao para apenas inteiro
			while (!sc.hasNextInt()) {// enquanto não for inteiro
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("Entrada inválida! Digite apenas números inteiros.");
				sc.next();// limpa
				System.out.print("Entre com a opção desejada: ");

			}
			System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND);
			opcao = sc.nextInt();

			// Iniciando switch para direcionar as ações necessarias
			switch (opcao) {
			case CRIAR_CONTA -> System.out.println("Opção 1");
			case LISTAR_CONTAS -> System.out.println("Opção 2");
			case BUSCAR_CONTA -> System.out.println("Opção 3");
			case ATUALIZAR_CONTA -> System.out.println("Opção 4");
			case APAGAR_CONTA -> System.out.println("Opção 5");
			case SACAR -> System.out.println("Opção 6");
			case DEPOSITAR -> System.out.println("Opção 7");
			case TRANSFERIR -> System.out.println("Opção 8");
			case SAIR -> {
				sobre();
			}
			default -> System.out.println(Cores.TEXT_RED_BOLD_BRIGHT + "⚠ Opção inválida! Tente novamente.");
			}

		}
		System.out.println(Cores.TEXT_RESET + Cores.ANSI_BLACK_BACKGROUND);
		// Fechando scanner
		sc.close();

	}

	public static void exibirMenu() {
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

	public static void sobre() {
		System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + Cores.ANSI_BLUE_BACKGROUND);
		System.out.println("Banco Florestal agradece pela preferência! Volte sempre                 ");
		System.out.println("                                                                        ");
		System.out.println("************************************************************************");
		System.out.println("                          BANCO FLORESTAL                               ");
		System.out.println("************************************************************************");
		System.out.println("Projeto desenvolvido por:                                               ");
		System.out.println("Jamila Moraes Cardoso - jmc18.ads@gmail.com                             ");
		System.out.println("github.com/jmcardoso18                                                  ");
		System.out.println("************************************************************************");
	}

}
