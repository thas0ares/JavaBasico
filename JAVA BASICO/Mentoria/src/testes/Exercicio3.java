package testes;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int n = scanner.nextInt();
		System.out.print("O número " + n );
		if (n % 7 == 0) {
			System.out.println(" é múltiplo de 7.");
		} else {
			System.out.println(" não é múltiplo de 7.");
		}
	}
}