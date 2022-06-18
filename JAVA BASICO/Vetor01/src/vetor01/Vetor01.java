package vetor01;

public class Vetor01 {
	public static void main(String[] args) {
		// cria um objeto, então tem caracteristicas, propriedades, atributos, funções,
		// métodos
		int n[] = { 3, 2, 8, 7, 5, 4 };
		// System.out.println("Total de casas de N " + n.length); ou

		for (int c = 0; c <= n.length - 1; c++) { // já que são 6 casas eu tenho que ir de 0 á 5 por isso -1 no legnth -> atributo comprimento
			// n na posição c -> mostra o valor dos índices
			System.out.println("Na posição " + c + " temos o valor " + n[c]);
		}

	}
}
