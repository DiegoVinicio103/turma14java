programa
{
	inclua biblioteca Util
	
	funcao inicio()
	{
		inteiro N1[4][6], N2[4][6], M1[4][6], M2[4][6]

		escreva("Matriz N1\n")
		para (inteiro l=0; l<4; l++)
		{
			para (inteiro c=0; c<6; c++)
			{
				N1[l][c]=Util.sorteia(1,9)
				escreva(N1[l][c]," ")
			}
			escreva("\n")
		}
		escreva("\nMatriz N2\n")
		para (inteiro l=0; l<4; l++)
		{
			para (inteiro c=0; c<6; c++)
			{
				N2[l][c]=Util.sorteia(1,9)
				escreva(N2[l][c]," ")
			}
			escreva("\n")
		}
		escreva("\nMatriz M1\n")
		para (inteiro l=0; l<4; l++)
		{
			para (inteiro c=0; c<6; c++)
			{
				M1[l][c]=N1[l][c]+N2[l][c]
				escreva(M1[l][c]," ")
			}
			escreva("\n")
		}
		escreva("\nMatriz M2\n")
		para (inteiro l=0; l<4; l++)
		{
			para (inteiro c=0; c<6; c++)
			{
				M2[l][c]=N1[l][c]-N2[l][c]
				escreva(M2[l][c]," ")
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
 * @POSICAO-CURSOR = 843; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */