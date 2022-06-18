package leitordepensamentos;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaGenio {

	private JFrame frame;
	JLabel lblFrase = new JLabel("Frase");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaGenio window = new TelaGenio();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaGenio() {
		initialize();
		lblFrase.setText("<html>Vou pensar em uma valor entre 1 e 5. Tente adivinhar</html>");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 276, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JLabel lblFrase = new JLabel("Frase");
		
		JLabel lblNewLabel_2 = new JLabel("Valor");
		
		JSpinner txtVal = new JSpinner();
		txtVal.setModel(new SpinnerNumberModel(1, 1, 5, 1));
		
		JButton btnPalpite = new JButton("Palpite");
		btnPalpite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double n = 1 + Math.random() * (5 - 1); // sortear um número
				int valor = (int) n;
				
				int num = Integer.parseInt(txtVal.getValue().toString()); //pegar o número que o usuário digitou
				
				String f1 = "ACERTOU!"; // configurar as frases
				String f2 = "<html>ERROU! Eu pensei no valor " + valor + "</html>";
				
				String res = (valor == num)?f1:f2; // atribuindo as variáves a res
				
				lblFrase.setFont(new Font("Arial Black", Font.PLAIN, 16));
				
				lblFrase.setText(res);//mostrando o res
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(36)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblFrase)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblNewLabel_2)
							.addGap(18)
							.addComponent(txtVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(8)
							.addComponent(btnPalpite, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(45)
					.addComponent(lblFrase)
					.addGap(34)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtVal, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addGap(39)
					.addComponent(btnPalpite)
					.addContainerGap(72, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}
}
