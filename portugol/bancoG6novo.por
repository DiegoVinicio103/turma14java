programa
{
	
	funcao inicio()
	{ 
		const inteiro MOVIMENTACOES=10
		inteiro cpf, numeroConta, movimentacao[MOVIMENTACOES], operacao, especial
		real saldoConta=0.0, valor=0.0
		real valorLimite=10000.0
		


		escreva("Bem vindo ao G6-Bank!\n")		
		escreva("Digite o seu CPF: \n")
		leia(cpf)
		
		
		para (inteiro x=0; x<MOVIMENTACOES; x++)
		{
			escreva("\nQue tipo de operação você deseja realizar?\n")
			escreva("Digite 1 - Depósito ou 2 - Saque ")
			leia(operacao)
			enquanto (operacao!=1 e operacao!=2)
			{
				escreva("Valor inválido! Favor digitar 1 para depósito ou 2 para Saque: ")
							leia(operacao)
			}
			se (operacao==1)
				{
					escreva("Digite quanto você quer depositar: ")
					leia(movimentacao[x])
						enquanto (movimentacao[x]<=0)
						{
							escreva("Valor inválido! Favor digitar valor positivo: ")
							leia(movimentacao[x])
							
						} 
						saldoConta=saldoConta+movimentacao[x]
						escreva("Seu novo saldo é: \n",saldoConta)
							
				}
			senao se (operacao ==2)
				{
					escreva("Digite quanto você quer sacar: ")
					leia(movimentacao[x])
					enquanto (movimentacao[x]<=0)
						{
							escreva("Valor inválido! Favor digitar valor positivo: ")
							leia(movimentacao[x])
						} 
					enquanto (movimentacao[x]>saldoConta+valorLimite)
										{
											escreva("Saldo e Limite de crédito insuficientes! Digite outro valor! ")
											leia(movimentacao[x])
										}	
						se (movimentacao[x]>saldoConta)
							{
								escreva("Saldo insuficiente, você deseja utilizar o crédito especial? ")
								escreva("\nLimite disponível: R$",valorLimite)
								escreva("\nDigite 1 - Sim ou 2 - Não ")
								leia(especial)
									enquanto (especial!=1 e especial!=2)
									{
										escreva("Valor inválido! Digite 1-Sim ou 2-Não ")
										leia(especial)
									}
										
									se (especial==1)
									{	
										valorLimite=((saldoConta+valorLimite)-movimentacao[x])
										saldoConta=saldoConta-movimentacao[x]
										se (saldoConta<0)
										{
											saldoConta=0.0
										}
										escreva("\nSeu saldo é: R$",saldoConta)
										escreva("\nSeu Limite disponível é: R$",valorLimite)
									}	
									senao 
									{
										escreva("\nO saque não poderá ser realizado! ")
									}				
							}
					}			
				}			
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 8; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */