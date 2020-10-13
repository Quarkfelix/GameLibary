package io;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import scene.Scenemanager;

public class KeyHandler implements KeyListener {

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_ESCAPE:
			System.exit(0);
			break;

		case KeyEvent.VK_RIGHT:
			Scenemanager.getCamera().move("x");
			break;
		case KeyEvent.VK_LEFT:
			Scenemanager.getCamera().move("-x");
			break;
		case KeyEvent.VK_UP:
			Scenemanager.getCamera().move("y");
			break;
		case KeyEvent.VK_DOWN:
			Scenemanager.getCamera().move("-y");
			break;
		default:
			break;
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
