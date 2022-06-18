package votacaoswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;

public class TelaVoto {

	private JFrame frame;
	private JTextField txtAno;
	JPanel panResultado = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaVoto window = new TelaVoto();
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
	public TelaVoto() {
		initialize();
		panResultado.setVisible(false);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 261, 222);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel lblAno = new JLabel("Ano Nasc:");

		txtAno = new JTextField();
		txtAno.setColumns(10);
		
		JLabel lblR = new JLabel("Resultado");
		
		JLabel lblNewLabel = new JLabel("Pois voc\u00EA tem");

		JLabel lblIdade = new JLabel();
		
		JButton btnVoto = new JButton("Posso Votar?");
		btnVoto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(txtAno.getText());
				int i = 2021 - a;
				lblIdade.setText(Integer.toString(i) + " anos.");
				
				if (i < 16) { //se foi isso
					lblR.setText("Não Vota");
				} else { // senão
					if ((i >= 16 && i < 18) || (i > 70)) { //se for isso
						lblR.setText("Opicional");
					} else { // senão
						lblR.setText("Obrigatório");
					}
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
							.addComponent(lblAno)
							.addGap(18)
							.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(34)
							.addComponent(btnVoto))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(18)
							.addComponent(panResultado, GroupLayout.PREFERRED_SIZE, 164, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(63, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAno)
						.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnVoto)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(panResultado, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(121, Short.MAX_VALUE))
		);
		
		GroupLayout gl_panResultado = new GroupLayout(panResultado);
		gl_panResultado.setHorizontalGroup(
			gl_panResultado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panResultado.createSequentialGroup()
					.addGroup(gl_panResultado.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panResultado.createSequentialGroup()
							.addGap(50)
							.addComponent(lblR))
						.addGroup(gl_panResultado.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(lblIdade)))
					.addContainerGap(76, Short.MAX_VALUE))
		);
		gl_panResultado.setVerticalGroup(
			gl_panResultado.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panResultado.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblR)
					.addGap(18)
					.addGroup(gl_panResultado.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblIdade))
					.addContainerGap(23, Short.MAX_VALUE))
		);
		panResultado.setLayout(gl_panResultado);
		frame.getContentPane().setLayout(groupLayout);
	}
}
