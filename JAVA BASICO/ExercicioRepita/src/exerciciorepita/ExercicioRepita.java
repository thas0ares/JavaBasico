package exerciciorepita;

import javax.swing.JOptionPane; //s�o paineis prontos/telas prontas

public class ExercicioRepita {

	public static void main(String[] args) {
		// JOptionPane.showMessageDialog(null -> nome da janela, "Ol� Mundo!", "Boas
		// Vindas", JOptionPane.ERROR_MESSAGE); exemplo
		int n, s = 0;
		do {
			n = Integer.parseInt(JOptionPane.showInputDialog(null,
					"<html>Informa um n�mero: <br> <em>(valor 0 interrompe)</em></html/>"));
			s += n;
		} while (n != 0); // n diferente de 0
		JOptionPane.showMessageDialog(null,
				"<html>Resultado:  <hr>" + "<br>Total de Valores: " + s + "</html>");
	}

}