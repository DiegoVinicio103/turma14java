package lista8;

public class Animal {
	private String nome;
	private int idade;
	private String somAnimal;
	
	public Animal(String nome) {
		this.nome = nome;
	}


	public Animal(String nome, int idade, String somAnimal) {
		this.nome = nome;
		this.idade = idade;
		this.somAnimal = somAnimal;				
	}

	
	public Animal (String nome, String somAnimal) {
		this.nome = nome;
		this.somAnimal = somAnimal;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getSomAnimal() {
		return somAnimal;
	}

	public void setSomAnimal(String somAnimal) {
		this.somAnimal = somAnimal;
	}

	public void emiteSom() {
		
	}
	
	
}
