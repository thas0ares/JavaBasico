package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivosEntradaDados {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//System.in é a entrada dos dados
		System.out.print("Digite o nome do aluno: ");		
		String nome = teclado.nextLine();
		//método que lê String "nextLine()
		System.out.print("Digite a nota do aluno ");
		float nota = teclado.nextFloat();
		//método que lê números reais "nextFloat
		System.out.format("A nota de %s é %.1f \n", nome, nota);	
	}
}
