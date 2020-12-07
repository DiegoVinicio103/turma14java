import java.util.Scanner;

public class Lista1exerc7 {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		double a, b, c, d, e, f, x, y;
		System.out.println("Digite o valor de a ");
		a=leia.nextDouble();
		System.out.println("Digite o valor de b ");
		b=leia.nextDouble();
		System.out.println("Digite o valor de c ");
		c=leia.nextDouble();
		System.out.println("Digite o valor de d ");
		d=leia.nextDouble();
		System.out.println("Digite o valor de e ");
		e=leia.nextDouble();
		System.out.println("Digite o valor de f ");
		f=leia.nextDouble();
		x=(((c*e)-(b*f))/((a*e)-(b*d)));
		y=(((a*f)-(c*d))/((a*e)-(b*d)));
		System.out.println("O valor de x é ");
		
		
		
	}

}

/*

real a, b, c, d, eh, f, x, y
escreva("Digite o valor de 'a' ")
leia(a)
escreva("Digite o valor de 'b' ")
leia(b)
escreva("Digite o valor de 'c' ")
leia(c)
escreva("Digite o valor de 'd' ")
leia(d)
escreva("Digite o valor de 'e' ")
leia(eh)
escreva("Digite o valor de 'f' ")
leia(f)
x=(((c*eh)-(b*f))/((a*eh)-(b*d)))
y=(((a*f)-(c*d))/((a*eh)-(b*d)))
escreva("O valor de x é",x)
escreva("O valor de y é",y)
*/