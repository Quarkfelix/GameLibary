package objects;

import java.awt.Color;
import java.awt.Graphics2D;

import rendering.Camera;
import scene.Scenemanager;

public class Rectangle extends GameObject {
	private int x = 0;
	private int y = 0;
	private int width = 200;
	private int height = 200;
	private Color color = Color.WHITE;
	private String identifier = "null";
	
//Constructor ------------------------------------------------------------------------------------------
	public Rectangle(String identifier) {
		this.identifier = identifier;
	}
//methods ----------------------------------------------------------------------------------------------
	@Override
	public boolean identifierTaken(String identifier) {
		if(this.identifier == identifier)
			return true;
		return false;
	}
	public void test() {
		
	}
	
//getter-setter ----------------------------------------------------------------------------------------
	public void setColor(Color color) {
		this.color = color;
	}
//paint ------------------------------------------------------------------------------------------------
	@Override
	public void paint(Graphics2D g) {
		Camera camera = Scenemanager.getCamera();
		if(camera.contains(x, y, width, height)) {
			g.setColor(color);
			g.fillRect(x - camera.getX(), (camera.getHeight() - y - height) + camera.getY(), width, height);
		}
		
		
	}

	

}
