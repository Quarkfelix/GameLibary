package objects;

import java.awt.Graphics2D;

public class Circle extends GameObject {
	private String identifier = "null";
//Constructor ------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------
	@Override
	public boolean identifierTaken(String identifier) {
		if(this.identifier == identifier)
			return true;
		return false;
	}
//getter-setter ----------------------------------------------------------------------------------------

//paint ------------------------------------------------------------------------------------------------
	@Override
	public void paint(Graphics2D g) {
		// TODO Auto-generated method stub

	}

}
