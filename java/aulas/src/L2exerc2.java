import java.util.Scanner;

public class L2exerc2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String C;
		int N=0, E=0, salarioTotal=0, salarioBase=0;
		final int LIMITEHORAS=50;
		final int VALORHORAEXCEDENTE=20;
		final int VALORHORANORMAL=10;
		System.out.println("Digite o c�digo do oper�rio: ");
		C=leia.next();
		System.out.println("Digite o n�mero de horas trabalhadas do oper�rio: ");
		N=leia.nextInt();
		
		if (N>50)
		{
			E=((N-LIMITEHORAS)*VALORHORAEXCEDENTE);
			salarioBase=LIMITEHORAS*VALORHORANORMAL;
			salarioTotal=(salarioBase+E);
			System.out.println("O sal�rio total foi de R$ "+salarioTotal+" e o sal�rio excedente foi de R$ "+E);
			
		}
		else
		{
			E=0;
			salarioBase=LIMITEHORAS*VALORHORANORMAL;
			salarioTotal=(salarioBase+E);
			System.out.println("O sal�rio total foi de R$ "+salarioTotal+" e n�o houve sal�rio excedente!");
		}
		
	}

}
