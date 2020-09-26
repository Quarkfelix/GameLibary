package gamestart;

import physics.Physics;
import scene.Scenemanager;

public class Game {
	private GUI gui;

	// Scene
	public static Scenemanager scenemanager;

	// physics
	private Physics physics;

//Constructor ------------------------------------------------------------------------------------------
	public Game() {
		gui = new GUI();
		createPhysics();
		createScenemanager();
	}

//run --------------------------------------------------------------------------------------------------

//methods ----------------------------------------------------------------------------------------------
	// initializing physics
	private void createPhysics() {
		physics = new Physics();
	}

	// initializing scenemanager
	private void createScenemanager() {
		scenemanager = new Scenemanager();
	}

//getter-setter ----------------------------------------------------------------------------------------
	public Scenemanager getScenemanager() {
		return Game.scenemanager;
	}
//paint ------------------------------------------------------------------------------------------------

}
