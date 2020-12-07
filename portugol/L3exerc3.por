//1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e 
	//apresente no final o total do somatório, a média e o total de valores lidos. O programa
	//fazer as leituras dos valores enquanto o usuário estiver fornecendo  valores positivos
	//Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
programa
{
	inclua biblioteca Matematica --> mat
	
    funcao inicio()
	{
		inteiro valor=0, totalValor=0, totalSoma=0
		real media=0.0

		enquanto (valor>=0)
		{
			escreva ("Insira um valor numérico inteir: \n")
			leia(valor)
			limpa()
			totalValor++
			totalSoma=totalSoma+valor			
			media=(totalSoma/totalValor)
		}
		
		escreva("Total de números: ",totalValor)
		escreva("\nSoma Total: ",totalSoma)
		escreva("\nMédia: ",mat.arredondar(media, 2))
	}
}	
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 377; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */