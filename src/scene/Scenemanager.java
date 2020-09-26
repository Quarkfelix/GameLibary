package scene;

import java.awt.Graphics2D;
import java.util.ArrayList;

import objects.GameObject;
import objects.GameObjectTypes;
import objects.Rectangle;

/*
 * the scenemanager is the main accesspoint for the gamelibary. 
 * it is probably best to create a scsnemanagerobject right after you initialized a gameobject and then use it
 * to add delete objects etc.
 * The scenemanager has one scene by default but more can be addet.
*/


public class Scenemanager {
	//scenes
	private ArrayList<Scene> scenes;
	private int sceneindex = 0;
	
//Constructor ------------------------------------------------------------------------------------------
	public Scenemanager() {
		scenes = new ArrayList();
		scenes.add(new Scene());
	}
//run --------------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------	
	// gives the active scene the command to add a object of given type
	public void createObject(GameObjectTypes type) {
		scenes.get(sceneindex).addObject(type);
	}

	// gives the active scene the command to delete a object of given type at given index
	public void deleteObjcet(int index, GameObjectTypes type) {
		scenes.get(sceneindex).deleteObject(index, type);
	}
//getter-setter ----------------------------------------------------------------------------------------
	//setzt scene aktiv (noch mit namen hinzufügen)
	public void setSceneActive(int index) {
		
	}
	
	public Scene getActiveScene() {
		return scenes.get(sceneindex);
	}
	
	// returns all objects of active scene as ArrayList of type GameObject
	public ArrayList<GameObject> getObjects() {
		return scenes.get(sceneindex).getObjects();
	}
//paint ------------------------------------------------------------------------------------------------
	
	public void paint(Graphics2D g) {
		scenes.get(sceneindex).paint(g);
	}
}
