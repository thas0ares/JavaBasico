package testes;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um n�mero inteiro: ");
		int n = scanner.nextInt();
		System.out.print("O n�mero " + n );
		if (n % 7 == 0) {
			System.out.println(" � m�ltiplo de 7.");
		} else {
			System.out.println(" n�o � m�ltiplo de 7.");
		}
	}
}