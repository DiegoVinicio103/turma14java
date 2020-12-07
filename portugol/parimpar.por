programa
{
	funcao inicio()
	{
					  
		inteiro numero

		escreva ("Digite um número ")
		leia (numero)
		
		se (numero == 0)
		{
			escreva ("Você digitou zero!")
		}
		senao se (numero < 0)
		{
			escreva ("Você digitou um número inválido!")
		}
	
		senao se (numero %2 == 0)
		{
			escreva ("Seu número é par")
		}
		senao {escreva ("Seu número é ímpar!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 363; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */