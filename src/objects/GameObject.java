package objects;

import java.awt.Graphics2D;

public abstract class GameObject {
	private String identifier;
//methods ----------------------------------------------------------------------------------------------
	public abstract boolean identifierTaken(String identifier);
//getter-setter ----------------------------------------------------------------------------------------

//paint ------------------------------------------------------------------------------------------------
	public abstract void paint(Graphics2D g);
}
