package equacaodesegundograu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaEquacao {

	private JFrame frame;
	JPanel panResultado = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEquacao window = new TelaEquacao();
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
	public TelaEquacao() {
		initialize();
		panResultado.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.RED);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 307, 286);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblNewLabel = new JLabel("<html>x\u00B2+</html>");
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_1 = new JLabel("x+");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_2 = new JLabel("=0");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JLabel lblNewLabel_3 = new JLabel("<html>&Delta;=</html>");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblA = new JLabel("A");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblA.setForeground(Color.RED);

		JLabel lblB = new JLabel("B");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblB.setForeground(Color.RED);

		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblC.setForeground(Color.RED);

		JLabel lblNewLabel_7 = new JLabel("-4");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblNewLabel_8 = new JLabel(".");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblNewLabel_4 = new JLabel("\u00B2");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JLabel lblNewLabel_5 = new JLabel(".");

		JLabel lblDelta = new JLabel("0");

		JLabel lblRaiz = new JLabel("0");

		JSpinner txtB = new JSpinner();
		txtB.addChangeListener(new ChangeListener() { // adicionando um item jspinner a outro elemento como lbl
			public void stateChanged(ChangeEvent e) {
				lblB.setText(txtB.getValue().toString());
			}
		});

		JSpinner txtA = new JSpinner();
		txtA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(txtA.getValue().toString());
			}
		});

		JSpinner txtC = new JSpinner();
		txtC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(txtC.getValue().toString());
			}
		});
		txtC.setFont(new Font("Tahoma", Font.PLAIN, 14));

		txtA.setFont(new Font("Tahoma", Font.PLAIN, 14));

		txtB.setFont(new Font("Tahoma", Font.PLAIN, 14));

		JButton btnCalc = new JButton("<html>Calcular&Delta;</html>");
		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtA.getValue().toString());
				int b = Integer.parseInt(txtB.getValue().toString());
				int c = Integer.parseInt(txtC.getValue().toString());

				double d = Math.pow(b, 2) - 4 * a * c; // valor de delta
				lblDelta.setText(String.format("%.1f", d));

				if (d < 0) { // se o Delta for menor do que zero significa que não existe raizes reais para
								// serem colocadas
					lblRaiz.setText("Não existem raízes reais.");
				} else {
					lblRaiz.setText("Existem raízes reais.");
				}

				panResultado.setVisible(true);
			}
		});

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblB)
									.addGap(9)
									.addComponent(lblNewLabel_4)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_5)
									.addGap(18)
									.addComponent(lblA)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNewLabel_8))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(txtA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel_1)
									.addGap(14)))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblC)
								.addComponent(txtC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(6)
							.addComponent(lblNewLabel_2))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(23)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panResultado, GroupLayout.PREFERRED_SIZE, 246, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnCalc))))
					.addContainerGap(62, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(55)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtA, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel)
						.addComponent(txtC, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblC)
						.addComponent(lblNewLabel_8, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblA)
						.addComponent(lblNewLabel_5)
						.addComponent(lblNewLabel_7)
						.addComponent(lblNewLabel_4)
						.addComponent(lblB)
						.addComponent(lblNewLabel_3))
					.addGap(18)
					.addComponent(btnCalc)
					.addGap(18)
					.addComponent(panResultado, GroupLayout.PREFERRED_SIZE, 56, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(50, Short.MAX_VALUE))
		);

		JLabel lblNewLabel_9 = new JLabel("<html>Valor de &Delta;</html>");

		JLabel lblNewLabel_6 = new JLabel("Tipo de Ra\u00EDzes");

		GroupLayout gl_panResultado = new GroupLayout(panResultado);
		gl_panResultado
				.setHorizontalGroup(
						gl_panResultado.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panResultado.createSequentialGroup().addContainerGap()
										.addGroup(gl_panResultado.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_9, GroupLayout.PREFERRED_SIZE, 57,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(lblNewLabel_6))
										.addGap(18)
										.addGroup(gl_panResultado.createParallelGroup(Alignment.LEADING)
												.addComponent(lblRaiz, Alignment.TRAILING).addComponent(lblDelta))
										.addContainerGap()));
		gl_panResultado
				.setVerticalGroup(
						gl_panResultado.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panResultado.createSequentialGroup().addGap(5)
										.addGroup(gl_panResultado.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_9).addComponent(lblDelta))
										.addPreferredGap(ComponentPlacement.RELATED)
										.addGroup(gl_panResultado.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblRaiz).addComponent(lblNewLabel_6))
										.addContainerGap(40, Short.MAX_VALUE)));
		panResultado.setLayout(gl_panResultado);
		frame.getContentPane().setLayout(groupLayout);
	}
}
