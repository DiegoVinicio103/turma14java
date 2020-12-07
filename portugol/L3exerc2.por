//2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos
//de três e que se encontram no conjunto dos números de 1 até 500.

programa
{
    funcao inicio()
    {
		inteiro somaTotal=0

		para (inteiro x=1; x<=500; x++)
		{
			se ((x%2!=0) e (x%3==0))
			{
				somaTotal=somaTotal+x
			}
			
		}
		escreva ("A soma dos números ímpares e múltiplos de 3 no intervalo de 1 a 500 é: ",somaTotal)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 19; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */