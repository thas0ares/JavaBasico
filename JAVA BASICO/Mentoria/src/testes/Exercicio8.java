package testes;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma letra:");
		String letra = scanner.next().toUpperCase(); // converte minúscula em maiúscula, sendo que o toLowerCase() faz o contrário.
		String vogal;
		switch (letra) {
		case "A":
			vogal = "É UMA VOGAL!";
			break;
		case "E":
			vogal = "É UMA VOGAL!";
			break;
		case "I":
			vogal = "É UMA VOGAL!";
			break;
		case "O":
			vogal = "É UMA VOGAL!";
			break;
		case "U":
			vogal = "É UMA VOGAL!";
			break;
		default:
			vogal = "NÃO É UMA VOGAL!";
		}
		System.out.println(vogal);
	}
}
