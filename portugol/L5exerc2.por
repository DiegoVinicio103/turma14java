programa
{
	inclua biblioteca Matematica-->mat
	funcao inicio()
	{
		real altura=0.0, peso=0.0, IMC=0.0
		
		escreva("Digite a sua altura: ")
		leia(altura)
		enquanto (altura<=0)
		{
			escreva("\nValor inválido, digite novamente: ")
			leia(altura)
		}
		escreva("\nDigite o seu peso: ")
		leia(peso)
		enquanto (peso<=0)
		{
			escreva("\nValor inválido, digite novamente: ")
			leia(peso)
		}
		IMC=((peso/(mat.potencia(altura,2))))
		se (IMC<=18.5 e IMC>0)
		{
			escreva("De acordo com seu IMC, você está abaixo do peso ")
		}
		senao se (IMC>18.5 e IMC<=25)
		{
			escreva("De acordo com seu IMC, você está com peso normal ")
		}
		senao se (IMC>25 e IMC<=30)
		{
			escreva("De acordo com seu IMC, você está acima do peso ")
		}
		senao
		{
			escreva("De acordo com seu IMC, você está obeso ")
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 564; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */