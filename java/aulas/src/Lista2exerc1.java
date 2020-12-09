import java.util.Scanner;

public class Lista2exerc1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int P=0, E=0, M=0;
		System.out.println("Digite o peso dos tomates: ");
		P=leia.nextInt();
		if (P>50) {
			E=P-50;
			M=4*E;
			System.out.println("O excesso foi de "+E+" kg e o valor da multa é de R$"+M);
		}
		else {
			E=0;
			M=0;
			System.out.println("O excesso foi de "+E+" kg e o valor da multa é de R$"+M+ " \nNão houve multa por excesso!");
		}
	}

}




