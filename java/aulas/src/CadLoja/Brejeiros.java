package CadLoja;

import java.util.Scanner;

public class Brejeiros {public static void main (String[] args)
{
	Scanner leia = new Scanner(System.in);
	String codigos[] = new String[10];
	String produtos[] = {"Delirium Tremens","Blue Moon","Hoegaarden","Bala de Prata","Leffe Blonde","Red Stripe","Vedett Ipa","Vedett White","Goose Island Ipa","Silibrina"};
	double precoUnitarios[] = {33,15,8,12,11,9,20,16,13,7};
	int estoque[] = new int[10];
	
	linhaDetalhe();
	System.out.print("\r\n"
			+ "╔══╗\t\t\t\t   _.._..,_,_\r\n"
			+ "║╔╗║─────╔╗────────╔╗\t\t (          )\r\n"
			+ "║╚╝╚╦═╦══╬╬══╦╦═╦══╣╠══╗\t  ]~,\'-.-~~[\r\n"
			+ "║╔═╗║╔╣║═╬╣║═╬╣╔╣╔╗╠╣══╣\t.=])' (;  ([\r\n"
			+ "║╚═╝║║║║═╣║║═╣║║║╚╝║╠══║\t| ]:: '    [\r\n"
			+ "╚═══╩╝╚══╣╠══╩╩╝╚══╝╚══╝\t'=]): .)  ([\r\n"
			+ "────────╔╝║\t         	  |:: '    |\r\n"
			+ "────────╚═╝\t             	   ~~----~~\n");
	linhaDetalhe();
	System.out.println("\n[1] - COMPRAR PRODUTOS");
	System.out.println("[2] - GERENCIAR ESTOQUE");
	System.out.println("[3] - SAIR");
	System.out.println();
	System.out.print("DIGITE A OPÇÃO: ");
	char opcaoMenu = leia.next().charAt(0);
	
	
	System.out.print("Por favor nos diga o seu nome: ");
	String nomeCliente = leia.next().toUpperCase();
	System.out.print("Você de define como M-masculino, F-feminino ou O-outro? ");
	char generoCliente = leia.next().toUpperCase().charAt(0);
	System.out.printf("Seja bem-vind%s à Brejeiro's, %s!!!\n",Genero(generoCliente),nomeCliente);
	
	
}






public static void linhaDetalhe() {
	int tamanhoLinha=60;
	for (int i=0; i<tamanhoLinha;i++) {	
	System.out.print("═");
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
