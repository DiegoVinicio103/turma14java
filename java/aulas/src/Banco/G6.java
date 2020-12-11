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
		escreva("\nVocê quer Creditar (C) ou Debitar (D) da conta? ")
		leia(status)
		status = Texto.caixa_alta(status)
		enquanto (status != "C" e status != "D")
		{
			escreva("Operação inválida! Favor digitar (C) para depósito ou (D) para Saque: ")
			leia(status)
			status = Texto.caixa_alta(status)
		}
		se (status=="C")
		{
			escreva("\nQuanto você quer depositar: R$ ")
			leia(movimentoConta[j][i])
			enquanto (movimentoConta[j][i]<0)
			{
				escreva("\nValor inválido! Quanto você quer depositar: R$")
				leia(movimentoConta[j][i])						
			} 
			saldoConta=saldoConta+movimentoConta[j][i]			
		}
		senao se (status =="D")
		{
			escreva("\nQuanto você quer retirar: R$ ")
			leia(movimentoConta[j][i])
			enquanto (movimentoConta[j][i]<0)
			{
				escreva("\nValor inválido. Quanto você quer retirar: R$ ")
				leia(movimentoConta[j][i])
			} 
			enquanto (movimentoConta[j][i]>saldoConta+valorLimite)
			{
				escreva("Saldo e Limite de crédito insuficientes! Quanto você quer retirar: R$ ")
				leia(movimentoConta[j][i])
			}	
			se (movimentoConta[j][i]>saldoConta)
			{
				escreva("\nLimite disponível: R$",valorLimite)
				escreva("\nSaldo insuficiente! Você deseja utilizar o crédito especial (S ou N)?")
				leia(especial)
				especial = Texto.caixa_alta(especial)
			enquanto (especial!="S" e especial!="N")
				{
					escreva("Valor inválido! Digite (S ou N) ")
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
					escreva("\nO saque não poderá ser realizado! ")
				}				
			}
		}			
	}
	}
	escreva("\nVocê tem ",Mat.arredondar(saldoConta,2)," reais na sua conta do G6 Bank")
	escreva("\nSeu limite disponível é: R$ ",valorLimite)
	encerramento()
	escreva("\nSeu limite disponível é: R$ ",valorLimite)
	extrato()
}*/
