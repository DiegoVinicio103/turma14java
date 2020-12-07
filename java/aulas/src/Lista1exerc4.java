import java.util.Scanner;

public class Lista1exerc4 {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		int a, b, c;
		double r, s, d;
		System.out.println("Digite o valor de A ");
		a=leia.nextInt();
		System.out.println("Digite o valor de B ");
		b=leia.nextInt();
		System.out.println("Digite o valor de C ");
		c=leia.nextInt();
		r = ((a+b)*(a+b));
		s = ((b+c)*(b+c));
		d = ((r+s)/2);
		System.out.println(" valor de D é "+d);		
	}

}
/*{
inteiro a, b, c
real r, s, d
escreva("Digite o valor de A ")
leia(a)
escreva("Digite o valor de B ")
leia(b)
escreva("Digite o valor de C ")
leia(c)
r = ((a+b)*(a+b))
s = ((b+c)*(b+c))
d = ((r+s)/2)
escreva ("O valor de D é ",Matematica.arredondar(d, 2))
}
}
*/