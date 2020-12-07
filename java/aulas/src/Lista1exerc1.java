import java.util.Scanner;

public class Lista1exerc1 {
	
	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		int anos, meses, dias, tempoDias;
		
		System.out.println("Digite sua idade em anos: ");
		anos = leia.nextInt();
		System.out.println("Digite o mês atual: ");
		meses= leia.nextInt();
		System.out.println("Digite o dia atual: ");
		dias=leia.nextInt();
		tempoDias = ((anos*365)+(meses*30)+dias);
		System.out.println("Sua idade em dias é: "+tempoDias);
	}
	
	

}