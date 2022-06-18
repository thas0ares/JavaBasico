package testes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestaException {
	public static void main(String[] args) {

		int par = 0;
		int impar = 0;
		int numero;

		Scanner scanner = new Scanner(System.in);

		try { // caminho feliz: ele est� esperando que o usu�rio coloque a entrada certa

			System.out.println("Digite um n�mero: ");
			numero = scanner.nextInt();

			if (numero % 2 == 0) {
				par = par + 1;
			}

			if (numero % 2 == 1) {
				impar = impar + 1;
			}

			System.out.println("O total dos valores pares digitados: " + par);
			System.out.println("O total dos valores �mpares digitados: " + impar);

		} catch (InputMismatchException e) { // se n�o ele vai mostrar um erro que o usu�rio est� cometendo
			System.out.println("Entrada inv�lida!");
		}
	}
}
