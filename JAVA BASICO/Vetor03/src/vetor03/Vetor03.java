package vetor03;

import java.util.Arrays;

public class Vetor03 {
	public static void main(String[] args) {
		double v[] = { 3.5, 2.75, 9, -4.5 };
		Arrays.sort(v); // coloca o vetor em ordem
		for (double valor : v) {
			System.out.print(valor + " ");
			// não precisa trabalhar com vetor ele joga isso dentro da variavel double
		}
	}

}
