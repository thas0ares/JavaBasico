package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.SpinnerNumberModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TelaFatorial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaFatorial frame = new TelaFatorial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaFatorial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 407, 162);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("!=");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JLabel lblFat = new JLabel("1");
		lblFat.setForeground(Color.RED);
		lblFat.setFont(new Font("Tahoma", Font.PLAIN, 30));

		JSpinner txtN = new JSpinner();
		txtN.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				int n = Integer.parseInt(txtN.getValue().toString()); // converte esse número p/ String e dps a inteiro
				int f = 1;
				int c = n;
				String s = "";

				while (c >= 1) {
					f *= c; // f = f*c
					if (c == 1) {
						s += c; // s = s+c
					} else if (c > 1) {
						s += c + "x";
					}
					c--;
				}

				/*
				 * while (c >= 1) { // enquanto o contador for >= 1 f *= c; // na interação eu
				 * vou fazer o fatorial recebe ele mesmo * o c c--; // eu vou tirando 1 a cada
				 * interação }
				 */

				lblFat.setText(s + "=" + Integer.toString(f));

				// 5! = 5 x 4 x 3 x 2 x 1
			}
		});

		txtN.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtN.setModel(new SpinnerNumberModel(0, 0, 12, 1));

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(lblNewLabel)
					.addGap(29)
					.addComponent(lblFat, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(54))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(32)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtN, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(lblFat))
					.addContainerGap(37, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
