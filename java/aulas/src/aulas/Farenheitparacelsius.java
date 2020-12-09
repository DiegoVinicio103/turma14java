package aulas;

import java.util.Scanner;

public class Farenheitparacelsius {

	public static void main(String[] args) 
	{
		Scanner leia = new Scanner (System.in);
		double temperaturaC, temperaturaF;
		System.out.println("Informe a temperatura em F: ");
		temperaturaF=leia.nextDouble();
		temperaturaC = (temperaturaF -32) / 1.8;
		System.out.println("A temperatura em C é: "+Math.round(temperaturaC));
		
	}

}

/*
programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{		
		real TemperaturaC
		real TemperaturaF

		escreva("Informe a temperaturaaem F :")
		leia (TemperaturaF)
		TemperaturaC = (TemperaturaF -32) / 1.8
		escreva("A temperatura em C e : " +Matematica.arredondar(TemperaturaC,2))
		


	//F = °C × 1, 8 + 32
	//C = (°F − 30) ÷ 2
	}
}
*/