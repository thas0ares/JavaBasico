package comparacaostring;

public class ComparacaoString {

	public static void main(String[] args) {
		//maneiras  diferentes de declarar o mesmo objeto -> COMPARANDO STRINGS
		String nome1 = "Gustavo";
		String nome2 = "Gustavo";
		String nome3 = new String("Gustavo"); /*String � uma classe ele 
		automaticamente vai criar um objeto*/
		String res;
		/*res = (nome1==nome2)?"igual":"diferente";
		 *se nome1 for igual a nome 2 ent�o imprima igual
		 */
		/*res = (nome1==nome3)?"igual":"diferente";o �ltimo objeto foi instaciado 
		usando a classe new, ent�o ele n�o tem tecnicamente a mesa estrutura de cima
		o conte�do dele s�o iguais*/
		res = (nome1.equals(nome3))?"igual":"diferente"; /* o nome como ele � um objeto ele
		 pode ter m�todos, o .equals � um m�todo que verifica se o conte�do de 
		 um objeto � igual ao conte�do do outro, ISSO SERVE PARA QUALQUER UMA DAS CLASSES INVOLUCROS */
		System.out.println(res);
	}
}
