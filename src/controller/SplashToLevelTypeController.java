package controller;

import model.Level;
import view.Configuration;
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
		//LevelType type = new LevelType();
		Level l = new Level();
		Configuration c = new Configuration(l);
		parent.dispose();
		c.setVisible (true);
	}
}