package testes;

import java.util.Scanner;

public class Desafio2 {
	/*
	 * 1 - Escreva um programa que leia a quantidade de n?meros fornecida pelo
	 * usu?rio e, ao final, exiba a soma dos pares e dos ?mpares
	 */
	public static void main(String[] args) {

		int par = 0;
		int impar = 0;
		int numero;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n?mero ou digite 0 para interromper: ");
		numero = scanner.nextInt();

		while (numero != 0) {

			if (numero % 2 == 0) {
				par = par + 1;
			}

			if (numero % 2 == 1) {
				impar = impar + 1;
			}
			System.out.println("Digite um n?mero ou digite 0 para interromper: ");
			numero = scanner.nextInt();
		}

		System.out.println("O total dos valores pares digitados: " + par);
		System.out.println("O total dos valores ?mpares digitados: " + impar);
	}

}
