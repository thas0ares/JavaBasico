package classes;

public class Fatorial {
	// atributos
	private int num = 0;
	private int fat = 1;
	private String formula = "";

	// m?todos
	public void setValor(int n) {
		num = n;
		int f = 1; // vari?vel
		String s = ""; // preencher uma String, vazia
		for (int c = n; c > 1; c--) {// calculo do fatorial de 1, meu contador vai come?ar com um n?mero; enquanto
										// meu contador for maior que 1; eu tiro uma unidade dele
			f *= c; // o meu fatorial vai ser o meu fatorial vezes o meu contador
			s += c + " x "; // String s, concatenado com meu contador + concatenado com 'x'
		}
		s += "1 = ";
		fat = f; // fatorial que ? o atributo receba 'f'
		formula = s;// String formula receba 's'
	}

	public int getFatorial() { // metodo que retorno o valor do fatorial
		return fat;
	}

	public String getFormula() { // m?todo que retorna a formula
		return formula;
	}

}