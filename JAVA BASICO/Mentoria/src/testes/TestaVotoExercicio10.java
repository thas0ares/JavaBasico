package testes;

import java.util.Scanner;

public class TestaVotoExercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //coleta informa��es imputada pelo usu�rio
		int idade;
		System.out.println("Insira sua idade:");
		idade = scanner.nextInt();

		System.out.print("Voc� tem " + idade + " anos. Logo, "); // refatora��o de c�digo e reaproveitamento de c�digo

		if ((idade >= 16 && idade < 18) || idade >= 70) {
			System.out.println("seu voto � facultativo.");
		} else if (idade >= 18 && idade < 70) {
			System.out.println("seu voto � obrigat�rio.");
		} else {
			System.out.println("n�o pode votar.");
		}
	}
}
