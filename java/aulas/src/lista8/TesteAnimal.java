package lista8;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Animal cachorro1 = new Cachorro("C�rbero");
		Animal preguica1 = new Preguica("Jaiminho");
		Animal cavalo1 = new Cavalo ("P� de Pano");
		
		System.out.print("O Cachorro "+cachorro1.getNome()+" emite um "); cachorro1.emiteSom();
		System.out.print("O Cavalo "+cavalo1.getNome()+" emite um "); cavalo1.emiteSom();
		System.out.print("A pregui�a "+preguica1.getNome()+" emite um "); preguica1.emiteSom();
	}

}
