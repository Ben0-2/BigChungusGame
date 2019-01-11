package GameManagement;

import java.awt.Panel;

import javax.swing.JFrame;

public class BigChungus {
JFrame f;
GamePanel p;
	public static void main(String[] args) {
	BigChungus Bugs = new BigChungus();
		Bugs.Start();
	}
void Start() {
	f = new JFrame();
	p = new GamePanel();
	f.setSize(3000, 1500);
	f.addKeyListener(p);
	f.add(p);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	p.startGame();
}
}
