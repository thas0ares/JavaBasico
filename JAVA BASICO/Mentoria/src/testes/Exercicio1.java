package testes;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float temp;
		System.out.println("Qual a sua temperatura?");
		temp = scanner.nextFloat();

		if (temp > 36.5) {
			System.out.println("Está com febre!");
		} else {
			System.out.println("Sem febre!");
		}
	}
}