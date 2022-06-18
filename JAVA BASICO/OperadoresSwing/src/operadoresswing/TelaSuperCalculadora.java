package operadoresswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaSuperCalculadora {

	private JFrame frame;
	private JTextField txtValor;
	JPanel panCalc = new JPanel(); //declarei a variavel globalmente, ou seja todos os metodos podem acessa-la 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaSuperCalculadora window = new TelaSuperCalculadora();
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
	
	public TelaSuperCalculadora() { /*Construtor, JPanel panCalc = new JPanel(); aqui o programa funciona, 
	pq ela está declarada localmente,porém não é uma boa prática se eu for utiliza-la em mais de um local*/
		initialize();
		panCalc.setVisible(false); 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 323, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*JPanel panCalc = new JPanel() por exemplo , neste exemplo ela está declara na linha 42 e 56 por 
		isso foi colocada como variável global*/
		
		JLabel lblNewLabel_10 = new JLabel("Informe um valor");
		
		txtValor = new JTextField();
		txtValor.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("SUPER CALCULADORA"); /*toda variável que tem um nome de uma classe e segue 
		da palavra "new" após o sinal de igual, é uma variável de instância. A partir dela, tu acessa os métodos dessa classe*/
		
		JLabel lblResto = new JLabel("0");
		
		JLabel lblCubo = new JLabel("0");
		
		JLabel lblQuadrada = new JLabel("0");
		
		JLabel lblCubica = new JLabel("0");
		
		JLabel lblAbs = new JLabel("0");
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int v = Integer.parseInt(txtValor.getText());
				
				int r = v % 2;
				lblResto.setText(Integer.toString(r));
				
				double c = Math.pow(v,3);
				lblCubo.setText(Double.toString(c));
				
				double rq = Math.sqrt(v);
				lblQuadrada.setText(String.format("%.2f", rq));
				
				double rc = Math.cbrt(v);
				lblCubica.setText(String.format("%.2f", rc)); //mostra penas duas casa decimais
				
				int abs = Math.abs(v);
				lblAbs.setText(Integer.toString(abs));
				
				panCalc.setVisible(true); //construtor, apareçe o painel
				
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(52)
							.addComponent(lblNewLabel_10)
							.addGap(18)
							.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(panCalc, GroupLayout.DEFAULT_SIZE, 268, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(92)
							.addComponent(lblNewLabel_11))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(111)
							.addComponent(btnCalcular)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_11)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_10))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnCalcular)
					.addGap(18)
					.addComponent(panCalc, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(13, Short.MAX_VALUE))
		);
		
		JLabel lblNewLabel = new JLabel("Resto da divis\u00E3o por 2");
		
		JLabel lblNewLabel_1 = new JLabel("Elevado ao cubo");
		
		JLabel lblNewLabel_2 = new JLabel("Raiz quadrada");
		
		JLabel lblNewLabel_3 = new JLabel("Raiz c\u00FAbica");
		
		JLabel lblNewLabel_4 = new JLabel("Valor absoluto");
		
		GroupLayout gl_panCalc = new GroupLayout(panCalc);
		gl_panCalc.setHorizontalGroup(
			gl_panCalc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panCalc.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panCalc.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel_2)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4))
					.addGap(52)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.LEADING)
						.addComponent(lblAbs)
						.addComponent(lblCubica)
						.addComponent(lblQuadrada)
						.addComponent(lblCubo)
						.addComponent(lblResto))
					.addContainerGap(71, Short.MAX_VALUE))
		);
		gl_panCalc.setVerticalGroup(
			gl_panCalc.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panCalc.createSequentialGroup()
					.addGap(18)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(lblResto))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(lblCubo))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(lblQuadrada))
					.addGap(11)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblCubica))
					.addGap(11)
					.addGroup(gl_panCalc.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(lblAbs))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panCalc.setLayout(gl_panCalc);
		frame.getContentPane().setLayout(groupLayout);
	}
}
