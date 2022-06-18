package repeticao01;

import java.util.Scanner;

public class Repeticao01 {
	public static void main(String[] args) {
//		int cc = 0;
//		do {
//			System.out.println("Cambalhota");
//			cc++;
//		} while (cc < 4);
		
		int n, s = 0; //
		String resp;
		Scanner teclado = new Scanner (System.in);
		do {
			System.out.print("Digite um número: ");
			n =  teclado.nextInt(); // ler numero
			s += n; // s=s+n
			System.out.print("Quer continuar: [S/N] ");
			resp = teclado.next();
			} while (resp.equals("S")); // Eu vou fazer tudo isso enquanto minha respota for S
		System.out.println("A soma de todos os valores é " + s);
	}
}
