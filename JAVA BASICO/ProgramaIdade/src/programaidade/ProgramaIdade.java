package programaidade;

import java.util.Scanner;

public class ProgramaIdade {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		System.out.println("Em que ano você nasceu? ");
		int nasc = t.nextInt();
		int i = 2021-nasc;
		System.out.print("Sua idade é " + i + " anos. Então você é ");
		if (i>=18) {
			System.out.print("maior de idade.");
		} else {
			System.out.print("menor de idade.");
		}
	}
}
