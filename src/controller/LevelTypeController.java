package controller;

import model.Elimination;
import model.Lightning;
import model.Puzzle;
import model.Release;
import view.Configuration;
import view.LevelType;

/**
 * From splash screen, move on to level type. note we can dispose the
 * splash screen, since it won't be seen again.
 *
 */
public class LevelTypeController{
	LevelType parent;
	int levelType; 
	
	public LevelTypeController(LevelType parent) {
		this.parent = parent;
	}
	
	/**
	 * Switch to the configuration form for puzzle level.
	 * @return int 1
	 */
	public void puzzle() {
		Puzzle p = new Puzzle();
		p.setNumMoves(55);
		Configuration config = new Configuration(p);
		parent.dispose();
		config.setVisible (true);
		levelType = 1;
	}
	
	/**
	 * Switch to the configuration form for lightning level.
	 * @return int 2
	 */
	public void lightning() {
		Lightning l = new Lightning();
		Configuration config = new Configuration(l);
		parent.dispose();
		config.setVisible (true);
		levelType = 2;
	}
	
	/**
	 * Switch to the configuration form for release level.
	 * @return int 3
	 */
	public void release() {
		Release r = new Release();
		Configuration config = new Configuration(r);
		parent.dispose();
		config.setBoolean(false);
		config.setVisible (true);
		levelType = 4;
	}
	
	/**
	 * Switch to the configuration form for elimination level.
	 * @return int 4
	 */
	public void elimination() {
		Elimination e = new Elimination();
		Configuration config = new Configuration(e);
		parent.dispose();
		config.setVisible (true);
		levelType = 3;
	}
	
	
	/**
	 * Gets the level type value triggered by a button press.
	 * @return
	 */
	public int getLevelType(){
		return levelType;
	}

}