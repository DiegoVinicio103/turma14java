import java.util.Scanner;

public class Lista2exerc3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int numero1=0, numero2=0, numero3=0, numero4=0;
		System.out.println("Digite o primeiro n�mero: ");
		numero1=leia.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		numero2=leia.nextInt();
		System.out.println("Digite o terceiro n�mero: ");
		numero3=leia.nextInt();
		System.out.println("Digite o quarto n�mero: ");
		numero4=leia.nextInt();
		
		if ((Math.pow(numero3,2))>=1000)
		{
			System.out.println("O quadrado do terceiro n�mero � maior que 1000 e vale "+Math.pow(numero3, 2));
		}
		else
		{
			System.out.println("N�mero\tQuadrado\n");
			System.out.println(numero1+"------"+Math.pow(numero1, 2)+"\n");
			System.out.println(numero2+"------"+Math.pow(numero2, 2)+"\n");
			System.out.println(numero3+"------"+Math.pow(numero3, 2)+"\n");
			System.out.println(numero4+"------"+Math.pow(numero4, 2)+"\n");
		}
	}

}