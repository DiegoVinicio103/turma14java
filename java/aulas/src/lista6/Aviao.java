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
				System.out.println("O avião de modelo "+this.modelo+" e Companhia aérea "+this.ciaAerea+", não poderá decolar e irá para manutenção");
				}
				else {
					System.out.println("O avião de modelo "+this.modelo+" e Companhia aérea "+this.ciaAerea+"está apto para decolar");	
				}
		}
		
		
}
