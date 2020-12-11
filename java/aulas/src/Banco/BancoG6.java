package Banco;

import java.util.Random;
import java.util.Scanner;

public class BancoG6 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		final int tamanho = 80;
		final int MAXMOVIMENTACOES = 3;
		String clientes[] = new String[] { "Allen de Lima Vieira", "André de Brito Silva da Costa",
				"Bárbara Liboni Guerra", "Beatriz Martins", "Beymar Jhoel Acapa Lima",
				"Breno Nogueira Botelho Noccioli", "Daniel Augusto Gomes Ferreira Filho", "Danilo Mendes Ferreira",
				"Danilo Pereira da Silva", "Davi Silva Vieira", "Diego Vinicio da Silva Nascimento",
				"Erick Costa Ferreira", "Ewerton Inacio Lima", "Fernanda Agapito", "Fernanda Barbosa Ferraz",
				"Francisco José Pires", "Gabriel Enrique Cabral", "Gabriel Sérgio Nascimento Santos Gonçalves",
				"Gideão da Silva Idelfonso", "Gilson Amorim de Matos", "Guilherme Gonçalves da Silva",
				"Gustavo Rabelo Teles", "Heloisa Beatriz de Oliveira Costa", "Igor Mateus Queiroz Gato",
				"Isabel Emiko Yamakawa Oyama", "Jackeline Akemi de Moura", "José Jorge Hauck Júnior",
				"Juliana Santos André", "Kélven Cleiton de Araújo Brandão", "Laís Lima Santos", "Lucas Anseloni Barros",
				"Lucas Gonçalves da Silva", "Luis felipe da silva", "Luiz Felipe da Silva Magalhães",
				"Marcos Eduardo Gomes Gonçalves", "Micaely da Silva Lima", "Rafaela Oliveira Silva",
				"Tiago dos Santos Martins", "Verônica Navarro Almenara", "Vinicius Alves Miranda" };
		char genero[] = new char[] { 'M', 'M', 'F', 'F', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'M', 'F', 'F', 'M',
				'M', 'M', 'M', 'M', 'M', 'M', 'F', 'M', 'F', 'F', 'M', 'F', 'M', 'F', 'M', 'M', 'M', 'M', 'M', 'F', 'F',
				'M', 'F', 'M' };
		int tipoConta[] = new int[40];
		int conta[] = new int[40];
		int contaUsuario, opcao;
		double saldo[] = new double[40];
		char tConta, continuar;
		double saldoConta=0.0;
		char a = ' ';
		saldoConta = 0.0;

		Random r = new Random();

		for (int i = 0; i < 40; i++) {
			conta[i] = (i + 1);
			tipoConta[i] = r.nextInt(5) + 1;
			saldo[i] = 0;
		}
		linha(tamanho);
		System.out.println("\n                                   App G6 Bank");
		linha(tamanho);
		System.out.println("\nDigite o número da conta: ");
		contaUsuario = leia.nextInt();
		while (contaUsuario < 1 || contaUsuario > 40) {
			System.out.println("Essa conta não existe ainda.");
			System.out.println("\nDigite o número da conta: ");
			contaUsuario = leia.nextInt();
		}
		if (genero[contaUsuario - 1] == 'M') {
			System.out.println("Seja bem vindo " + clientes[contaUsuario - 1]);
		} else {
			System.out.println("Seja bem vinda " + clientes[contaUsuario - 1]);
		}
		System.out.println("Número da conta: " + conta[contaUsuario - 1]);
		System.out.println("Tipo da conta: " + tipoConta[contaUsuario - 1]);
		linha(tamanho);
		System.out.println("\n\t\t\t\tMENU INICIAL");
		linha(tamanho);
		System.out.println("Escolha uma opção");
		linha(tamanho);
		System.out.println("[1] - Movimentação");
		System.out.println("[2] - Saldo");
		System.out.println("[3] - Sair");

		opcao = leia.nextInt();
		while (opcao < 1 || opcao > 3) {
			System.out.println("Opção inválida. Escolha uma opção: ");
			opcao = leia.nextInt();
		}
		if (opcao == 1) {
			if (tipoConta[contaUsuario - 1] == 1) {
				a = contaPoupanca(saldoConta, MAXMOVIMENTACOES);
			} else if (tipoConta[contaUsuario - 1] == 2) {
				a = contaCorrente(saldoConta, MAXMOVIMENTACOES);
			} else if (tipoConta[contaUsuario - 1] == 3) {
				a = contaEspecial(saldoConta, MAXMOVIMENTACOES);
			} else if (tipoConta[contaUsuario - 1] == 4) {
				a = contaEmpresa(saldoConta, MAXMOVIMENTACOES);
			}
		}
	}
	static void linha(int tamanho) {
		for (int x = 0; x < tamanho; x++) {
			System.out.print("═");
		}
	}
	public static char contaCorrente(double saldoConta, int MAXMOVIMENTACOES) {

		double movimentoConta;
		int numConta;
		char status, continuar = ' ';

		Scanner leia = new Scanner(System.in);
		
		do {
			for (int x = 0; x < MAXMOVIMENTACOES; x++) {
				System.out.println("\n\nTransação " + (x + 1));
				if (saldoConta == 0) {
					System.out.println("Quanto você quer depositar: R$ ");
					movimentoConta = leia.nextDouble();
					while (movimentoConta < 0) {
						System.out.println("\nValor inválido. Quanto você quer depositar: R$ ");
						movimentoConta = leia.nextDouble();
					}
					saldoConta = saldoConta + movimentoConta;
					System.out.printf("Saldo atual: R$ %.2f", saldoConta);
				} else {
					System.out.println("\nVocê quer Creditar (C) ou Debitar (D) da conta? ");
					status = leia.next().toUpperCase().charAt(0);
					while (status != 'C' && status != 'D') {
						System.out.println("\nOpção inválida. Você quer Creditar (C) ou Debitar (D) da conta? ");
						status = leia.next().toUpperCase().charAt(0);
					}
					if (status == 'C') {
						System.out.println("Quanto você quer depositar: R$ ");
						movimentoConta = leia.nextDouble();
						while (movimentoConta < 0) {
							System.out.println("\nValor inválido. Quanto você quer depositar: R$ ");
							movimentoConta = leia.nextDouble();
						}
						saldoConta = saldoConta + movimentoConta;
						System.out.printf("Saldo atual: R$ %.2f", saldoConta);
					} else {
						System.out.println("Quanto você quer retirar: R$ ");
						movimentoConta = leia.nextDouble();
						while (movimentoConta < 0 || movimentoConta > saldoConta) {
							System.out.println("\nValor inválido. Quanto você quer retirar: R$ ");
							movimentoConta = leia.nextDouble();
						}
						saldoConta = saldoConta - movimentoConta;
						System.out.printf("Saldo atual: R$ %.2f", saldoConta);
					}
				}
			}
			System.out.println("\nVocê deseja continuar (S ou N)? ");
			continuar = leia.next().toUpperCase().charAt(0);
			while (continuar != 'S' && continuar != 'N') {
				System.out.println("\nOpção inválida. Deseja continuar? ");
				continuar = leia.next().toUpperCase().charAt(0);
			}
		} while (continuar == 'S');
		return continuar;
	}

	public static char contaPoupanca(double saldoConta, int MAXMOVIMENTACOES) {
		Scanner sc = new Scanner(System.in);
		char opcao, continuar = 'S';
		double movimentoConta;
		int numConta;
		System.out.println("Digite o seu número de conta: ");
		numConta = sc.nextInt();
		System.out.println("Saldo atual: " + saldoConta);
		do {
			for (int i = 0; i < MAXMOVIMENTACOES; i++) {
				if (saldoConta == 0.0) {
					System.out.println("Saldo atual: R$ " + saldoConta + " Quanto você quer depositar: R$ ");
					movimentoConta = sc.nextDouble();
					while (movimentoConta < 0.0) {
						System.out.println("Valor inválido! Quanto você quer depositar: R$ ");
						movimentoConta = sc.nextDouble();
					}
					saldoConta += movimentoConta;
				} else {
					System.out.println("Você quer Creditar (C) ou Debitar (D) da conta? ");
					opcao = sc.next().toUpperCase().charAt(0);
					while (opcao != 'C' && opcao != 'D') {
						System.out.println("Operação inválida! Favor digitar (C) para depósito ou (D) para Saque: ");
						opcao = sc.next().toUpperCase().charAt(0);
					}
					if (opcao == 'C') {
						System.out.println("Quanto você quer depositar: R$ ");
						movimentoConta = sc.nextDouble();
						while (movimentoConta < 0.0) {
							System.out.println("Valor inválido! Quanto você quer depositar: R$ ");
							movimentoConta = sc.nextDouble();
						}
						saldoConta += movimentoConta;
						System.out.println("O saldo atual é: " + saldoConta);
					} else {
						System.out.println("Quanto você quer retirar: R$ ");
						movimentoConta = sc.nextDouble();
						while (movimentoConta < 0.0 || movimentoConta > saldoConta) {
							System.out.println("Valor inválido! Quanto você quer retirar: R$ ");
							movimentoConta = sc.nextDouble();
						}
						movimentoConta = (-movimentoConta);
						saldoConta += movimentoConta;
						System.out.println("O saldo atual é: " + saldoConta);
					}
				}
			}
			System.out.println("Você deseja continuar (S ou N)?");
			continuar = sc.next().toUpperCase().charAt(0);
			while (continuar != 'S' && continuar != 'N') {
				System.out.println("Opção inválida. Você quer continuar (S ou N)? ");
				continuar = sc.next().charAt(0);
			}
		} while (continuar == 'S');
		return continuar;
	}

	public static char contaEspecial(double saldoConta, int MAXMOVIMENTACOES) {
		
		Scanner leia = new Scanner(System.in);
		Random r = new Random();
		double movimentoConta, limiteConta;
		char status, continuar = 'S';
		double limite[]=new double [40];
		for (int x=0; x<40; x++) {
			limite[x]=r.nextDouble()*900+100;	
		}
		
		do {
			for (int x = 0; x < MAXMOVIMENTACOES; x++) {
				
				System.out.println("\n\n\nVocê quer Creditar (C) ou Debitar (D) da conta? ");
				status = leia.next().charAt(0);
				while (status!= 'C' && status!= 'D')
						{
							System.out.println("Operação inválida! Favor digitar (C) para depósito ou (D) para Saque: ");
							status=leia.next().charAt(0);
						}		
				if (status=='C')
				{
					System.out.println("\nQuanto você quer depositar? ");
					movimentoConta=leia.nextDouble();
					while (movimentoConta<0)
					{
						System.out.println("\nValor inválido! Quanto você quer depositar? ");
						movimentoConta=leia.nextDouble();					
					} 
					saldoConta=saldoConta+movimentoConta;			
				}

				else if (status=='D') {
					System.out.println("Quanto você quer retirar? ");
					movimentoConta = leia.nextDouble();
					while (movimentoConta < 0) {
						System.out.println("\nValor inválido. Quanto você quer retirar? ");
						movimentoConta = leia.nextDouble();
					}
					while (movimentoConta>(saldoConta+limite[x])) {
						System.out.println("Saldo e Limite de crédito insuficientes! Quanto você quer retirar? ");
						movimentoConta = leia.nextDouble();
					}
					System.out.printf("Saldo atual: R$ %.2f", saldoConta);
				} else {
					System.out.println("\nVocê quer Creditar (C) ou Debitar (D) da conta? ");
					status = leia.next().toUpperCase().charAt(0);
					while (status != 'C' && status != 'D') {
						System.out.println("\nOpção inválida. Você quer Creditar (C) ou Debitar (D) da conta? ");
						status = leia.next().toUpperCase().charAt(0);
					}
					if (status == 'C') {
						System.out.println("Quanto você quer depositar: R$ ");
						movimentoConta = leia.nextDouble();
						while (movimentoConta < 0) {
							System.out.println("\nValor inválido. Quanto você quer depositar: R$ ");
							movimentoConta = leia.nextDouble();
						}
						saldoConta = saldoConta + movimentoConta;
						System.out.printf("Saldo atual: R$ %.2f", saldoConta);
					} else {
						System.out.println("Quanto você quer retirar: R$ ");
						movimentoConta = leia.nextDouble();
						while (movimentoConta < 0 || movimentoConta > saldoConta) {
							System.out.println("\nValor inválido. Quanto você quer retirar: R$ ");
							movimentoConta = leia.nextDouble();
						}
						saldoConta = saldoConta - movimentoConta;
						System.out.printf("Saldo atual: R$ %.2f", saldoConta);
					}
				}
			}
			System.out.println("\nVocê deseja continuar (S ou N)? ");
			continuar = leia.next().toUpperCase().charAt(0);
			while (continuar != 'S' && continuar != 'N') {
				System.out.println("\nOpção inválida. Deseja continuar? ");
				continuar = leia.next().toUpperCase().charAt(0);
			}
		} while (continuar == 'S');
		return continuar;
	}

	public static char contaEmpresa(double saldoConta, int MAXMOVIMENTACOES) {
		Scanner sc = new Scanner(System.in);
		char opcao, continuar = 'S';
		double movimentoConta;
		int numConta;
		System.out.println("Digite o seu número de conta: ");
		numConta = sc.nextInt();
		System.out.println("Saldo atual: " + saldoConta);
		do {
			for (int i = 0; i < MAXMOVIMENTACOES; i++) {
				if (saldoConta == 0.0) {
					System.out.println("Saldo atual: R$ " + saldoConta + " Quanto você quer depositar: R$ ");
					movimentoConta = sc.nextDouble();
					while (movimentoConta < 0.0) {
						System.out.println("Valor inválido! Quanto você quer depositar: R$ ");
						movimentoConta = sc.nextDouble();
					}
					saldoConta += movimentoConta;
				} else {
					System.out.println("Você quer Creditar (C) ou Debitar (D) da conta? ");
					opcao = sc.next().toUpperCase().charAt(0);
					while (opcao != 'C' && opcao != 'D') {
						System.out.println("Operação inválida! Favor digitar (C) para depósito ou (D) para Saque: ");
						opcao = sc.next().toUpperCase().charAt(0);
					}
					if (opcao == 'C') {
						System.out.println("Quanto você quer depositar: R$ ");
						movimentoConta = sc.nextDouble();
						while (movimentoConta < 0.0) {
							System.out.println("Valor inválido! Quanto você quer depositar: R$ ");
							movimentoConta = sc.nextDouble();
						}
						saldoConta += movimentoConta;
						System.out.println("O saldo atual é: " + saldoConta);
					} else {
						System.out.println("Quanto você quer retirar: R$ ");
						movimentoConta = sc.nextDouble();
						while (movimentoConta < 0.0 || movimentoConta > saldoConta) {
							System.out.println("Valor inválido! Quanto você quer retirar: R$ ");
							movimentoConta = sc.nextDouble();
						}
						movimentoConta = (-movimentoConta);
						saldoConta += movimentoConta;
						System.out.println("O saldo atual é: " + saldoConta);
					}
				}
			}
			System.out.println("Você deseja continuar (S ou N)?");
			continuar = sc.next().toUpperCase().charAt(0);
			while (continuar != 'S' && continuar != 'N') {
				System.out.println("Opção inválida. Você quer continuar (S ou N)? ");
				continuar = sc.next().charAt(0);
			}
		} while (continuar == 'S');
		return continuar;
	}
}