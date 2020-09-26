package objects;

import java.awt.Color;
import java.awt.Graphics2D;

public class Rectangle extends GameObject {
	private int x = 100;
	private int y = 100;
	private int width = 200;
	private int height = 200;
	private Color color = Color.WHITE;
	
//Constructor ------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------

//getter-setter ----------------------------------------------------------------------------------------

//paint ------------------------------------------------------------------------------------------------
	@Override
	public void paint(Graphics2D g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);

	}

}
