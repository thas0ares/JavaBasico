package operadorternario;

public class OperadorTernario {

	public static void main(String[] args) {
		int n1, n2, r;
		n1 = 21;
		n2 = 18;
		/*r = (n1>n2)?0:1;
		System.out.println(r); => n1 é maior que n2? sim então é 0*/
		r = (n1>n2)?n1:n2; //=> n1 é maior que  n2? não então ele imprimi 18
		r = (n1>n2)?n1+n2:n1-n2;// ele tbm aceita equações, ou seja n1 é maior que n2? sim então ele imprimi após o ponto 14-18=-4
		System.out.println(r); 
	}
}
