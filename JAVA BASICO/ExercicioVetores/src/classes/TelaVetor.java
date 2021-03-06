package classes;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.ListModel;

public class TelaVetor extends JFrame {

	int vetor[] = new int[5];
	DefaultListModel lista = new DefaultListModel();
	int selecionado = 0;

	private JPanel contentPane;
	private JList lstVetor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVetor frame = new TelaVetor();
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
	public TelaVetor() {

		for (int c = 0; c < vetor.length; c++) {
			lista.addElement(vetor[c]);
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 241);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JSpinner txtNum = new JSpinner();

		JButton btnAdd = new JButton("Adicionar");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[selecionado] = Integer.parseInt(txtNum.getValue().toString());
				lista.removeAllElements();
				for (int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});

		JButton btnRemove = new JButton("Remover");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vetor[selecionado] = 0;
				lista.removeAllElements();
				for (int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
			}
		});

		JButton btnOrdem = new JButton("Ordenar");
		btnOrdem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Arrays.sort(vetor);
				lista.removeAllElements();
				for (int c = 0; c < vetor.length; c++) {
					lista.addElement(vetor[c]);
				}
				;
			}
		});

		JLabel lblNewLabel = new JLabel("Vetor");

		JLabel lblSelecionado = new JLabel("[0]");

		lstVetor = new JList();
		lstVetor.setModel(lista);

		lstVetor.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				selecionado = lstVetor.getSelectedIndex();
				lblSelecionado.setText("[" + selecionado + "]");
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addGap(22)
				.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addGap(27)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btnOrdem)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(btnAdd)
										.addComponent(btnRemove))
								.addGap(49)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(lstVetor, GroupLayout.PREFERRED_SIZE, 90,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_contentPane.createSequentialGroup().addComponent(lblNewLabel)
												.addGap(18).addComponent(lblSelecionado)))))
				.addContainerGap(205, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(30)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(btnAdd).addComponent(lblNewLabel).addComponent(lblSelecionado))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnRemove)
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnOrdem))
								.addComponent(lstVetor, GroupLayout.PREFERRED_SIZE, 107, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(41, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
