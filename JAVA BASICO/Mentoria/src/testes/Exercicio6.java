package testes;

import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sexo;
		System.out.println("Qual a sigla do seu sexo M ou F?");
		sexo = scanner.next();

		if (sexo.equals("M") || sexo.equals("m")) { // serve para comparar string
			System.out.println("Masculino");
		} else if (sexo.equals("F") || sexo.equals("f")) {
			System.out.println("Feminino");
		} else {
			System.out.println("Entrada inválida"); // se quer assumir apenas entradas validas faz-se necessário
													// realizar o tratamento de entrada inválida
		}
		} 
	}