
package testes;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insira a dist�ncia percorrida (Km): ");
		float d = scanner.nextFloat();
		System.out.println("Insira o tempo de viagem (horas): ");
		float t = scanner.nextFloat();
		float vm = d / t;
		System.out.print("Sua velocidade m�dia foi " + vm + "Km/h. Logo, ");
		if (vm > 110) {
			System.out.println("voc� ultrapassou o limite de 110 km/h.");
		} else {
			System.out.println("voc� n�o ultrapassou o limite de 110km/h.");
		}
	}
}
