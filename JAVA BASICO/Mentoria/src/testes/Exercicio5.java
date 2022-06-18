 package testes;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int idade;
		System.out.println("Digite sua idade:");
		idade = scanner.nextInt();

		if (idade >= 18 && idade <= 65) {
			System.out.println("Sua idade está entre 18 e 65 anos");
		} else {
			System.out.println("Sua idade não está entre 18 e 65 anos");
		}
	}
}
