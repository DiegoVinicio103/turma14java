import java.util.Scanner;

public class L2exerc2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		String C;
		int N=0, E=0, salarioTotal=0, salarioBase=0;
		final int LIMITEHORAS=50;
		final int VALORHORAEXCEDENTE=20;
		final int VALORHORANORMAL=10;
		System.out.println("Digite o código do operário: ");
		C=leia.next();
		System.out.println("Digite o número de horas trabalhadas do operário: ");
		N=leia.nextInt();
		
		if (N>50)
		{
			E=((N-LIMITEHORAS)*VALORHORAEXCEDENTE);
			salarioBase=LIMITEHORAS*VALORHORANORMAL;
			salarioTotal=(salarioBase+E);
			System.out.println("O salário total foi de R$ "+salarioTotal+" e o salário excedente foi de R$ "+E);
			
		}
		else
		{
			E=0;
			salarioBase=LIMITEHORAS*VALORHORANORMAL;
			salarioTotal=(salarioBase+E);
			System.out.println("O salário total foi de R$ "+salarioTotal+" e não houve salário excedente!");
		}
		
	}

}
