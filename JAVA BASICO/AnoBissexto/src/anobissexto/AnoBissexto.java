package anobissexto;

import java.util.Scanner;

/*Bissexto - Um ano � bissexto se ele for divis�vel por 400 ou se ele
 * for divis�vel por 4 e n�o por 100.
 */

public class AnoBissexto {
	public static void main(String[] args) {

		int ano;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano para saber se ele � bissexto: ");
		ano = scanner.nextInt();

		if (ano % 400 == 0) {
			System.out.println(ano + " � bissexto.");
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " � bissexto.");
		} else {
			System.out.println(ano + " n�o � bissexto");
		}

	}
}
