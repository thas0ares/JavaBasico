 package exerciciorepita01;

import javax.swing.JOptionPane;

public class ExercicioRepita01 {
	public static void main(String[] args) {
		int s = 0;
		int p = 0;
		int i = 0;
		int a = 0;
		double m = 0;
		int cont = 0;
		int n;
		
		
		
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null,
					"<html>Informa um n?mero: <br> <em>(valor 0 interrompe)</em></html/>"));
			if (n > 0) {
				s = s + n;//s += n; 
				cont++;//cont+1
			}
			if (n % 2 == 0) {
				p = p + 1; //p += 1; 
			 } 
			if (n % 2 == 1) {
				i = i + 1;//i += 1;
			}
			if (n > 100) {
				a = a + 1;//a += 1;
			}
			if (n >= 0 ) {
				m = s / cont;
			}
		} while (n != 0);
		JOptionPane.showMessageDialog(null, "<html>Resultado: <hr>" + 
		"<br>Total de Valores: " + s + "<br>Total de pares: " + p + 
		"<br>Total de ?mpares: " + i + "<br> Acima de 100:  " + a +
		"<br>M?dia dos valores" + m + "<br> N?meros digitados: " + cont + "</html>");
	}
}