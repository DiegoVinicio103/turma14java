package lista8;

public class Preguica extends Animal{
	private boolean sobeArvore;
	
	public Preguica (String nome) {
		super(nome);
	}
	
	public Preguica (String nome, boolean sobeArvore) {
		super(nome);
		this.sobeArvore = sobeArvore;
		
	}

	public boolean isSobeArvore() {
		return sobeArvore;
	}

	public void setSobeArvore(boolean sobeArvore) {
		this.sobeArvore = sobeArvore;
	}
	
	@Override
	public void emiteSom() {
		System.out.println("Bocejo");
	}
	}
	
