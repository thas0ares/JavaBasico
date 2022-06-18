package comparacaostring;

public class ComparacaoString {

	public static void main(String[] args) {
		//maneiras  diferentes de declarar o mesmo objeto -> COMPARANDO STRINGS
		String nome1 = "Gustavo";
		String nome2 = "Gustavo";
		String nome3 = new String("Gustavo"); /*String é uma classe ele 
		automaticamente vai criar um objeto*/
		String res;
		/*res = (nome1==nome2)?"igual":"diferente";
		 *se nome1 for igual a nome 2 então imprima igual
		 */
		/*res = (nome1==nome3)?"igual":"diferente";o último objeto foi instaciado 
		usando a classe new, então ele não tem tecnicamente a mesa estrutura de cima
		o conteúdo dele são iguais*/
		res = (nome1.equals(nome3))?"igual":"diferente"; /* o nome como ele é um objeto ele
		 pode ter métodos, o .equals é um método que verifica se o conteúdo de 
		 um objeto é igual ao conteúdo do outro, ISSO SERVE PARA QUALQUER UMA DAS CLASSES INVOLUCROS */
		System.out.println(res);
	}
}
