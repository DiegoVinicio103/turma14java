import java.util.Scanner;

public class Lista1exerc2 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		int anos, meses, dias, tempoDias;
		System.out.println("Digite sua idade em dias: ");
		tempoDias=leia.nextInt();
		anos = (tempoDias/365);
		meses = (tempoDias%365)/30;
		dias = ((tempoDias%365)%30);
		System.out.printf("Sua idade é: \nAnos: "+ anos+"\nMeses:"+meses+ "\nDias: "+dias);
	}
	

}
/*programa
{
	
	funcao inicio()
	{
		inteiro anos, meses, dias, tempoDias
		escreva("Digite sua idade em dias ")
		leia(tempoDias)
		anos = (tempoDias/365)
		meses = (tempoDias%/365)/30
		dias = (tempoDias%/365)%/30)
		escreva ("Sua idade é: \nAnos: ", anos,"\nMeses: ",meses, "\nDias: ",dias)
	}
}*/
