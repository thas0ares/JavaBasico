package tiposprimitivos;

import java.util.Scanner;

public class TiposPrimitivosEntradaDados {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		//System.in � a entrada dos dados
		System.out.print("Digite o nome do aluno: ");		
		String nome = teclado.nextLine();
		//m�todo que l� String "nextLine()
		System.out.print("Digite a nota do aluno ");
		float nota = teclado.nextFloat();
		//m�todo que l� n�meros reais "nextFloat
		System.out.format("A nota de %s � %.1f \n", nome, nota);	
	}
}
