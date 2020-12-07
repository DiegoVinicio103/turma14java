programa
{
	
	funcao inicio()
	{ 
		inteiro cpf, numeroConta, movimentacao[3], operacao
		real saldoConta=0.0, valor=0.0
		real valorLimite=10000.0


		escreva("Bem vindo ao G6-Bank!\n")		
		escreva("Digite o seu CPF: \n")
		leia(cpf)
		escreva("Que tipo de operação você deseja realizar?\n")
		
		para (inteiro x=0; x<3; x++)
		{
			escreva("Digite 1 - Depósito ou 2 - Saque ")
			leia(operacao)
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
						movimentacao[x]=(-movimentacao[x])
						se (movimentacao[x]>saldoConta)
							{
								escreva("Saldo insuficiente, você deseja utilizar o crédito especial? ")
								escreva("\nLimite disponível: R$",valorLimite)
								escreva("\nDigite 1 - Sim ou 2 - Não")
								leia(especial)
									se (especial==1)
									{
										valorLimite=((saldoConta+valorLimite)-movimentacao[x])
										saldoConta=saldoConta-movimentacao[x]
									}
							}
				}
			senao 
			{
				escreva("Valor inválido! Favor digitar novamente! \n")	
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1308; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */