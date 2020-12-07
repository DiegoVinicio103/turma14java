import java.util.Scanner;

public class Lista1exerc6 {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		double x1, y1, x2, y2, d, r1, r2;
		System.out.println("Digite o valor de X1 ");
		x1=leia.nextDouble();
		System.out.println("Digite o valor de X2 ");
		x2=leia.nextDouble();
		System.out.println("Digite o valor de Y1 ");
		y1=leia.nextDouble();
		System.out.println("Digite o valor de Y2 ");
		y2=leia.nextDouble();
		r1=Math.pow((x2-x1), 2);
		r2=Math.pow((y2-y1), 2);
		d= Math.sqrt((r1+r2));
		System.out.println("O Valor de d é: "+d);
	}
}

/*
inclua biblioteca Matematica

funcao inicio()
{
	real x1, y1, x2, y2, d, r1, r2
	escreva("Digite o valor de X1 ")
	leia(x1)
	escreva("Digite o valor de X2 ")
	leia(x2)	
	escreva("Digite o valor de Y1 ")
	leia(y1)	
	escreva("Digite o valor de Y2 ")
	leia(y2)		
	r1 = (Matematica.potencia((x2-x1), 2))
	r2 = (Matematica.potencia((y2-y1), 2))
	d = (Matematica.raiz((r1+r2), 2))
	escreva ("O Valor de d é ", Matematica.arredondar(d, 2))
*/