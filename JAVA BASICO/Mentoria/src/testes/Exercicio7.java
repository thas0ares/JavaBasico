package testes;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira o valor da primeira Blusa: ");
		double b1 = scanner.nextDouble();
		System.out.println("Insira o valor da segunda Blusa: ");
		double b2 = scanner.nextDouble();

		if (b1 > b2) {
			System.out.println("A primeira Blusa é a de maior valor.");
		} else {
			System.out.println("A segunda Blusa é a de maior valor.");
		}
	}
}
