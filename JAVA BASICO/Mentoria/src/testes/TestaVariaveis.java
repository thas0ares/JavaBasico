package testes;

public class TestaVariaveis {

	public static void main(String[] args) {
		// variavel global
		int numero = 2;
		
		if (1==1) { // = atribuição   == comparação
			//variavel local
			int outroNumero = 4;
			System.out.println("A variável local é "+ outroNumero);
			System.out.println("A variável global é " + numero);
		}
		System.out.println("A variável global é " + numero);
		
		if ('a'=='a') {
			numero = 4;
			System.out.println("O novo valor da variável global é " + numero);
		}
		System.out.println("O novo valor da variável global é " + numero);
	}
}
