programa
{
	
	funcao inicio()
	{
		inteiro valor[6]
		inteiro maior=0, x=0

		para (x=1; x<6; x++)
		{
			escreva("Digite a pontuação: ")
			leia(valor[x])
			se (valor[x]>maior)
			{
				maior=valor[x]
			}
		}
		escreva("O maior valor é: ",maior)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 211; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */