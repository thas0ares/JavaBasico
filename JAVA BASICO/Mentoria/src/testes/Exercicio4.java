package testes;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int n = scanner.nextInt();
		System.out.print("O número " + n);
		if (n % 2 == 0 && n % 3 == 0) {
			System.out.println(" é par e divisível por 3.");
		} else if (n % 2 == 0) {
			System.out.println(" é par porém não é divisível por 3.");
		} else if (n % 3 == 0){
			System.out.println(" não é par porém é divido por 3.");
		} else {
			System.out.println(" não é par e também não é divido por 3.");
		}
	}
}
