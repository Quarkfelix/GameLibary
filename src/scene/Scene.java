package scene;

import java.awt.Graphics2D;
import java.util.ArrayList;

import objects.Circle;
import objects.GameObject;
import objects.GameObjectTypes;
import objects.Rectangle;

/*
 * On default one scene is created. A scene is for example one room or the main menu
 * in scenes are all objects of this scene. 
 * The scenes are managed though the Scenemanager. Direct access to the scene object is not possible
*/

public class Scene {
	private ArrayList<Rectangle> rectangles = new ArrayList();
	private ArrayList<Circle> circles = new ArrayList();

//Constructor ------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------
	// adds a object of given type to scene
	public void addObject(GameObjectTypes type) {
		switch (type) {
		case Rectangle:
			rectangles.add(new Rectangle());
			break;
		case Circle:
			circles.add(new Circle());
			break;

		default:
			break;
		}
	}

	// deletes given index in
	public void deleteObject(int index, GameObjectTypes type) {
		switch (type) {
		case Rectangle:
			if (index < rectangles.size()) {
				rectangles.remove(index);
			}
			break;

		case Circle:
			if (index < circles.size()) {
				circles.remove(index);
			}
			break;

		default:
			break;
		}

	}

//getter-setter ----------------------------------------------------------------------------------------
	// returns all objects as ArrayList of type GameObject
	public ArrayList<GameObject> getObjects() {
		ArrayList<GameObject> list = new ArrayList();
		list.addAll(rectangles);
		list.addAll(circles);
		return list;
	}

//paint ------------------------------------------------------------------------------------------------
	public void paint(Graphics2D g) {
		for (GameObject obj : getObjects()) {
			obj.paint(g);
		}
	}
}
