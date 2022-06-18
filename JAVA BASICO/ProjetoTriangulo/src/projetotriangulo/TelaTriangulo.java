package projetotriangulo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class TelaTriangulo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaTriangulo frame = new TelaTriangulo();
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
	public TelaTriangulo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 296, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Segmento a");

		JLabel lblNewLabel_1 = new JLabel("Segmento b");

		JLabel lblNewLabel_2 = new JLabel("Segmento c");

		JLabel lblA = new JLabel("0");
		lblA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblA.setForeground(Color.GRAY);

		JLabel lblB = new JLabel("0");
		lblB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblB.setForeground(Color.GRAY);

		JLabel lblC = new JLabel("0");
		lblC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblC.setForeground(Color.GRAY);

		JSlider sliA = new JSlider();
		sliA.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblA.setText(Integer.toString(sliA.getValue()));
			}
		});
		sliA.setValue(0);
		sliA.setMaximum(20);

		JSlider sliB = new JSlider();
		sliB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblB.setText(Integer.toString(sliB.getValue()));
			}
		});
		sliB.setValue(0);
		sliB.setMaximum(20);

		JSlider sliC = new JSlider();
		sliC.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblC.setText(Integer.toString(sliC.getValue()));
			}
		});
		sliC.setValue(0);
		sliC.setMaximum(20);

		JPanel panResposta = new JPanel();
		panResposta.setVisible(false);

		JLabel lblStatus = new JLabel("Forma ou n\u00E3o?");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel lblTipo = new JLabel("Tipo de tri\u00E2ngulo");
		lblTipo.setHorizontalAlignment(SwingConstants.CENTER);

		JButton btnVerificar = new JButton("Verificar");
		btnVerificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = sliA.getValue();
				int b = sliB.getValue();
				int c = sliC.getValue();
				if (a < b + c && b < a + c && c < a + b) {
					lblStatus.setText("Formam um Triângulo");
					if (a == b && b == c) {
						lblTipo.setText("Equilátero");
					} else if (a != b && b != c && a != c) {
						lblTipo.setText("Escaleno");
					} else {
						lblTipo.setText("Isósceles");
					}
				} else {
					lblStatus.setText("Não formam um Triângulo");
					lblTipo.setText("------");
				}
				panResposta.setVisible(true);
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panResposta, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup().addGroup(gl_contentPane
								.createParallelGroup(Alignment.TRAILING)
								.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_1).addComponent(lblNewLabel_2))
										.addPreferredGap(ComponentPlacement.UNRELATED)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(btnVerificar)
												.addComponent(sliB, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
												.addComponent(sliC, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
								.addGroup(Alignment.LEADING,
										gl_contentPane.createSequentialGroup().addComponent(lblNewLabel)
												.addPreferredGap(ComponentPlacement.UNRELATED)
												.addComponent(sliA, GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup().addGap(18).addComponent(lblA))
										.addGroup(Alignment.TRAILING,
												gl_contentPane.createSequentialGroup()
														.addPreferredGap(ComponentPlacement.UNRELATED)
														.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addComponent(lblC).addComponent(lblB))))))
				.addGap(185)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel)
								.addComponent(lblA).addComponent(sliA, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblNewLabel_1)
								.addComponent(lblB).addComponent(sliB, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(14)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(lblC)
								.addComponent(lblNewLabel_2).addComponent(sliC, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGap(18).addComponent(btnVerificar).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(panResposta, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));
		GroupLayout gl_panResposta = new GroupLayout(panResposta);
		gl_panResposta.setHorizontalGroup(gl_panResposta.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panResposta.createSequentialGroup().addContainerGap()
						.addGroup(gl_panResposta.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblTipo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 209,
										Short.MAX_VALUE)
								.addComponent(lblStatus, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 209,
										Short.MAX_VALUE))
						.addContainerGap()));
		gl_panResposta.setVerticalGroup(gl_panResposta.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panResposta.createSequentialGroup().addContainerGap().addComponent(lblStatus).addGap(18)
						.addComponent(lblTipo).addContainerGap(15, Short.MAX_VALUE)));
		panResposta.setLayout(gl_panResposta);
		contentPane.setLayout(gl_contentPane);
	}
}
