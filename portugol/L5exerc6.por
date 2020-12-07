programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro vetor[3], matriz[3][3], multiplicacao[3][3]
		inteiro linha, coluna
		escreva("Vetor:\n")
		para  (linha=0; linha<3; linha++)
			{
				vetor[linha]=Util.sorteia(0, 9)
				escreva(vetor[linha], "\n")
			}
			escreva("\nMatriz: \n")
			
		para  (linha=0; linha<3; linha++)
			{
				para (coluna=0; coluna<3; coluna++)
				{
					matriz[linha][coluna]=Util.sorteia(0, 9)
					escreva(matriz[linha][coluna],"\t")
				}
				escreva("\n")
			}
			escreva("\nVetor x Matriz:\n")
		para  (linha=0; linha<3; linha++)
			{
				para (coluna=0; coluna<3; coluna++)
				{
					multiplicacao[linha][coluna]=vetor[linha]*matriz[linha][coluna]
					escreva(multiplicacao[linha][coluna],"\t")
				}
				escreva("\n")
			} 	
		 		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 505; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */