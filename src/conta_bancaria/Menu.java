package conta_bancaria;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import conta_bancaria.util.Cores;

public class Menu {
	// Moedas = bigdecimal
	public static void main(String[] args) {
		
		// Instanciando classe Scanner
		Scanner sc = new Scanner(System.in);
		// Declarando variaveis
		int opcao = 0;

		// iniciando lopping
		while (opcao != 9) {
			System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT+ Cores.ANSI_BLUE_BACKGROUND);
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
			// Validando a entrada de opcao para apenas inteiro
			while (!sc.hasNextInt()) {// enquanto não for inteiro
				System.out.println(Cores.TEXT_RED_BOLD_BRIGHT+ Cores.ANSI_BLACK_BACKGROUND);
				System.out.println("Entrada inválida! Digite apenas números inteiros.");
				sc.next();// limpa
				System.out.print("Entre com a opção desejada: ");
				
			}
			opcao = sc.nextInt();

			// Iniciando switch para direcionar as ações necessarias
			switch (opcao) {
			case 1: {
				System.out.println("Opção 1");
				break;
			}
			case 2: {
				System.out.println("Opção 2");
				break;
			}
			case 3: {
				System.out.println("Opção 3");
				break;
			}
			case 4: {
				System.out.println("Opção 4");
				break;
			}
			case 5: {
				System.out.println("Opção 5");
				break;
			}
			case 6: {
				System.out.println("Opção 6");
				break;
			}
			case 7: {
				System.out.println("Opção 7");
				break;
			}
			case 8: {
				System.out.println("Opção 8");
				break;
			}
			case 9: {
				System.out.println();
				System.out.println("Banco Florestal agradece pela preferência! Volte sempre");
				sobre();
				sc.close();
				System.exit(0);
			}
			default: {
				System.out.println("Opção inválida!");
			}

			}

		}
		System.out.println(Cores.TEXT_RESET + Cores.ANSI_BLACK_BACKGROUND);
		// Fechando scanner
		sc.close();
	}
	
	
	public static void sobre() {
		System.out.println("************************************************************************");
		System.out.println("                          BANCO FLORESTAL                               ");
		System.out.println("************************************************************************");
		System.out.println("Projeto desenvolvido por:                                               ");
		System.out.println("Jamila Moraes Cardoso - jmc18.ads@gmail.com                             ");
		System.out.println("github.com/jmcardoso18                                                  ");
		System.out.println("************************************************************************");
	}

}
