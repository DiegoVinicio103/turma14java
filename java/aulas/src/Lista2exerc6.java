import java.util.Scanner;

public class Lista2exerc6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int idade=0;
		System.out.println("Digite a idade do nadador: ");
		idade=leia.nextInt();
		
		if (idade>=5 && idade<=7)
		{
			System.out.println("O nadador pertence à classe Infantil A");
		}
		else if (idade>=8 && idade<=11)
		{
			System.out.println("O nadador pertence à classe Infantil B");
		}
		else if (idade>=12 && idade<=13)
		{
			System.out.println("O nadador pertence à classe Juvenil A");
		}
		else if (idade>=14 && idade<=17)
		{
			System.out.println("O nadador pertence à classe Juvenil B");
		}
		else if (idade>=18)
		{
			System.out.println("O nadador pertence à classe Adultos");
		}


	}

}

