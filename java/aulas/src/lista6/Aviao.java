package lista6;

public class Aviao {
		String modelo;
		String ciaAerea;
		int qtdePassageiros;
		boolean conserto;
		
		public Aviao(String modelo, String ciaAerea, boolean conserto) {
			this.modelo = modelo;
			this.ciaAerea = ciaAerea;
			this.conserto = conserto;
		}
		
		public void manutencao() {
			
				if (this.conserto=true) {
				System.out.println("O avi�o de modelo "+this.modelo+" e Companhia a�rea "+this.ciaAerea+", n�o poder� decolar e ir� para manuten��o");
				}
				else {
					System.out.println("O avi�o de modelo "+this.modelo+" e Companhia a�rea "+this.ciaAerea+"est� apto para decolar");	
				}
		}
		
		
}
