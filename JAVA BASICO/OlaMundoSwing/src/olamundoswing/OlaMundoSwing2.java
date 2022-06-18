package olamundoswing;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class OlaMundoSwing2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OlaMundoSwing2 window = new OlaMundoSwing2();
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
	public OlaMundoSwing2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMensagem = new JLabel("Aqui vai aparecer a mensagem");
		lblMensagem.setForeground(Color.RED);
		lblMensagem.setFont(new Font("Arial Black", Font.PLAIN, 19));
		lblMensagem.setBounds(47, 61, 340, 47);
		frame.getContentPane().add(lblMensagem);
		
		JButton btnClique = new JButton("Clique em mim!");
		btnClique.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblMensagem.setText("Olá, Mundo!");
			}
		});
		btnClique.setBackground(UIManager.getColor("Button.background"));
		btnClique.setFont(new Font("Arial", Font.BOLD, 15));
		btnClique.setBounds(141, 135, 156, 23);
		frame.getContentPane().add(btnClique);
	}

}
