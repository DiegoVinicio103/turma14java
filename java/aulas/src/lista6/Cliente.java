package lista6;

public class Cliente {
		public String email;
		public String cpf;
		public String nome;
		public char genero;
		
		
		public Cliente(String cpf, char genero) {
			this.cpf = cpf;	
		}
		
		public void getDados() {
			System.out.println(this.nome);
			System.out.println(this.email);
			System.out.println(this.cpf);
			
			
		}

}
