package lista9;

public class Produto {
	
	String nome;
	double valor;
	String fornecedor;
	int qntEstoque;
	
	
	public Produto(String nome, double valor, String fornecedor, int qntEstoque)
	{
		this.nome = nome;
		this.valor = valor;
		this.fornecedor = fornecedor;
		this.qntEstoque = qntEstoque;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getValor() {
		return valor;
	}


	public void setValor(double valor) {
		this.valor = valor;
	}


	public String getFornecedor() {
		return fornecedor;
	}


	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}


	public int getQntEstoque() {
		return qntEstoque;
	}


	public void setQntEstoque(int qntEstoque) {
		this.qntEstoque = qntEstoque;
	}
	
	
}
