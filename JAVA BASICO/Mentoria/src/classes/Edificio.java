package classes;

public class Edificio {
	int andares;
	String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAndares() {
		return andares;
	}

	public void setAndares(int andares) { // eu posso passar par?metro
		this.andares = andares;
	}
	
//	public void mostrarMoradores() { // ou n?o preciso passar passar par?metro
//		System.out.println("S? mora rico aqui!");
//	}
}
