package lista3;

import java.util.Scanner;

public class Lista3exerc3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int valor=0, totalValor=0, totalSoma=0;
		double media=0.0;
		
		while (valor>=0) {
			System.out.println("Insira um valor numérico inteiro: ");
			valor=leia.nextInt();
			totalValor++;
			totalSoma=totalSoma+valor;		
			media=(totalSoma/totalValor);
			
		}
		System.out.println("Total de números: "+totalValor);
		System.out.println("Soma Total: "+totalSoma);
		System.out.println("Média: "+media);
	}

}
