package operadorternario;

public class OperadorTernario {

	public static void main(String[] args) {
		int n1, n2, r;
		n1 = 21;
		n2 = 18;
		/*r = (n1>n2)?0:1;
		System.out.println(r); => n1 � maior que n2? sim ent�o � 0*/
		r = (n1>n2)?n1:n2; //=> n1 � maior que  n2? n�o ent�o ele imprimi 18
		r = (n1>n2)?n1+n2:n1-n2;// ele tbm aceita equa��es, ou seja n1 � maior que n2? sim ent�o ele imprimi ap�s o ponto 14-18=-4
		System.out.println(r); 
	}
}
