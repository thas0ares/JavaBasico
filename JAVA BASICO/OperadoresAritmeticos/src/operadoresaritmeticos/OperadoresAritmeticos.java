package operadoresaritmeticos;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		OP. ARITMETICOS
		int n1 = 3;
		int n2 = 5;
		float n = (n1 + n2)/2; // � igual na matem�tico se tirar o parentese
		System.out.println("A m�dia � igual a " + n);
		************************************************
		OP.UNIT�RIOS - P�S INCREMENTO
		int numero = 5;
		numero++; // 5 + 1
		System.out.println(numero); => 6
		*******************************************
		OP.UNIT�RIOS - P�S INCREMENTO
		int numero = 5;
		int valor = 5 + numero++; // 5 + 5 e dps ele soma 1 => 10; ou seja fa�a
		todas as opera��es e dps somais um n�mero
		System.out.println(valor); => 10
		System.out.println(numero); => 6
		*****************************************
		OP.UNIT�RIOS - PR� INCREMENTO
		int numero = 5;
		int valor = 5 + ++numero; // 5 + 5 - 1 => 11
		System.out.println(valor);
		***************************************
		OP. ATRIBUI�AO
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