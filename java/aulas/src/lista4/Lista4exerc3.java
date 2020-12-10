package lista4;

import java.util.Random;

public class Lista4exerc3 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int N1[][]= new int[4][6], N2[][]= new int[4][6],M1[][]= new int[4][6],M2[][]= new int[4][6];
		
		System.out.println("Matriz N1\n");
		for (int linha=0; linha<4; linha++)
		{
			for (int coluna=0; coluna<6; coluna++)
			{
				N1[linha][coluna]=gerador.nextInt(9);
				System.out.print(N1[linha][coluna]+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Matriz N2\n");
		for (int linha=0; linha<4; linha++)
		{
			for (int coluna=0; coluna<6; coluna++)
			{
				N2[linha][coluna]=gerador.nextInt(9);
				System.out.print(N2[linha][coluna]+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Matriz M1\n");
		for (int linha=0; linha<4; linha++)
		{
			for (int coluna=0; coluna<6; coluna++)
			{
				M1[linha][coluna]=N1[linha][coluna]+N2[linha][coluna];
				System.out.print(M1[linha][coluna]+" ");
			}
			System.out.println("\n");
		}
		
		System.out.println("Matriz M2\n");
		for (int linha=0; linha<4; linha++)
		{
			for (int coluna=0; coluna<6; coluna++)
			{
				M2[linha][coluna]=N1[linha][coluna]-N2[linha][coluna];
				System.out.print(M2[linha][coluna]+" ");
			}
			System.out.println("\n");
		}
		
		
	}

}