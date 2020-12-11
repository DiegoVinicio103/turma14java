package lista5;

import java.util.Random;

public class Lista5exerc6 {

	public static void main(String[] args) {
		Random gerador = new Random();
		int vetor[]= new int [3] , matriz[][]= new int[3][3], multiplicacao[][]= new int[3][3];
		
		System.out.println("Vetor: ");
		for (int linha=0; linha<3; linha++) {
			vetor[linha]=gerador.nextInt(9);
			System.out.print(vetor[linha]+"\t");
		}
		System.out.println("\n");
		System.out.println("\nMatriz: \n");
		for (int linha=0; linha<3; linha++) {
			for (int coluna=0; coluna<3; coluna++) {
				matriz[linha][coluna]=gerador.nextInt(9);
				System.out.print(matriz[linha][coluna]+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("\nVetor x Matriz:\n");
		for (int linha=0; linha<3; linha++) {
			for (int coluna=0; coluna<3; coluna++) {
				multiplicacao[linha][coluna]=vetor[linha]*matriz[linha][coluna];
				System.out.print(multiplicacao[linha][coluna]+"\t");
		}
		System.out.println("\n");
	}
	}
}

