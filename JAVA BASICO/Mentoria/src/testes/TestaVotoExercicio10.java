package testes;

import java.util.Scanner;

public class TestaVotoExercicio10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); //coleta informações imputada pelo usuário
		int idade;
		System.out.println("Insira sua idade:");
		idade = scanner.nextInt();

		System.out.print("Você tem " + idade + " anos. Logo, "); // refatoração de código e reaproveitamento de código

		if ((idade >= 16 && idade < 18) || idade >= 70) {
			System.out.println("seu voto é facultativo.");
		} else if (idade >= 18 && idade < 70) {
			System.out.println("seu voto é obrigatório.");
		} else {
			System.out.println("não pode votar.");
		}
	}
}
