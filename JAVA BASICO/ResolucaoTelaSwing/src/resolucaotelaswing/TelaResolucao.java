package resolucaotelaswing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.Toolkit;

public class TelaResolucao {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaResolucao window = new TelaResolucao();
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
	public TelaResolucao() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 179);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\thais\\eclipse-workspace\\ResolucaoTelaSwing\\src\\imagens\\pngwing.com (2).png"));
		
		JLabel lblNewLabel_1 = new JLabel("Resolu\u00E7\u00E3o da tela:");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 20));
		
		JLabel lblResolucao = new JLabel("Clique no Bot\u00E3o");
		lblResolucao.setForeground(Color.GRAY);
		lblResolucao.setFont(new Font("Arial", Font.BOLD, 17));
		
		JButton btnResolucao = new JButton("Mostrar Resolu\u00E7\u00E3o");
		btnResolucao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
				int lar = (int) tela.getWidth();
				int alt = (int) tela.getHeight();
				lblResolucao.setText(lar + "x" + alt);
			}
		});
		btnResolucao.setForeground(SystemColor.inactiveCaptionText);
		btnResolucao.setFont(new Font("Arial", Font.PLAIN, 15));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblNewLabel_1))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(btnResolucao)
								.addComponent(lblResolucao))))
					.addContainerGap(122, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(19)
							.addComponent(lblNewLabel_1)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblResolucao)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(btnResolucao)))
					.addContainerGap(138, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
