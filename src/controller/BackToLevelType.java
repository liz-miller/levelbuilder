package controller;

import view.Configuration;
import view.LevelType;

/**
 * Controls the GUI from Configuration Form to LevelType Menu.
 * @author Liz Miller
 *
 */
public class BackToLevelType {
	Configuration parent;
	
	public BackToLevelType(Configuration parent) {
		this.parent = parent;
	}
	
	/**
	 * Switches back to the LevelType Menu.
	 */
	public void back() {
		LevelType type = new LevelType();
		parent.dispose();
		type.setVisible (true);
	}

}
