package testefuncao01;

public class TesteFuncao01 {

	static void soma(int a, int b) {
		int s = a + b;
		System.out.println("A soma é " + s);
	}

	public static void main(String[] args) {
		// o main é um método que não retorna valor que recebe vetor como parâmetro que
		// um método estático que é método publico
		System.out.println("Começou o programa"); // o método main é executado antes do procedimento soma
		soma(5, 2);// o método soma não é static, precisa acrescentar lá em cima no procedimento
					// (void) o static, só então erro é ajustado e é possivel chamar o procedimento
	}
}
