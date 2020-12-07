programa
{
	funcao inicio()
	{
		real vetor[5]
		inteiro codigo, x
		para (x=0; x<5; x++)
		{
			escreva("Digite o valor da posição ",x," do vetor: ")
			leia(vetor[x])
			limpa()
		}
		escreva("Digite o código: ")
		leia(codigo)
		enquanto ((codigo<0) ou (codigo>2))
				{
					escreva("Código inválido, digite novamente: ")
					leia(codigo)
				}
		se (codigo==1)
			{
				para (x=0; x<5; x++)
				{
					escreva(vetor[x],"\t")
				}
			}	
		senao se (codigo==2)
			{
				para (x=4; x>=0; x--)
				{
					escreva(vetor[x],"\t")
				}
			}
				
		}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 444; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */