import java.util.Scanner;

public class Oimundo 
{

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		String nome;
		int anoNascimento;
		
		System.out.println("Digite o nome do usuário");
		nome = leia.next();
		System.out.println("Digite o ano de nascimento");
		anoNascimento = leia.nextInt();
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+(2020-anoNascimento));
		
		leia.close();
		
	}
}
