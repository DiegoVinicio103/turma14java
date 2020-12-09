package aulas;

import java.util.Scanner;

public class Celisusparafarenheit {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		double temperaturaC, temperaturaF;
		
		System.out.println("Informe a temperatura em C: ");
		temperaturaC = leia.nextDouble();
		temperaturaF =(temperaturaC *1.8) +32;
		System.out.println("A temperatura em F e : "+Math.round(temperaturaF));
		
	}

}

/*programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{	
		real TemperaturaC
		real TemperaturaF

	escreva("Informe a temperaturaaem C :")
	leia (TemperaturaC)
	TemperaturaF =(TemperaturaC *1.8) +32
	escreva("A temperatura em F e : " +Matematica.arredondar(TemperaturaF,2))
	
	
	
	
	
		
		
//	°F = °C × 1, 8 + 32
//	C = (°F − 30) ÷ 2

	}
}

*/