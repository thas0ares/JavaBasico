package anobissexto;

import java.util.Scanner;

/*Bissexto - Um ano é bissexto se ele for divisível por 400 ou se ele
 * for divisível por 4 e não por 100.
 */

public class AnoBissexto {
	public static void main(String[] args) {

		int ano;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano para saber se ele é bissexto: ");
		ano = scanner.nextInt();

		if (ano % 400 == 0) {
			System.out.println(ano + " é bissexto.");
		} else if ((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println(ano + " é bissexto.");
		} else {
			System.out.println(ano + " não é bissexto");
		}

	}
}
