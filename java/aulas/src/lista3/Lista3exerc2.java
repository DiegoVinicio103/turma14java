package lista3;

public class Lista3exerc2 {

	public static void main(String[] args) {
		int somaTotal=0, x=0;
		for (x=1; x<=500; x++) {
			
			if ((x%2!=0) && (x%3==0))
			{
				somaTotal=somaTotal+x;
			}
		
		}
		System.out.println("A soma dos números ímpares e múltiplos de 3 no intervalo de 1 a 500 é: "+somaTotal);
	}

}
