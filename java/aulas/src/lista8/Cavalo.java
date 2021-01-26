package lista8;

public class Cavalo extends Animal {
	private boolean corre;
	
	public Cavalo (String nome) {
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
		System.out.println("Relincho");
	}
	
}
