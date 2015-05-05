package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

import javax.swing.JFileChooser;

import SixesWildGame.model.Level;
import view.Configuration;

public class LoadLevelController implements ActionListener {

	Configuration config;
	int levelNum = 0;
	int numMoves = 1;
	
	
	public LoadLevelController(Configuration configuration) {
		this.config = configuration;
	}
	
	public int getMoves(){
		return this.numMoves;
	}
	
	public void actionPerformed(ActionEvent e) {
		JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(config);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
        	File theFile = fc.getSelectedFile();
        	
        	try{
        		 
    			SixesWildGame.model.Level level;
    			FileInputStream fin = new FileInputStream(theFile);
    			ObjectInputStream ois = new ObjectInputStream(fin);
    			level = (Level) ois.readObject();
    			ois.close();
     
    			// AT THIS POINT! You have to do the conversion
    			model.Level myLevel = null;
    			
    			if (level instanceof SixesWildGame.model.Level) {
    				SixesWildGame.model.Puzzle puz = (SixesWildGame.model.Puzzle) level;
    				myLevel = new model.Puzzle();
    				
    				numMoves = puz.getMovesLeft();
    				myLevel.setNumMoves(numMoves);
    				  				
    			}
    			
    			//config.setLevel(myLevel);
    		}catch(Exception ex){
    		} 
        	
        } 

	}

}
