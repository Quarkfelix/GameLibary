import gamestart.Game;
import objects.GameObjectTypes;
import scene.Scenemanager;

public class Main {
	public static void main(String[] args) {
		Game game = new Game();
		Scenemanager scenemanager = Game.scenemanager;
		scenemanager.createObject(GameObjectTypes.Rectangle);
	}
	
}
