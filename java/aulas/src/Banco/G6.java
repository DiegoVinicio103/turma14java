package Banco;

import java.util.Random;
import java.util.Scanner;

public class G6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Random r = new Random();
		double movimentoConta, limiteConta;
		int numConta;
		char status, continuar = 'S';
		double limite[]=new double [40];
		for (int x=0; x<40; x++) {
			limite[x]=r.nextDouble()*+100;	
			System.out.println(limite[x]);
		}

	}

	
}

/*funcao contaEspecial(){
	para(inteiro j=0; j<DIAS; j++){
		para (inteiro i=0; i<MAXMOVIMENTACOES; i++)
	{
		limpa()
		escreva("\nVoc� quer Creditar (C) ou Debitar (D) da conta? ")
		leia(status)
		status = Texto.caixa_alta(status)
		enquanto (status != "C" e status != "D")
		{
			escreva("Opera��o inv�lida! Favor digitar (C) para dep�sito ou (D) para Saque: ")
			leia(status)
			status = Texto.caixa_alta(status)
		}
		se (status=="C")
		{
			escreva("\nQuanto voc� quer depositar: R$ ")
			leia(movimentoConta[j][i])
			enquanto (movimentoConta[j][i]<0)
			{
				escreva("\nValor inv�lido! Quanto voc� quer depositar: R$")
				leia(movimentoConta[j][i])						
			} 
			saldoConta=saldoConta+movimentoConta[j][i]			
		}
		senao se (status =="D")
		{
			escreva("\nQuanto voc� quer retirar: R$ ")
			leia(movimentoConta[j][i])
			enquanto (movimentoConta[j][i]<0)
			{
				escreva("\nValor inv�lido. Quanto voc� quer retirar: R$ ")
				leia(movimentoConta[j][i])
			} 
			enquanto (movimentoConta[j][i]>saldoConta+valorLimite)
			{
				escreva("Saldo e Limite de cr�dito insuficientes! Quanto voc� quer retirar: R$ ")
				leia(movimentoConta[j][i])
			}	
			se (movimentoConta[j][i]>saldoConta)
			{
				escreva("\nLimite dispon�vel: R$",valorLimite)
				escreva("\nSaldo insuficiente! Voc� deseja utilizar o cr�dito especial (S ou N)?")
				leia(especial)
				especial = Texto.caixa_alta(especial)
			enquanto (especial!="S" e especial!="N")
				{
					escreva("Valor inv�lido! Digite (S ou N) ")
					leia(especial)
				}											
				se (especial=="S")
				{	
					valorLimite=((saldoConta+valorLimite)-movimentoConta[j][i])
					movimentoConta[j][i]= -movimentoConta[j][i]
					saldoConta=saldoConta + movimentoConta[j][i]
					se(saldoConta <0.0){
						saldoConta = 0.0
					}
				}	
				senao 
				{
					escreva("\nO saque n�o poder� ser realizado! ")
				}				
			}
		}			
	}
	}
	escreva("\nVoc� tem ",Mat.arredondar(saldoConta,2)," reais na sua conta do G6 Bank")
	escreva("\nSeu limite dispon�vel �: R$ ",valorLimite)
	encerramento()
	escreva("\nSeu limite dispon�vel �: R$ ",valorLimite)
	extrato()
}*/
