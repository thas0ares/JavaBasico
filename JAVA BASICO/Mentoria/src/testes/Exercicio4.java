package testes;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int n = scanner.nextInt();
		System.out.print("O n�mero " + n);
		if (n % 2 == 0 && n % 3 == 0) {
			System.out.println(" � par e divis�vel por 3.");
		} else if (n % 2 == 0) {
			System.out.println(" � par por�m n�o � divis�vel por 3.");
		} else if (n % 3 == 0){
			System.out.println(" n�o � par por�m � divido por 3.");
		} else {
			System.out.println(" n�o � par e tamb�m n�o � divido por 3.");
		}
	}
}
