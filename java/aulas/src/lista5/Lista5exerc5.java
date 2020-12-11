package lista5;

import java.util.Scanner;

public class Lista5exerc5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double vetor[] = new double [5];
		int codigo=0;
		
		for (int x=0; x<5; x++)
		{
			System.out.println("Digite o valor da posição "+x+1+" do vetor: ");
			vetor[x]=leia.nextDouble();
			
		}
		System.out.println("Digite o código: ");
		codigo=leia.nextInt();
		while ((codigo<0) || (codigo>2))
				{
					System.out.println("Código inválido, digite novamente: ");
					codigo=leia.nextInt();
				}
		if (codigo==1)
			{
				for (int x=0; x<5; x++)
				{
					System.out.println(vetor[x]+"\t");
				}
			}	
		else if (codigo==2)
			{
				for (int x=4; x>=0; x--)
				{
					System.out.println(vetor[x]+"\t");
				}
			}
				
		}

		
		

	}
