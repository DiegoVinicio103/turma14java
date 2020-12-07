programa
{
	funcao inicio()
	{
					  
		inteiro P=0, E=0, M=0
		escreva ("Digite o peso dos tomates: ")
		leia (P)
		
		se (P>50)
		{
			E=P-50
			M=4*E
			escreva ("O excesso foi de ",E," kg e o valor da multa é de R$",M)
		}
		senao 
		{
			E=0
			M=0
			escreva ("O excesso foi de ",E," kg e o valor da multa é de R$",M, " \nNão houve multa por excesso!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 153; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */