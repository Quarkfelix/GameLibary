package scene;

import java.awt.Graphics2D;
import java.util.ArrayList;

import exeptions.IdentifierNotAvailableException;
import objects.Circle;
import objects.GameObject;
import objects.GameObjectTypes;
import objects.Rectangle;
import rendering.Camera;

/*
 * On default one scene is created. A scene is for example one room or the main menu
 * in scenes are all objects of this scene. 
 * The scenes are managed though the Scenemanager. Direct access to the scene object is not possible
 * 
 * The scene handles the management of its objects.
*/

public class Scene {
	private String identifier = "";
	
	private ArrayList<Rectangle> rectangles = new ArrayList();
	private ArrayList<Circle> circles = new ArrayList();

//Constructor ------------------------------------------------------------------------------------------
	public Scene(String identifier) {
		this.identifier = identifier;
	}
//methods ----------------------------------------------------------------------------------------------
	// adds a object of given type to scene //can later be found under identifier
	public void addObject(GameObjectTypes type, String identifier) throws IdentifierNotAvailableException{
		//check if identifier alllready exists
		for (Rectangle rectangle : rectangles) {
			if(rectangle.identifierTaken(identifier))
				throw new IdentifierNotAvailableException();
		}
		for (Circle circle : circles) {
			if(circle.identifierTaken(identifier))
				throw new IdentifierNotAvailableException();
		}
		
		//add new Object 
		switch (type) {
		case Rectangle:
			rectangles.add(new Rectangle(identifier));
			break;
		case Circle:
			circles.add(new Circle());
			break;
		default:
			break;
		}
	}

	// deletes object based on type and identifier
	public void deleteObject(GameObjectTypes type, String identifier) {
		switch (type) {
		case Rectangle:
			for (Rectangle rectangle : rectangles) {
				if(rectangle.identifierTaken(identifier))
					rectangles.remove(rectangle);
			}

		case Circle:
			for (Circle circle : circles) {
				if(circle.identifierTaken(identifier))
					circles.remove(circle);
			}
			break;

		default:
			break;
		}
	}

//getter-setter ----------------------------------------------------------------------------------------
	// returns all objects as ArrayList of type GameObject can then be cast to specific object
	public ArrayList<GameObject> getObjects() {
		ArrayList<GameObject> list = new ArrayList();
		list.addAll(rectangles);
		list.addAll(circles);
		return list;
	}
	
	//returns rectangle based on identifier
	public Rectangle getRectangle(String identifier) {
		for (Rectangle rectangle : rectangles) {
			if(rectangle.identifierTaken(identifier))
				return rectangle;
		}
		return null;
	}
	
	//returns circle based on identifier
	public Circle getCircle(String identifier) {
		for (Circle circle : circles) {
			if(circle.identifierTaken(identifier))
				return circle;
		}
		return null;
	}

	//scene
	public String getIdentifier() {
		return identifier;
	}
	

//paint ------------------------------------------------------------------------------------------------
	public void paint(Graphics2D g) {
		for (GameObject obj : getObjects()) {
			obj.paint(g);
		}
	}
}
