package contador01;

public class Contador {
	public static void main(String[] args) {
		int cc = 0;
		/*
		 * while (cc<4 ) {//Enquanto esse contador de cambalhotas for <4 d� cambalhotas
		 * System.out.println("Cambalhota " + (cc+1));// +cc mostra o n�mero da cambalhota , e (CC+1) faz a contagem iniciar em 1  
		 * cc++;//v�ri�vel cc=cc+1 
		 * }
		 */
		while (cc < 10) {
			cc++;
			if (cc == 2 || cc == 3) { // toda vez que cc for 5 ou 7 ele n�o mostra na tela ele volta d� continuidade
				continue;
			}
			if (cc == 7) {
				break; // mesmo n�o tendo terminado o la�o ele vai executar o break e vai pro final do
						// programa
			}
			System.out.println("Cambalhota " + cc);
		}
	}
}
