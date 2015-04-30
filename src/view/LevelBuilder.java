package view;

import java.awt.EventQueue;

import view.Splash;

public class LevelBuilder {
	Splash splash;
	
	public LevelBuilder(){
		splash = new Splash();		
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Splash frame = new Splash();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
}
