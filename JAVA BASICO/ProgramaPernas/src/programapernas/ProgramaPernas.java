package programapernas;

import java.util.Scanner;

public class ProgramaPernas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		System.out.println("Quantas pernas?");
		int perna = tec.nextInt();
		String tipo;
		System.out.print("Isso � um(a) ");
		switch (perna) { // n�o funciona com intervalos (ex entre 1 e 5) e somente pra n�meros inteiros
		case 1:
			tipo = "Saci";
			break;
		case 2:
			tipo = "B�pede";
			break;
		case 3:
			tipo = "Trip�";
			break;
		case 4:
			tipo = "Quadr�pede";
			break;
		case 6:
			tipo = "Aranha";
			break;
		default:
			tipo = "ET";
			break; // n�o � necess�rio, mas n�o tem problema colocar
		}
		System.out.println(tipo);
	}
}
