package scene;

import java.awt.Graphics2D;
import java.util.ArrayList;

import exeptions.IdentifierNotAvailableException;
import exeptions.IdentifierNotFoundException;
import objects.GameObject;
import objects.GameObjectTypes;
import objects.Rectangle;
import rendering.Camera;

/*
 * the scenemanager is the main accesspoint for the gamelibary. 
 * it is probably best to create a scenemanagerobject right after you initialized a gameobject and then use it
 * to add delete objects etc.
 * The scenemanager has one scene by default but more can be added.
 * 
 * Scenemanager only gives acces to the scenes. Acces to objects is handled in The scene object
*/

public class Scenemanager {
	// scenes
	private ArrayList<Scene> scenes;
	private String activeScene = "defaultScene";

	// camera
	private static Camera camera = new Camera();

//Constructor ------------------------------------------------------------------------------------------
	public Scenemanager() {
		scenes = new ArrayList();
		scenes.add(new Scene("defaultScene"));
	}
//run --------------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------	
	public void createScene(String identifier) {
		scenes.add(new Scene(identifier));
	}

//getter-setter ----------------------------------------------------------------------------------------
	//scene
	public void setActiveScene(String identifier) {
		for (Scene scene : scenes) {
			if(scene.getIdentifier() == identifier) {
				activeScene = identifier;
				break;
			}
			System.out.println("0");
		}
		System.out.println("broken");
		//exception muss noch hier rein
	}

	public Scene getActiveScene() {
		for (Scene scene : scenes) {
			if(scene.getIdentifier() == activeScene) 
				return scene;
		}
		return null;
	}

	// returns camera
	public static Camera getCamera() {
		return camera;
	}

//paint ------------------------------------------------------------------------------------------------

	public void paint(Graphics2D g) {
		for (Scene scene : scenes) {
			if(scene.getIdentifier() == activeScene) 
				scene.paint(g);
		}	
	}
}
