package lista4;

import java.util.Scanner;

public class Lista4exerc1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int valor[] =new int[6];
		int maior=0, x=0;
		
		for (x=1; x<6; x++)
		{
			System.out.println("Digite a pontuação: ");
			valor[x]=leia.nextInt();
			if (valor[x]>maior)
			{
				maior=valor[x];
			}
		}
		System.out.println("O maior valor é: "+maior);
		

	}

}

