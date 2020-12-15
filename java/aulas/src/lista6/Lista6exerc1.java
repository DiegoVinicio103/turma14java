package lista6;

import java.util.Scanner;

public class Lista6exerc1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cliente cliente1 = new Cliente("012.345.678-90", 'M');
		
		System.out.println("Digite o seu email: ");
		cliente1.email = sc.next();
		System.out.println("Digite o seu nome: ");
		cliente1.email = sc.next();
		
		cliente1.getDados();
	
	}

}
