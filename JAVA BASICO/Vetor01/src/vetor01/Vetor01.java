package vetor01;

public class Vetor01 {
	public static void main(String[] args) {
		// cria um objeto, ent�o tem caracteristicas, propriedades, atributos, fun��es,
		// m�todos
		int n[] = { 3, 2, 8, 7, 5, 4 };
		// System.out.println("Total de casas de N " + n.length); ou

		for (int c = 0; c <= n.length - 1; c++) { // j� que s�o 6 casas eu tenho que ir de 0 � 5 por isso -1 no legnth -> atributo comprimento
			// n na posi��o c -> mostra o valor dos �ndices
			System.out.println("Na posi��o " + c + " temos o valor " + n[c]);
		}

	}
}
