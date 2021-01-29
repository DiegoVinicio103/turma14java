package lista9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char opcao;
		List <Produto> EstoqueTotal = new ArrayList<>();
		EstoqueTotal.add(new Produto("Celular",999,"Samsung", 20));
		EstoqueTotal.add(new Produto("Notebook",5999,"Asus", 10));
		
		System.out.print("Escolha a opção: \n");
		System.out.println("1 - Adicionar Novo Produto");
		System.out.println("2 - Atualizar Produto");
		System.out.println("3 - Remover Produto");
		System.out.println("4 - Listar Todos os Produtos");
		opcao = sc.next().charAt(0);
		
		switch (opcao) {
		case '1': 
			System.out.println("Digite o nome do produto: ");
			String nome = sc.next();
			System.out.println("Digite o valor do produto: ");
			double valor = sc.nextDouble();
			System.out.println("Digite o nome do fornecedor: ");
			String fornecedor = sc.next();
			System.out.println("Digite a quantidade disponível: ");
			int qntEstoque = sc.nextInt();
			Produto produto = new Produto(nome, valor, fornecedor, qntEstoque);
			EstoqueTotal.add(produto);
		
		case '2': 	
			System.out.println("Digite o nome do produto que deseja atualizar: ");
			String nomeProduto = sc.next();
			System.out.println("Digite as novas informações do produto: ");
			System.out.println("Nome: ");
			String nome2 = sc.next();
			System.out.println("Valor: ");
			double valor2 = sc.nextDouble();
			System.out.println("Fornecedor: ");
			String fornecedor2 = sc.next();
			System.out.println("Quantidade em Estoque: ");
			int qntEstoque2 = sc.nextInt();
			for (Produto produtoAtual : EstoqueTotal) {
				if (produtoAtual.getNome().equals(nomeProduto))
				{
					produtoAtual.setNome(nome2);
					produtoAtual.setValor(valor2);
					produtoAtual.setFornecedor(fornecedor2);
					produtoAtual.setQntEstoque(qntEstoque2);
				}
			}
		case '3':
			System.out.println("Digite o nome do produto que deseja remover: ");
			String nomeremover = sc.next();
			for (Produto produtoAtual : EstoqueTotal) {
				if (produtoAtual.getNome().equals(nomeremover))
				{
					EstoqueTotal.remove(produtoAtual);
				}
			}
			
		case '4':
			System.out.println("Relação de Todos os Produtos em Estoque:  ");
			System.out.println("Produto\tValor\tFornecedor\tQuantidade em Estoque");
			for (Produto produtoAtual : EstoqueTotal) {
					System.out.println(produtoAtual.getNome()+"\t"+produtoAtual.getValor()+"\t"
			+produtoAtual.getFornecedor()+"\t"+produtoAtual.getQntEstoque());
				
			}	
		
		}
		
		

	}

}
