package vetor04;

import java.util.Arrays;

public class Vetor04 {
	public static void main(String[] args) {
		int vet[] = { 3, 7, 6};
		for (int v : vet) {
			System.out.print(v + " ");
		}
		System.out.println("");
		int p = Arrays.binarySearch(vet, 1);
		// n�o existe �ndice negativo no java, se ele n�o encontrar a posi��o o valor da
		// chave vai pra negativo
		System.out.println("Encontrei o valor na posi��o " + p);
	}
}
