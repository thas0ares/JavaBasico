package testefuncao02;

public class TesteFuncao02 {

	static int soma(int a, int b) {// trocar void por int, o m�todo calcula apenas fez o calculo
		int s = a + b;
		return s; // ao inves de escrever na tela eu pe�o que ele retorne
	}

	public static void main(String[] args) { // cuidou da exibi��o foi o m�todo principal
		System.out.println("Come�ou o programa");
		int sm = soma(5, 2); // para fazer a chamada eu crio minha vari�vel sm
		System.out.println("A soma vale " + sm);
	}
}
