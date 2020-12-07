programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		
		real raio=0.0
		escreva ("Digite o raio do círculo: ")
		leia(raio)
		escreva ("A área do círculo é: ",mat.arredondar(calculoarea(raio), 2))
	}
	funcao real calculoarea (real raio)
	{
		real area
		area=(mat.PI*mat.potencia(raio, 2))
		retorne area
	}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 109; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */