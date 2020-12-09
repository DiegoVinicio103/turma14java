import java.util.Scanner;

public class Lista2exerc8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		double N;
		System.out.println("Entre com o valor da variável: ");
		N=leia.nextDouble();
	if (N>100)
	{
		System.out.println("A variável é maior que 100 e vale "+N);
	}
	else
	{
		N=0;
		System.out.println(N);
	}
	}

}
