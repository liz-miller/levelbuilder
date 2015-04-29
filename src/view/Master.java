package view;

import javax.swing.*;

import java.util.logging.Level;

/**
 * Top Level class for generating level builder views.
 * @author Liz Miller
 */

public class Master extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private static Splash splsh;
	private static LevelType levelType;
	private static Configuration config;

	Level level;

	
	/**
	 * Main view class. It runs the GUI for the level builder.
	 * @author Liz Miller
	 */
	public Master(Level l) {
		super("Sixes Wild Level Builder");
		//setSize(800, 800);
		this.level = l;
		toMenu(0);
	}

	/**
	 * Navigate between menus by providing the menu number.
	 * @param selection
	 */
	public void toMenu(int selection) {
		if (selection == 0) {
			splsh = new Splash(this);
			setContentPane(splsh);
			repaint();
		}
		if (selection == 1) {
			levelType = new LevelType(this);
			setContentPane(levelType);
			levelType.revalidate(); 
			repaint();
		} 
	}
	
	/**
	 * Returns the Configuration view based on the level type selection.
	 * @return Configuration
	 */
	public Configuration getConfig(){
		return config;
	}
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash(master);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}