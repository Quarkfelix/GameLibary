import java.awt.Color;

import exeptions.IdentifierNotAvailableException;
import gamestart.Game;
import objects.GameObjectTypes;
import scene.Scenemanager;

public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		Scenemanager scenemanager = Game.scenemanager;
		
		try {
			scenemanager.getActiveScene().addObject(GameObjectTypes.Rectangle, "object1");
			scenemanager.createScene("scene1");
			scenemanager.getActiveScene().addObject(GameObjectTypes.Rectangle, "object2");
			scenemanager.getActiveScene().getRectangle("object2").setColor(Color.RED);
			scenemanager.setActiveScene("scene1");
		} catch (IdentifierNotAvailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
