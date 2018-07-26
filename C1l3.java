package jogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JToggleButton;

public class C1l3 extends Principal implements ActionListener {
	JToggleButton[] botaoVetor = null;
	public C1l3 (JToggleButton botao, JToggleButton[] botaoVetor) {
		this.botaoVetor = botaoVetor;
		this.c1l3 = botao;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					marcar(c1l3);
					bot();
					resultado();
				} catch (Exception e) {
					//e.printStackTrace();
					resetar();
				}

			}
		}).start();
	}
	
	private boolean marcar(JToggleButton botao) throws InterruptedException {
		if ((botao.getText().equals("X")) || (botao.getText().equals("O"))) {
			JOptionPane.showMessageDialog(null, "MARCADO");
			return false;
		} else {
			botao.setText("X");
			linha3[0] = 1;
			return true;
		}
	}
	
	private void bot() {
		if (linha1[0] != 0 && linha1[1] != 0 && linha1[2] != 0 && linha2[0] != 0 && linha2[1] != 0 && linha2[2] != 0
				&& linha3[0] != 0 && linha3[1] != 0 && linha3[2] != 0) {
			resetar();
		}
		else {
		Random random = new Random();
		int var = 0;
		random = new Random();
		var = random.nextInt(9);
		marcarBot(botaoVetor[var], var);
		}
	}

	private boolean marcarBot(JToggleButton botao, int var) {
		if ((botao.getText().equals("X")) || (botao.getText().equals("O"))) {
			bot();
			return false;
		} else {
			botao.setText("O");
			switch (var) {
			case 1:
				linha1[1] = 2;
				break;
			case 2:
				linha1[2] = 2;
				break;
			case 3:
				linha2[0] = 2;
				break;
			case 4:
				linha2[1] = 2;
				break;
			case 5:
				linha2[2] = 2;
				break;
			case 0:
				linha1[0] = 2;
				break;
			case 7:
				linha3[1] = 2;
				break;
			case 8:
				linha3[2] = 2;
				break;
			default:
				break;
			}
			return true;
		}
	}

}