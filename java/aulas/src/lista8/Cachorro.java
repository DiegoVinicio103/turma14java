package lista8;

public class Cachorro extends Animal {
	private boolean corre;
	
	public Cachorro (String nome,boolean corre) {
		super(nome);
		this.corre = corre;
	}
	
	public Cachorro (String nome) {
		super(nome);
	}

	public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}
	
	@Override
	public void emiteSom() {
		System.out.println("Latido");
	}

}
