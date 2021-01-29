package Brejaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLoja {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int anoAtual=2021, formaPagamento, qtdeVendida,qtdParcelas=0, produtoCompra, entrada;
		double valorTotal=0.0,valorParcela=0.0;
		char continuar;
		String checarProduto;
		
		List<Produto> produtos = new ArrayList<>();
		List<Produto> carrinho = new ArrayList<>();
		
		produtos.add(new Produto("BJ-001", "Delirium Tremens", 33.00, 10 ));
		produtos.add(new Produto("BJ-002", "BlueMoon", 15.00, 10 ));
		produtos.add(new Produto("BJ-003", "Hoegaarden", 8.00, 10 ));
		produtos.add(new Produto("BJ-004", "Bala de Prata", 12.00, 10 ));
		produtos.add(new Produto("BJ-005", "Leffe Blonde", 11.00, 10 ));
		produtos.add(new Produto("BJ-006", "Red Stripe", 9.00, 10 ));
		produtos.add(new Produto("BJ-007", "Vedett Ipa", 20.00, 10 ));
		produtos.add(new Produto("BJ-008", "Vedett White", 16.00, 10 ));
		produtos.add(new Produto("BJ-009", "Goose Island Ipa", 13.00, 10 ));
		produtos.add(new Produto("BJ-010", "Duvalia Silibrina", 7.00, 10 ));
		
		System.out.println("         _.._..,_,_\r\n"
				+ "        (          )\r\n"
				+ "         ]~,\"-.-~~[\r\n"
				+ "       .=])' (;  ([\r\n"
				+ "       | ]:: '    [\r\n"
				+ "       '=]): .)  ([\r\n"
				+ "         |:: '    |\r\n"
				+ "          ~~----~~");
		linhaDetalhe();
		System.out.println("\r\n"
				+ "██████╗░██████╗░███████╗░░░░░██╗░█████╗░██████╗░██╗░█████╗░\r\n"
				+ "██╔══██╗██╔══██╗██╔════╝░░░░░██║██╔══██╗██╔══██╗██║██╔══██╗\r\n"
				+ "██████╦╝██████╔╝█████╗░░░░░░░██║███████║██████╔╝██║███████║\r\n"
				+ "██╔══██╗██╔══██╗██╔══╝░░██╗░░██║██╔══██║██╔══██╗██║██╔══██║\r\n"
				+ "██████╦╝██║░░██║███████╗╚█████╔╝██║░░██║██║░░██║██║██║░░██║\r\n"
				+ "╚═════╝░╚═╝░░╚═╝╚══════╝░╚════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░╚═╝");
		linhaDetalhe();
		
		
		System.out.print("\nOlá! Qual o seu nome? ");
		String nomeCliente = sc.next().toUpperCase();
		System.out.print("Você se define como M-masculino, F-feminino ou O-outro? ");
		char generoCliente = sc.next().toUpperCase().charAt(0);
		while (generoCliente != 'M' && generoCliente != 'F' && generoCliente != 'O') {
			System.out.println("Valor incorreto. Digite seu gênero [M] Masculino,[F] Feminino ou [O] Não-Binário: ");
			generoCliente = sc.next().toUpperCase().charAt(0);
		}
		System.out.println("Qual o seu ano de nascimento? ");
		int anoNascimento = sc.nextInt();
		while (anoNascimento < 1900 || anoNascimento > anoAtual) {
			System.out.println("Ano inválido, por favor difite novamente seu ano de nascimento: ");
			anoNascimento = sc.nextInt();
		}
		System.out.println("Qual o seu cpf? ");
		String cpf = sc.next();
		
		Cliente cliente1 = new Cliente(nomeCliente, generoCliente, anoNascimento, cpf);
		
		System.out.printf("Seja bem-vind%s à Brejeiro's, %s!!!\n",Genero(generoCliente),nomeCliente);	
		
		System.out.println("\nDigite a opção desejada: ");
		System.out.println("\n[1] - COMPRAR PRODUTOS");
		System.out.println("[2] - GERENCIAR ESTOQUE");
		System.out.println("[3] - SAIR");
		System.out.println();
		char opcaoMenu = sc.next().charAt(0);
		while (opcaoMenu != '1' && opcaoMenu != '2' && opcaoMenu != '3') {
			System.out.println("Opção incorreta! Digite novamente!: ");
			opcaoMenu = sc.next().charAt(0);
			}
		
		char continuaCompra;
		switch (opcaoMenu) {
		case '1': 
			do {
			System.out.println("\n\t\t\t   Lista de Produtos");
			linhaDetalhe();
			System.out.println("\nCódigo\t\tPreço\t     Quantidade\t\tProduto");
			for (Produto i : produtos) {
				System.out.printf("\n%s\t\t%.2f\t\t%d\t\t%s\n", i.getCodigo(), i.getPrecoUnitario(),
						i.getQtdeProdutoEstoque(), i.getNomeProduto());
			}
			System.out.println("\nDigite o código referente ao produto que deseja: ");
			int produtoEscolhido = sc.nextInt();
			
			if (produtoEscolhido < 10) {
				checarProduto = "BJ-00" + (produtoEscolhido);
			} else {
				checarProduto = "BJ-0" + (produtoEscolhido);
			}
			System.out.println("Qual a quantidade desejada? ");
			qtdeVendida = sc.nextInt();
			while (qtdeVendida < 0) {
				System.out.println("Valor inválido! Digite Novamente! ");
				qtdeVendida = sc.nextInt();
			}
			for (Produto i : produtos) {
				if (checarProduto.equals(i.getCodigo())) {
					if (i.venda(qtdeVendida)) {
						i.carrinho(qtdeVendida);
						valorTotal = i.carrinho(qtdeVendida);
						i.RetirarEstoque(qtdeVendida);
						i.setQtdeVendida(qtdeVendida);
						carrinho.add(i);
					} else {
						System.out.println("\nQuantidade inválida!");
					}
				}
			}
			System.out.print("\nVocê deseja continuar comprando conosco(S ou N)? ");
			continuaCompra = sc.next().toUpperCase().charAt(0);
			while (continuaCompra != 'S' && continuaCompra != 'N') {
				System.out.print("\nOpção inválida, favor informar (S ou N): ");
				continuaCompra = sc.next().toUpperCase().charAt(0);
				}
			} while (continuaCompra == 'S');
		linhaDetalhe();	
		
		
		System.out.println("\n\t\tEscolha a forma de pagamento");
		System.out.println("\n[1] - PAGAMENTO A VISTA - 10% de desconto");
		System.out.println("[2] - DEBITO");
		System.out.println("[3] - CRÉDITO - 5% de juros");
		System.out.println("[4] - CRÉDITO 2x/3x - 10% de juros");
		formaPagamento = sc.nextInt();
		while(formaPagamento < 1 || formaPagamento > 4) {
			System.out.println("Opção incorreta. Digite uma forma de pagamento válida: ");
			formaPagamento = sc.nextInt();
		}
		if(formaPagamento == 1) {
			valorTotal = (valorTotal*0.9)*1.09;
		}
		else if(formaPagamento == 3) {
			valorTotal = (valorTotal*1.05)*1.09;
		}
		else if(formaPagamento == 4) {
			System.out.println("Em quantas parcelas você deseja dividir (2x ou 3x)? ");
			qtdParcelas = sc.nextInt();
			while(qtdParcelas<2 && qtdParcelas >3 ) {
				System.out.println("Valor inválido! Digite novamente em quantas vezes você deseja dividir (2x ou 3x): ");
				qtdParcelas = sc.nextInt();
			}
			valorTotal = (valorTotal*1.1)*1.09;
			valorParcela = valorTotal/qtdParcelas;
		}
		linhaDetalhe();
		System.out.println("\n\t\t\t   CUPOM FISCAL");
		System.out.println("CÓDIGO\t  DESCRIÇÃO\tQUANTIDADE\tVL. UNIT(R$)\tVL.ITEM(R$)");
		linhaDetalhe();
		for (Produto i : carrinho) {
			System.out.printf("\n%s\t  %s\t   %d\t\t %.2f\t\t %.2f\n", i.getCodigo(), i.getNomeProduto(),
					i.getQtdeVendida(), i.getPrecoUnitario(), i.getPrecoUnitario() * i.getQtdeVendida());
		}
		linhaDetalhe();			
		System.out.printf("\n\t\t\t    VL. TOTAL(Imposto de 9%%)  R$ %.2f \n", valorTotal);
		if(formaPagamento == 4) {
			System.out.printf("\n\t\t  NUM. PARCELAS  %d   VL. DAS PARCELAS R$% .2f\n", qtdParcelas,valorParcela);
		}
		linhaDetalhe();	
		System.out.print("\n\nVocê deseja voltar para o menu (S ou N)? ");
		continuar = sc.next().toUpperCase().charAt(0);
		while (continuar != 'S' && continuar != 'N') {
			System.out.print("\nOpção incorreta. Você deseja voltar para o menu (S ou N)? ");
			continuar = sc.next().toUpperCase().charAt(0);
		}
		
		case '2':	
			do {
				System.out.println("\n\t\t\t  Controle de Estoque");
				linhaDetalhe();	
				System.out.println("\nCódigo\t\t     Quantidade\t\tProduto");
				for (Produto i : produtos) {
					System.out.printf("\n%s\t\t\t%d\t\t%s\n", i.getCodigo(), i.getQtdeProdutoEstoque(),
							i.getNomeProduto());
				}
				System.out.println("\nDigite o código do produto que será comprado: ");
				produtoCompra = sc.nextInt();
				if (produtoCompra < 10) {
					checarProduto = "BJ-00" + (produtoCompra);
				} else {
					checarProduto = "BJ-0" + (produtoCompra);
				}
				System.out.println("Digite a quantidade: ");
				entrada = sc.nextInt();
				while (entrada < 0) {
					System.out.println("Valor incorreto. Digite a quantidade: ");
					qtdeVendida = sc.nextInt();
				}
				for (Produto i : produtos) {
					if (checarProduto.equals(i.getCodigo())) {
						if ((i.getQtdeProdutoEstoque() + entrada) > 10) {
							System.out.println("Quantidade inválida. Valor de estoque acima do permitido.");
						} else {
							i.adicionarEstoque(entrada);
						}
					}
				}
				System.out.print("\n\nVocê deseja comprar mais algum produto (S ou N)? ");
				continuaCompra = sc.next().toUpperCase().charAt(0);
				while (continuaCompra != 'S' && continuaCompra != 'N') {
					System.out.print("\nOpção incorreta. Vocêdeseja comprar mais algum produto (S ou N)? ");
					continuaCompra = sc.next().toUpperCase().charAt(0);
				}
			} while (continuaCompra == 'S');
			System.out.println("\nVocê deseja voltar para o menu (S ou N)? ");
			continuaCompra = sc.next().toUpperCase().charAt(0);
			while (continuaCompra != 'S' && continuaCompra != 'N') {
				System.out.print("Opção incorreta. Você deseja voltar para o menu (S ou N)? ");
				continuaCompra = sc.next().toUpperCase().charAt(0);
			}

		case '3':
		{
			System.out.printf("Obrigado pela vista! ");
			continuaCompra = 'N';
		}
		 while (continuaCompra == 'S');
			System.out.printf("Obrigado! Volte sempre.");
			
		}
	
		
		
	}

	
	public static void linhaDetalhe() {
		int tamanhoLinha=30;
		for (int i=0; i<tamanhoLinha;i++) {	
		System.out.print("==");
		}
	}
	
	public static String Genero(char generoCliente) {
		
		String tipo;
		if (generoCliente == 'M')
		{
			tipo = "o";
		}
		else if (generoCliente == 'F')
		{
			tipo = "a";
		}
		else if (generoCliente == 'O')
		{
			tipo = "x";
		}
		else
		{
			tipo = "*";
		}
			
		
		return tipo;
	}
	
}	
