package testefuncao03;

public class Operacoes {
	// m�todo que ir� me retornar uma String, para linkar com o outro
	// arquivo temos que deixar o metodo static e public
	public String contador(int i, int f) { //colocar static caso voc� n�o tenha criado o objeto
		String s = "";
		for (int c = i; c <= f; c++) {
			s += c + " ";
		}
		return s;
	}
}
