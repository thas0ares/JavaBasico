package testes;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite uma letra:");
		String letra = scanner.next().toUpperCase(); // converte min�scula em mai�scula, sendo que o toLowerCase() faz o contr�rio.
		String vogal;
		switch (letra) {
		case "A":
			vogal = "� UMA VOGAL!";
			break;
		case "E":
			vogal = "� UMA VOGAL!";
			break;
		case "I":
			vogal = "� UMA VOGAL!";
			break;
		case "O":
			vogal = "� UMA VOGAL!";
			break;
		case "U":
			vogal = "� UMA VOGAL!";
			break;
		default:
			vogal = "N�O � UMA VOGAL!";
		}
		System.out.println(vogal);
	}
}
