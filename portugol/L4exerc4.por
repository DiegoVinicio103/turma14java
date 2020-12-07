programa
{
	/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em 
	 * seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
	 * ou seja, diagonal principal.
	 * 
	 */
	funcao inicio()
	{
		inteiro matriz[3][3]
		inteiro somaTotal=0, somaDiagonal=0

		para  (inteiro linha=0; linha<3;linha++)
		{
			para (inteiro coluna=0; coluna<3; coluna++)
			{
			escreva("Entre com o valor da posição [",linha,";",coluna,"] ")	
			leia(matriz[linha][coluna])
			}			
		}
		para  (inteiro linha=0; linha<3;linha++)
		{
			para (inteiro coluna=0; coluna<3; coluna++)
			{
			somaTotal=matriz[linha][coluna]+somaTotal
			}			
		}
		para  (inteiro linha=0; linha<3;linha++)
		{
			para (inteiro coluna=0; coluna<3; coluna++)
			{
				se (linha==coluna)
				{
					somaDiagonal=matriz[linha][coluna]+somaDiagonal
				}
			}			
		}
		escreva("A soma de todos os valores da matriz é: ",som1
		aTotal)
		escreva("\nA soma dos valores da diagonal principal é: ",somaDiagonal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 828; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */