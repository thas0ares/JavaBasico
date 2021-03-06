package testes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio3 {
	/*
	 * 2 - Escreva um programa que leia a 5 n?meros e exiba ao final qual deles foi
	 * o maior digitado e qual deles foi o menor digitado
	 */
	public static void main(String[] args) {

		int n;
		int maior = 0;
		int menor = 0;

		Scanner scanner = new Scanner(System.in);

		try {

			System.out.println("Digite 5 n?meros: ");

			// Loop de 10 vezes
			for (int i = 0; i < 5; i = i + 1) {
				n = scanner.nextInt();

				if (i == 0) {
					maior = n;
					menor = n;
				}

				if (n > maior) {
					maior = n;
				}
				if (n < menor) {
					menor = n;
				}
			}

			System.out.println("O maior n?mero digitado: " + maior);
			System.out.println("O menor n?mero digitado: " + menor);

		} catch (InputMismatchException e) {
			System.out.println("Entrada inv?lida!");
		}
	}
}
