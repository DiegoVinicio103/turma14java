package lista7;


public class Teste {

	public static void main(String[] args) {
		
		Pessoa diego = new Pessoa("Diego Vinicio da Silva Nascimento");
		Administrador dayane = new Administrador ("Dayane Vanessa", 2000.00);
		Pessoa danielle = new Vendedor ("Danielle Valeria", 12000.00, 0.35);
		diego.setEndereco("Avenida X, Nº Y - Campinas");
		dayane.setTelefone("99999-9999");
		danielle.setTelefone("98888-8888");	
		
		System.out.println("A Pessoa "+diego.getNome()+" mora em "+diego.getEndereco());
		System.out.println("A Administradora "+dayane.getNome()+" possui o telefone "+dayane.getTelefone());
		System.out.println("A Vendedora "+danielle.getNome()+" possui o telefone "+danielle.getTelefone());
	}

}
