programa
{
	const inteiro LIMITEALUNOS = 39
	inteiro notaAlunos[LIMITEALUNOS]
	inteiro matricula[LIMITEALUNOS]
	cadeia matriculaFinal[LIMITEALUNOS]
	cadeia matriculaAtual
	caracter opcao = 's'
	cadeia nomeAlunos[] = {"Allen de Lima Vieira","André de Brito Silva da Costa","Bárbara Liboni Guerra","Beatriz Martins","Beymar Jhoel Acapa Lima","Breno Nogueira Botelho Noccioli","Daniel Augusto Gomes Ferreira Filho","Danilo Mendes Ferreira","Danilo Pereira da Silva","Davi Silva Vieira","Diego Vinicio da Silva Nascimento","Erick Costa Ferreira","Ewerton Inacio Lima","FERNANDA AGAPITO","Fernanda Barbosa Ferraz","Francisco José Pires","Gabriel Sérgio Nascimento Santos Gonçalves","Gideão da Silva Idelfonso","GILSON AMORIM DE MATOS","Guilherme Gonçalves da Silva","Gustavo Rabelo Teles","HELOISA BEATRIZ DE OLIVEIRA COSTA","Igor Mateus Queiroz Gato","Isabel Emiko Yamakawa Oyama","Jackeline Akemi de Moura","José Jorge Hauck Júnior","Juliana Santos André","Kélven Cleiton de Araújo Brandão","Laís Lima Santos","Lucas anseloni barros","Lucas Gonçalves da SIlva","luis felipe da silva","Luiz Felipe da Silva Magalhães","Marcos Eduardo Gomes Gonçalves","Micaely da Silva Lima","Rafaela Oliveira Silva","Tiago dos Santos Martins","Verônica Navarro Almenara","Vinicius Alves Miranda"}
	caracter genero[] = {'M','M','F','F','M','M','M','M','M','M','M','M','M','F','F','M','M','M','M','M','M','F','M','F','F','M','F','M','F','M','M','M','M','M','F','F','M','F','M'}
	funcao inicio()
	{
		para(inteiro x = 0; x < LIMITEALUNOS; x++){
			matricula[x] = x+1
			se(matricula[x] < 10){
				matriculaFinal[x] = ("G6-0"+matricula[x])
			}
			senao{
				matriculaFinal[x] = ("G6-"+matricula[x])
			}
		}

		faca
		{
			escreva("Digite a matrícula: ")
			leia(matriculaAtual)
			para(inteiro x = 0; x < LIMITEALUNOS; x++){
				se(matriculaAtual == matriculaFinal[x]){
					escreva("Digite a nota de 1 a 10: ")
					leia(notaAlunos[x])
				}
			}
			escreva("Você quer continuar S ou N? ")
			leia(opcao)
		} enquanto (opcao == 's' ou opcao == 'S')
		// mostrar matricula nome e nota desta pessoa (nota <5 reprovavdo) (5 a 8 recuperacao)
		limpa()
		para(inteiro x = 0; x < LIMITEALUNOS; x++){
			se(notaAlunos[x] < 5){
				se(genero[x] == 'M'){
					escreva("\n",matriculaFinal[x]," - Aluno ", nomeAlunos[x], " está reprovado com nota ",notaAlunos[x],"!")
				}
				senao{
					escreva("\n",matriculaFinal[x]," - Aluna ", nomeAlunos[x], " está reprovada com nota ",notaAlunos[x],"!")
				}
			}
			senao se(notaAlunos[x] >= 5 e notaAlunos[x] <8){
				se(genero[x] == 'M'){
					escreva("\n",matriculaFinal[x]," - Aluno ", nomeAlunos[x], " está de recuperação com nota ",notaAlunos[x],"!")
				}
				senao{
					escreva(matriculaFinal[x]," - Aluna ", nomeAlunos[x], " está de recuperação com nota ",notaAlunos[x],"!")
				}
			}
			senao{
				se(genero[x] == 'M'){
					escreva("\n",matriculaFinal[x]," - Aluno ", nomeAlunos[x], " está aprovado com nota ",notaAlunos[x],"!")
				}
				senao{
					escreva("\n",matriculaFinal[x]," - Aluna ", nomeAlunos[x], " está aprovado com nota ",notaAlunos[x],"!")
				}
			}
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 192; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */