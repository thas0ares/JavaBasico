package testes;

//import java.util.Scanner;

import classes.Edificio;

public class TestaEdificio {

	public static void main(String[] args) {
		
		Edificio edificio = new Edificio();
		edificio.setAndares(14);// aqui eu não preciso da classe Scanner
		edificio.setNome("Sync");
		System.out.println(
				"Este Edifício tem " + edificio.getAndares() + " andares." + " E seu nome é " + edificio.getNome());
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
//	System.out.println("Digite o nome do edíficio: ");
//	nomeEdificio =  scanner.next();
//
//	edificio.setAndares(qtdAndares);// aqui eu não preciso da classe Scanner
//	edificio.setNome(nomeEdificio);
//	System.out.println(
//			"Este Edifício tem " + edificio.getAndares() + " andares." + " E seu nome é " + edificio.getNome());
//	edificio.mostrarMoradores();
//}
