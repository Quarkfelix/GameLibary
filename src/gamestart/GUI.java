package gamestart;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

import io.KeyHandler;
import physics.Physics;

public class GUI extends JFrame{
	// JFrame
	private JFrame jf;
	private Draw draw;
	private int width = 1200;
	private int height = 700;

//Constructor ------------------------------------------------------------------------------------------
	public GUI() {
		createJFrame();
	}

//methods ----------------------------------------------------------------------------------------------
	// initializing JFrame
	private void createJFrame() {
		jf = new JFrame();
		draw = new Draw();
		jf.setSize(width, height);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setUndecorated(true);
		jf.add(draw);
		jf.addKeyListener(new KeyHandler());
		jf.setVisible(true);
	}
//getter-setter ----------------------------------------------------------------------------------------

}

class Draw extends JPanel implements Runnable {
	private boolean running = true;
//Constructor ------------------------------------------------------------------------------------------
	public Draw() {
		Thread t = new Thread(this);
		t.start();
	}
// run --------------------------------------------------------------------------------------------------
	@Override
	public void run() {
		while (running) {
			repaint();
		}
	}

//methods ----------------------------------------------------------------------------------------------
	// gets called from gui thread
	public void paint(Graphics graphics) {
		Graphics2D g = (Graphics2D) graphics;
		drawBackground(g);
		Game.scenemanager.paint(g);
	}

	private void drawBackground(Graphics2D g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, Toolkit.getDefaultToolkit().getScreenSize().width,
				Toolkit.getDefaultToolkit().getScreenSize().height);
	}
//getter-setter ----------------------------------------------------------------------------------------

//paint ------------------------------------------------------------------------------------------------

}
