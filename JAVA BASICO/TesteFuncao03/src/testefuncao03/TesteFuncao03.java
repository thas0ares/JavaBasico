package testefuncao03;

public class TesteFuncao03 {
	public static void main(String[] args) { // public torna o metodo publico, static voc? n?o precisa transformar em
												// objeto para utiliza-lo, void o meu m?todo n?o vai me retornar um
												// valor, e args ? um vetor de String
		System.out.println("Vai come?ar a contagem");
		// System.out.println(Operacoes.contador(1, 5));// escrever na tela o resultado
		// do contador

		// a classe Operacoes consegue acessar o m?todo contador, porque ele ? est?tico,
		// se ele n?o fosse est?tico a ?nica maneira de conseguir acessa-lo seria por
		// meio da vari?vel de inst?ncia criando um novo objeto do tipo opera??es

		Operacoes operacoes = new Operacoes(); // criei um objeto do tipo Operacoes

		System.out.println(operacoes.contador(1, 5));// chamando um m?todo n?o est?tico
	}
}
