package programamedia;

import java.util.Scanner;

public class ProgramaMedia {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);/*inserimos a Class
		scanner que monitora o system.in que � a entrada do sistema*/
		System.out.print("Primeira nota: ");
		float n1 = teclado.nextFloat();
		System.out.print("Segunda nota: ");
		float n2 = teclado.nextFloat();
		float m = (n1 + n2) / 2;
		System.out.println("Sua m�dia foi " + m);
		if (m > 9) {
			System.out.println("Parab�ns");
		}
	}
}
