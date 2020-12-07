programa
{
	
	funcao inicio()
	{
		inteiro numero1=0, numero2=0, numero3=0, numero4=0, quadrado3=0, quadrado1=0, quadrado2=0, quadrado4=0
		escreva ("Digite o primeiro número: ")
		leia(numero1)
		escreva ("Digite o segundo número: ")
		leia(numero2)
		escreva ("Digite o terceiro número: ")
		leia(numero3)
		escreva ("Digite o quarto número: ")
		leia(numero4)
		quadrado3=numero3*numero3
		quadrado1=numero1*numero1
		quadrado2=numero2*numero2
		quadrado4=numero4*numero4	
		se (quadrado3>=1000)
			{
			escreva ("O quadrado do terceiro número é maior que 1000 e vale ", quadrado3)
			}
		senao
			{
			escreva ("Número	Quadrado\n")
			escreva (numero1,"------",quadrado1,"\n")
			escreva (numero2,"------",quadrado2,"\n")	
			escreva (numero3,"------",quadrado3,"\n")
			escreva (numero4,"------",quadrado4,"\n")
			}
					
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 446; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */