package exemplos;
import java.util.Scanner;
public class Idade
{
	
	public static void main(String[] args) 
	{
		int anoNas;
		Scanner leia = new Scanner(System.in);
		System.out.println("DIGITE O ANO DO SEU NASCIMENTO ");	
		anoNas = leia.nextInt();
		if (calculaidade(anoNas)<18)
		{
			System.out.println("Voc� tem "+calculaidade(anoNas)+" anos e � considerado infanto-juvenil");	
		}
		else if (calculaidade(anoNas)<=60)
		{
			System.out.println("Voc� tem "+calculaidade(anoNas)+" anos e � considerado adulto");
		}
		else 
		{
			System.out.println("Voc� tem "+calculaidade(anoNas)+" anos e � considerado idoso");
		}
	
	}
	
	
	public static int calculaidade(int ano)
	{
		int idade = 2020 - ano;
		return idade;
	}
	
}
