package operadoreslogicos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		int x, y, z;
		x = 4;
		y = 7;
		z = 12;
		boolean r; //vari�vel logica
		/*r = (x<y && y<z)?true:false; o r vai receber um valor de acordo com 
		uma express�o l�gica, colocamos um operador tern�rio-> Se o x for menor 
		que y E y for menor que z, ent�o ele retorna verdadeiro e se for falso 
		ele retorna falso (V+V=V)
		r = (x<y && y==z)?true:false; nesse caso V+F=F*/
		/*r = (x<y || y==z)?true:false; nesse caso � um OU outro, V+F=V*/
		r = (x<y ^ y==z)?true:false; /*nesse caso � um OU/exclusivo V+F=V, 
		caso fosse y<z seria V+V=F*/
		System.out.println(r);
	}

}
