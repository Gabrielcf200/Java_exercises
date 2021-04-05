package exercises_complete.ArrayRoom;

public class Quartos {
	private String nome; 
	private String email;
	
	public Quartos(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return nome.toUpperCase() + ", " + email.toUpperCase();
	}
	
	
	
	
}
