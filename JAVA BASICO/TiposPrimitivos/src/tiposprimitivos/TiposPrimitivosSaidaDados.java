package tiposprimitivos;

public class TiposPrimitivosSaidaDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota = 8.5f;
		String nome = "Gustavo";
		System.out.println("Sua nota � " + nota);
		//impreme a nota 8.5 e da um salto de linha "ln"
		System.out.printf("Sua nota � %.2f \n" , nota); 
		//impress�o formatada com duas casas decimais a "nota" se encaixa no lugar do %.2f e vira 8.50
		//quebra de linha \n
		System.out.printf("Sua nota de %s � %.4f \n" ,nome, nota); 
		// %.4f = 8,5000 ... e a 
		// %s imprime a string nome
		System.out.format("Sua nota � %.2f " , nota);
		//imprime a mesma coisa/sintaxe � a mesma, apenas outro m�todo 
	}
}
