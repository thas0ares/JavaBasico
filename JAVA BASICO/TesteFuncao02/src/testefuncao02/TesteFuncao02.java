package testefuncao02;

public class TesteFuncao02 {

	static int soma(int a, int b) {// trocar void por int, o método calcula apenas fez o calculo
		int s = a + b;
		return s; // ao inves de escrever na tela eu peço que ele retorne
	}

	public static void main(String[] args) { // cuidou da exibição foi o método principal
		System.out.println("Começou o programa");
		int sm = soma(5, 2); // para fazer a chamada eu crio minha variável sm
		System.out.println("A soma vale " + sm);
	}
}
