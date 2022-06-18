package programapernas;

import java.util.Scanner;

public class ProgramaPernas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Quantas pernas?");
		int perna = tec.nextInt();
		String tipo;
		System.out.print("Isso é um(a) ");
		switch (perna) { // não funciona com intervalos (ex entre 1 e 5) e somente pra números inteiros
		case 1:
			tipo = "Saci";
			break;
		case 2:
			tipo = "Bípede";
			break;
		case 3:
			tipo = "Tripé";
			break;
		case 4:
			tipo = "Quadrúpede";
			break;
		case 6:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
			break; // não é necessário, mas não tem problema colocar
		}
		System.out.println(tipo);
	}
}
