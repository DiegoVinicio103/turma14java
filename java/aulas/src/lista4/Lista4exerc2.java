package lista4;

import java.util.Random;

public class Lista4exerc2 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int  maior=0, ocorrencias=0;
		double media=0,soma=0;
		int vetor[]= new int[10];
		
		System.out.println("Os valores obtidos pelo dado foram: ");
		for (int x=1; x<=10; x++)
		{
			vetor[x-1]=(gerador.nextInt(6)+1);
			System.out.print(vetor[x-1]+" ");
			soma=soma+vetor[x-1];
			if (vetor[x-1]>=maior)
				{
					if (vetor[x-1]>maior) {
						ocorrencias=0;
					}
					maior=vetor[x-1];
					ocorrencias++;
				}			
		}
		media=(soma/10);		
		System.out.printf("\nA média aritmética dos valores foi: %.1f",media);
		System.out.println("\nO maior valor foi: "+maior+ " com "+ocorrencias+" ocorrências");
		
		
	}

}
