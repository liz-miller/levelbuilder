package controller;

import view.LevelType;
import view.Splash;

/**
 * From splash screen, move on to level type. note we can dispose the
 * splash screen, since it won't be seen again.
 *
 */
public class SplashToLevelTypeController {
	Splash parent;
	
	public SplashToLevelTypeController(Splash parent) {
		this.parent = parent;
	}
	
	/**
	 * Switch to the level type view display.
	 */
	public void process() {
		LevelType type = new LevelType();
		parent.dispose();
		type.setVisible (true);
	}
}