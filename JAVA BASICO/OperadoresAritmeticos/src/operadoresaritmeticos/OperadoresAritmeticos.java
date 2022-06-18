package operadoresaritmeticos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		OP. ARITMETICOS
		int n1 = 3;
		int n2 = 5;
		float n = (n1 + n2)/2; // é igual na matemático se tirar o parentese
		System.out.println("A média é igual a " + n);
		************************************************
		OP.UNITÁRIOS - PÓS INCREMENTO
		int numero = 5;
		numero++; // 5 + 1
		System.out.println(numero); => 6
		*******************************************
		OP.UNITÁRIOS - PÓS INCREMENTO
		int numero = 5;
		int valor = 5 + numero++; // 5 + 5 e dps ele soma 1 => 10; ou seja faça
		todas as operações e dps somais um número
		System.out.println(valor); => 10
		System.out.println(numero); => 6
		*****************************************
		OP.UNITÁRIOS - PRÉ INCREMENTO
		int numero = 5;
		int valor = 5 + ++numero; // 5 + 5 - 1 => 11
		System.out.println(valor);
		***************************************
		OP. ATRIBUIÇAO
		int x = 4;
		x += 2; // x = x + 2
		System.out.println(x); =>6
		******************************************
		ARREDONDAMENTOS
		float v =8.9f;
		int ar = (int) Math.round(v); //floor/baixo  ceil/cima
		System.out.println(ar);
		*********************************************
		GERADOR DE NUMEROS - RANDOMIZADOS*/
		double ale = Math.random(); // entre 0.0 e 1.0
		int n = (int) (2 + ale *(9-2)); // acrescentrando isso entre 2-9
		System.out.println(n);
	}
}