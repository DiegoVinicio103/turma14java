import java.util.Scanner;

public class Lista1exerc5 {
	public static void main(String[] args)
	{
		Scanner leia = new Scanner (System.in);
		double media, n1, n2, n3, p1=2, p2=3, p3=5;
		System.out.println("Digite o valor da primeira nota ");
		n1=leia.nextDouble();
		System.out.println("Digite o valor da segunda nota ");
		n2=leia.nextDouble();
		System.out.println("Digite o valor da terceira nota ");
		n3=leia.nextDouble();
		media = (((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3));
		System.out.println("A média do aluno é "+media);
		
	}

}

/*
real media, n1, n2, n3, p1, p2, p3
p1=2 p2=3 p3=5
escreva("Digite o valor da primeira nota ")
leia(n1)
escreva("Digite o valor da segunda nota ")
leia(n2)
escreva("Digite o valor da terceira nota ")
leia(n3)
media = (((n1*p1)+(n2*p2)+(n3*p3))/(p1+p2+p3))
escreva ("A média do aluno é ", Matematica.arredondar(media,2)

*/