package vetor05;

import java.util.Arrays;

public class Vetor05 {
	public static void main(String[] args) {
		int v[] = new int[20];
		Arrays.fill(v, 0);// preenchendo o vetor
		for (int valor : v) {
			System.out.print(valor + " ");
		}
	}
}
