package testes;

//import java.util.Scanner;

import classes.Edificio;

public class TestaEdificio {

	public static void main(String[] args) {
		
		Edificio edificio = new Edificio();
		edificio.setAndares(14);// aqui eu n�o preciso da classe Scanner
		edificio.setNome("Sync");
		System.out.println(
				"Este Edif�cio tem " + edificio.getAndares() + " andares." + " E seu nome � " + edificio.getNome());
	}
}

//public static void main(String[] args) {
//	
//	int qtdAndares;
//	String nomeEdificio;
//	Edificio edificio = new Edificio();
//	
//	Scanner scanner = new Scanner(System.in);
//	System.out.println("Digite a quantidade de andares: ");
//	qtdAndares = scanner.nextInt();
//	
//	System.out.println("Digite o nome do ed�ficio: ");
//	nomeEdificio =  scanner.next();
//
//	edificio.setAndares(qtdAndares);// aqui eu n�o preciso da classe Scanner
//	edificio.setNome(nomeEdificio);
//	System.out.println(
//			"Este Edif�cio tem " + edificio.getAndares() + " andares." + " E seu nome � " + edificio.getNome());
//	edificio.mostrarMoradores();
//}
