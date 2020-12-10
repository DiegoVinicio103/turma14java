package lista4;

import java.util.Scanner;

public class Lista4exerc4 {

	public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int somaTotal=0, somaDiagonal=0;
	int matriz[][]= new int[3][3];
	
	for  (int linha=0; linha<3;linha++)
	{
		for (int coluna=0; coluna<3; coluna++)
		{
			System.out.printf("Entre com o valor da posição ["+linha+";"+coluna+"] ");
			matriz[linha][coluna]=leia.nextInt();
		}			
	}
	for  (int linha=0; linha<3;linha++)
	{
		for (int coluna=0; coluna<3; coluna++)
		{
		somaTotal=matriz[linha][coluna]+somaTotal;
		}			
	}
	for  (int linha=0; linha<3;linha++)
	{
		for (int coluna=0; coluna<3; coluna++)
		{
			if (linha==coluna)
			{
				somaDiagonal=matriz[linha][coluna]+somaDiagonal;
			}
		}			
	}
	System.out.println(("A soma de todos os valores da matriz é: "+somaTotal));
	System.out.println("\nA soma dos valores da diagonal principal é: "+somaDiagonal);
	
	}

}
