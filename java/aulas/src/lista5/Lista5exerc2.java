package lista5;

import java.util.Scanner;

public class Lista5exerc2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double altura=0.0, peso=0.0, IMC=0.0;

		System.out.println("Digite a sua altura: ");
		altura=leia.nextDouble();
				while (altura<=0)
				{
					System.out.println("\nValor inv�lido, digite novamente: ");
					altura=leia.nextDouble();
				}
		System.out.println("\nDigite o seu peso: ");
		peso=leia.nextDouble();
				while (peso<=0)
				{
					System.out.println("\nValor inv�lido, digite novamente: ");
					peso=leia.nextDouble();
				}
				IMC=((peso/Math.pow(altura, 2)));
				if (IMC<=18.5 && IMC>0)
				{
					System.out.println("De acordo com seu IMC, voc� est� abaixo do peso ");
				}
				else if (IMC>18.5 && IMC<=25)
				{
					System.out.println("De acordo com seu IMC, voc� est� com peso normal ");
				}
				else if (IMC>25 && IMC<=30)
				{
					System.out.println("De acordo com seu IMC, voc� est� acima do peso ");
				}
				else
				{
					System.out.println("De acordo com seu IMC, voc� est� obeso ");
				}
		
	}

}

