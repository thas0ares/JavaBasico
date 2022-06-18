package testes;

import java.util.Scanner;

public class Desafio1 {
	/*
	 * 1- Total dos valores digitados 2- Total dos valores pares digitados 3- Total
	 * dos valores �mpares digitados 4- Valores acima de 100 digitados 5- M�dia dos
	 * valores digitados
	 */
	public static void main(String[] args) {

		int totalDigi = 0;
		int totalPar = 0;
		int totalImpar = 0;
		int acimaCem = 0;
		float media = 0;
		float cont = 0;
		int escolha;
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um n�mero ou digite 0 para interromper: ");
		escolha = scanner.nextInt();

		while (escolha != 0) {
			// System.err.println("Vari�vel total digi antes da soma " + totalDigi);
			totalDigi = totalDigi + escolha; // soma o valor digitado AGORA com o digitado ANTES
			cont++; // conta quantas vezes o usu�rio digitou um n�mero
			// System.out.println();
			// System.err.println("Vari�vel total digi depois da soma " + totalDigi);
			// System.out.println();
			if (escolha % 2 == 0) {
				totalPar = totalPar + 1;
			}
			if (escolha % 2 == 1) {
				totalImpar = totalImpar + 1;
			}
			if (escolha > 100) {
				acimaCem = acimaCem + 1;
			}
			if (escolha >= 0)
				media = totalDigi / cont;

			System.out.println("Digite um n�mero ou digite 0 para interromper: ");
			escolha = scanner.nextInt();
		}
		System.out.println("A soma dos valores digitados: " + totalDigi);
		// System.out.println("A quantidade de n�meros digitados foi " + cont);
		System.out.println("O total dos valores pares digitados: " + totalPar);
		System.out.println("O total dos valores �mpares digitados: " + totalImpar);
		System.out.println("Os valores acima de 100 digitados: " + acimaCem);
		System.out.format("A m�dia dos valores digitados: %.2f ", media);
	}
}
