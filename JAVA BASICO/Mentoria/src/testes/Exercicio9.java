package testes;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite x:");
		int n = scanner.nextInt();
		System.out.println("Digite y:");
		int d = scanner.nextInt();		
		
		if (n % d == 0) {
			System.out.println("O número x informado é divisível pelo número y!");
		} else {
			System.out.println("O número x informado não é divisível pelo número y!");
		}
	}
}
