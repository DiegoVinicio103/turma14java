programa
{
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
		caracter tipo
		real area=0.0, raio=0.0, base=0.0, altura=0.0
		escreva("Digite 1 - Retângulo\n")
		escreva("2 - Círculo\n")
		escreva("3 - Triângulo\n")
		leia(tipo)
		escolha (tipo)
		{
		caso '1':
					escreva("Digite a base do retangulo: ")
					leia(base)
				
					escreva("Digite a altura do retangulo: ")
					leia (altura)
					area=(base*altura)
					limpa()
				
					se (base>0 e altura>0)
					{
						escreva("A área do retangulo é ",area)
					}
					senao {
						escreva("Os valores da base e da altura do retangulo devem ser maiores que 0.")
						}
					 
				
				
						pare

		caso '2':
		
			escreva ("Digite o raio do círculo: ")
			leia(raio)
			area=(mat.PI*mat.potencia(raio, 2))
			escreva ("A área do círculo é: ",mat.arredondar(area, 2))

		pare

		caso '3':	
            
            escreva("Digite a base: ")
            leia(base)

            escreva("\nDigite a altura: ")
            leia(altura)
		}

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 839; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */