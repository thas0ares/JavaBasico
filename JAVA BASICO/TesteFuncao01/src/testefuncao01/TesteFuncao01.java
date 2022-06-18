package testefuncao01;

public class TesteFuncao01 {

	static void soma(int a, int b) {
		int s = a + b;
		System.out.println("A soma � " + s);
	}

	public static void main(String[] args) {
		// o main � um m�todo que n�o retorna valor que recebe vetor como par�metro que
		// um m�todo est�tico que � m�todo publico
		System.out.println("Come�ou o programa"); // o m�todo main � executado antes do procedimento soma
		soma(5, 2);// o m�todo soma n�o � static, precisa acrescentar l� em cima no procedimento
					// (void) o static, s� ent�o erro � ajustado e � possivel chamar o procedimento
	}
}
