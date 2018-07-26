package jogo;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class Principal {
	static int[] linha1 = new int[3];
	static int[] linha2 = new int[3];
	static int[] linha3 = new int[3];

	JFrame janela = new JFrame("velha");
	JPanel painel1 = new JPanel();
	JPanel painel2 = new JPanel();
	JPanel painel3 = new JPanel();
	JPanel painelFull = new JPanel();

	JToggleButton c1l1 = new JToggleButton();
	JToggleButton c1l2 = new JToggleButton();
	JToggleButton c1l3 = new JToggleButton();
	JToggleButton c2l1 = new JToggleButton();
	JToggleButton c2l2 = new JToggleButton();
	JToggleButton c2l3 = new JToggleButton();
	JToggleButton c3l1 = new JToggleButton();
	JToggleButton c3l2 = new JToggleButton();
	JToggleButton c3l3 = new JToggleButton();
	JToggleButton resetar = new JToggleButton("»»RESETAR««");
	JToggleButton[] botaoVetor = new JToggleButton[9];

	public static void main(String[] args) {
		new Principal().criarJanela();
	}

	private void criarJanela() {
		this.botaoVetor[0] = this.c1l1;
		this.botaoVetor[1] = this.c2l1;
		this.botaoVetor[2] = this.c3l1;
		this.botaoVetor[3] = this.c1l2;
		this.botaoVetor[4] = this.c2l2;
		this.botaoVetor[5] = this.c3l2;
		this.botaoVetor[6] = this.c1l3;
		this.botaoVetor[7] = this.c2l3;
		this.botaoVetor[8] = this.c3l3;

		c1l1.setPreferredSize(new Dimension(50, 50));
		c1l2.setPreferredSize(new Dimension(50, 50));
		c1l3.setPreferredSize(new Dimension(50, 50));
		c2l1.setPreferredSize(new Dimension(50, 50));
		c2l2.setPreferredSize(new Dimension(50, 50));
		c2l3.setPreferredSize(new Dimension(50, 50));
		c3l1.setPreferredSize(new Dimension(50, 50));
		c3l2.setPreferredSize(new Dimension(50, 50));
		c3l3.setPreferredSize(new Dimension(50, 50));
		resetar.setPreferredSize(new Dimension(60, 30));

		painel1.add(BorderLayout.WEST, c1l1);
		painel1.add(BorderLayout.CENTER, c2l1);
		painel1.add(BorderLayout.EAST, c3l1);
		painel2.add(BorderLayout.WEST, c1l2);
		painel2.add(BorderLayout.CENTER, c2l2);
		painel2.add(BorderLayout.EAST, c3l2);
		painel3.add(BorderLayout.WEST, c1l3);
		painel3.add(BorderLayout.CENTER, c2l3);
		painel3.add(BorderLayout.EAST, c3l3);
		painelFull.add(BorderLayout.NORTH, painel1);
		painelFull.add(BorderLayout.CENTER, painel2);
		painelFull.add(BorderLayout.SOUTH, painel3);

		janela.add(BorderLayout.CENTER, painelFull);
		janela.add(BorderLayout.NORTH, resetar);
		janela.setLocationRelativeTo(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(200, 260);
		janela.setVisible(true);

		c1l1.addActionListener(new C1l1(c1l1, botaoVetor));
		c2l1.addActionListener(new C2l1(c2l1, botaoVetor));
		c3l1.addActionListener(new C3l1(c3l1, botaoVetor));
		c1l2.addActionListener(new C1l2(c1l2, botaoVetor));
		c2l2.addActionListener(new C2l2(c2l2, botaoVetor));
		c3l2.addActionListener(new C3l2(c3l2, botaoVetor));
		c1l3.addActionListener(new C1l3(c1l3, botaoVetor));
		c2l3.addActionListener(new C2l3(c2l3, botaoVetor));
		c3l3.addActionListener(new C3l3(c3l3, botaoVetor));
		resetar.addActionListener(e -> resetar());

	}

	protected void resultado() {
		if ((linha1[0] == 1) && (linha1[1] == 1) && (linha1[2] == 1)) {
			JOptionPane.showMessageDialog(null, "Ganhou");
		}
		if ((linha2[0] == 1) && (linha2[1] == 1) && (linha2[2] == 1)) {
			JOptionPane.showMessageDialog(null, "Ganhou");
		}
		if ((linha3[0] == 1) && (linha3[1] == 1) && (linha3[2] == 1)) {
			JOptionPane.showMessageDialog(null, "Ganhou");
		}
		if ((linha1[0] == 1) && (linha2[0] == 1) && (linha3[0] == 1)) {
			JOptionPane.showMessageDialog(null, "Ganhou");
		}
		if ((linha1[1] == 1) && (linha2[1] == 1) && (linha3[1] == 1)) {
			JOptionPane.showMessageDialog(null, "Ganhou");
		}
		if ((linha1[2] == 1) && (linha2[2] == 1) && (linha3[2] == 1)) {
			JOptionPane.showMessageDialog(null, "Ganhou");
		}
		if ((linha1[0] == 1) && (linha2[1] == 1) && (linha3[2] == 1)) {
			JOptionPane.showMessageDialog(null, "Ganhou");
		}
		if ((linha1[2] == 1) && (linha2[1] == 1) && (linha3[0] == 1)) {
			JOptionPane.showMessageDialog(null, "Ganhou");
		}

		///////////////////////////////////////////////////////////////

		if ((linha1[0] == 2) && (linha1[1] == 2) && (linha1[2] == 2)) {
			JOptionPane.showMessageDialog(null, "Perdeu");
		}
		if ((linha2[0] == 2) && (linha2[1] == 2) && (linha2[2] == 2)) {
			JOptionPane.showMessageDialog(null, "Perdeu");
		}
		if ((linha3[0] == 2) && (linha3[1] == 2) && (linha3[2] == 2)) {
			JOptionPane.showMessageDialog(null, "Perdeu");
		}
		if ((linha1[0] == 2) && (linha2[0] == 2) && (linha3[0] == 2)) {
			JOptionPane.showMessageDialog(null, "Perdeu");
		}
		if ((linha1[1] == 2) && (linha2[1] == 2) && (linha3[1] == 2)) {
			JOptionPane.showMessageDialog(null, "Perdeu");
		}
		if ((linha1[2] == 2) && (linha2[2] == 2) && (linha3[2] == 2)) {
			JOptionPane.showMessageDialog(null, "Perdeu");
		}
		if ((linha1[0] == 2) && (linha2[1] == 2) && (linha3[2] == 2)) {
			JOptionPane.showMessageDialog(null, "Perdeu");
		}
		if ((linha1[2] == 2) && (linha2[1] == 2) && (linha3[0] == 2)) {
			JOptionPane.showMessageDialog(null, "Perdeu");
		}
	}

	protected void resetar() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				c1l1.setText("");
				c2l1.setText("");
				c3l1.setText("");
				c1l2.setText("");
				c2l2.setText("");
				c3l2.setText("");
				c1l3.setText("");
				c2l3.setText("");
				c3l3.setText("");
				linha1[0] = 0;
				linha1[1] = 0;
				linha1[2] = 0;
				linha2[0] = 0;
				linha2[1] = 0;
				linha2[2] = 0;
				linha3[0] = 0;
				linha3[1] = 0;
				linha3[2] = 0;
			}
		}).start();
	}

}
