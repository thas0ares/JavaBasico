package testes;

public class TestaVariaveis {

	public static void main(String[] args) {
		// variavel global
		int numero = 2;
		
		if (1==1) { // = atribui��o   == compara��o
			//variavel local
			int outroNumero = 4;
			System.out.println("A vari�vel local � "+ outroNumero);
			System.out.println("A vari�vel global � " + numero);
		}
		System.out.println("A vari�vel global � " + numero);
		
		if ('a'=='a') {
			numero = 4;
			System.out.println("O novo valor da vari�vel global � " + numero);
		}
		System.out.println("O novo valor da vari�vel global � " + numero);
	}
}
