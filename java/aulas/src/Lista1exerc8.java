import java.util.Scanner;

public class Lista1exerc8 {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		double custoFab, custoCons, imposto, distrib;
		System.out.println("Digite o valor do custo de f�brica do carro novo ");
		custoFab=leia.nextDouble();
		imposto=(0.45*custoFab);
		distrib=(0.28*custoFab);
		custoCons=(custoFab+imposto+distrib);
		System.out.println("O valor do custo ao consumidor � $"+custoCons);		
		
	}

}


/*
inclua biblioteca Matematica

funcao inicio()
{
	real custoFab, custoCons, imposto, distrib
	escreva("Digite o valor do cisto de f�brica do carro novo ")
	leia(custoFab)
	imposto=(0.45*custoFab)
	distrib=(0.28*custoFab)
	custoCons=(custoFab+imposto+distrib)
	escreva("O valor do custo ao consumidor � $",Matematica.arredondar(custoCons, 2))
	
}
*/