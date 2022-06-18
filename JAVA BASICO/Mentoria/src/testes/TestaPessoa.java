package testes;

import classes.Pessoa;

public class TestaPessoa {

	public static void main(String[] args) {
		//Pessoa = classe; pessoa = objeto
		Pessoa pessoa = new Pessoa();
		System.out.println("O nome da pessoa é: " + pessoa.getNome());
		//o set é sempre para que eu consiga inserir dados
		pessoa.setNome("Thais Teste");
		//o get e sempre para eu obter a informação que eu inseri
		pessoa.getNome();
		System.out.println("O nome da pessoa é: " + pessoa.getNome());
	}
}
