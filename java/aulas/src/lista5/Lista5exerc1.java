package lista5;

import java.util.Scanner;

public class Lista5exerc1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double precoProduto=0.0;
		int formaPagamento=0;
		System.out.println("Digite o valor do produto: ");
		precoProduto=leia.nextDouble();
		System.out.println("Digite a forma de pagamento: ");
		System.out.println("1 - Dinheiro ou Cheque: ");
		System.out.println("2 - � Vista no Cart�o de Cr�dito ");
		System.out.println("3 - Em duas vezes sem juros: ");
		System.out.println("4 - Em tr�s vezes com juros: ");
		formaPagamento=leia.nextInt();
		
		switch (formaPagamento) {
		
		case 1: 
			precoProduto=0.8*precoProduto;
			System.out.println("Voc� vai pagar: R$"+precoProduto);
			break;
		case 2: 
			precoProduto=0.85*precoProduto;
			System.out.println("Voc� vai pagar: R$"+precoProduto);
			break;
		case 3: 
			System.out.println("Voc� vai pagar duas parcelas sem juros de: R$"+precoProduto/2+" totalizando: R$ "+precoProduto);
			break;		
		case 4: 
			precoProduto=1.1*precoProduto;
			System.out.println("Voc� vai pagar tr�s parcelas de: R$"+Math.round(precoProduto/3)+" totalizando: R$ "+Math.round(precoProduto));
			break;	
		}
		
	
	}

}