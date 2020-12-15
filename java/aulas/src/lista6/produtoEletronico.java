package lista6;

public class produtoEletronico {
	int voltagem;
	String fabricante;
	String nome;
	
	public produtoEletronico(String nome, int voltagem) {
		this.nome=nome;
		this.voltagem=voltagem;
	}
		
	public void getEletronico() {
		System.out.println("o aparelho "+this.nome+" deve ser carregado em uma fonte de "+this.voltagem+" volts");
	}
}
