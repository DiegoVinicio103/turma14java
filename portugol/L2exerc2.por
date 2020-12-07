programa
{
	funcao inicio()
	{
					  
		inteiro C=0, N=0, E=0, salarioTotal=0

		escreva ("Digite o código do operário: ")
		leia (C)
		escreva ("Digite o número de horas trabalhadas do operário: ")
		leia (N)
		
		se (N>50)
		{
			E=(N-50)*10
			salarioTotal=10*N
			escreva ("O salário total foi de R$ ",salarioTotal," e o salário excedente foi de R$ ",E)
		}
		senao 
		{
			E=0
			salarioTotal=10*N
			escreva ("O salário total foi de R$ ",salarioTotal," e não houve salário excedente!")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 220; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */