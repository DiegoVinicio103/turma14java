import java.util.Scanner;

public class Lista1exerc3 {
		public static void main(String[] args)
		{
			Scanner leia = new Scanner (System.in);
			int segundos, horas, minutos, tempoSegundos;
			System.out.println("Digite o tempo do evento em segundos ");
			tempoSegundos=leia.nextInt();
			horas = (tempoSegundos/3600);
			minutos = (tempoSegundos%3600)/60;
			segundos = (tempoSegundos%3600)%60;
			System.out.printf("O tempo do evento foi de "+horas+ " hora(s) "+ minutos+ " minuto(s) e "+segundos+ " segundo(s)");
			
		}
	
}


/*funcao inicio()
{
inteiro segundos, horas, minutos, tempoSegundos
escreva("Digite o tempo do evento em segundos ")
leia(tempoSegundos)
horas = (tempoSegundos/3600)
minutos = (tempoSegundos%/3600)/60
segundos = (tempoSegundos%/3600)%/60)
escreva ("O tempo do evento foi de ", horas, " hora(s) ", minutos, " minuto(s) e ", segundos, " segundo(s)")
}
}

*/