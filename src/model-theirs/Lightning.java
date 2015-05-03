package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.sql.Time;
import java.util.logging.Logger;

/**
 * Creates a Lightning Level.
 * 
 * @author Liz Miller & npmahowald
 *
 */
public class Lightning extends Level implements java.io.Serializable{
	private String levelType;
	private int score;
	private int[] starThreshold;
	private int eliminateTilesLeft = 3;
	private int swapTilesLeft = 3;
	private boolean eliminateTileState;
	private boolean swapTileState;
	private Board board;
	private int time;
	
	public Lightning(int time, int starThreshold, int eliminateTilesLeft, int swapTilesLeft){
		super(null);
		this.levelType = "Lightning";
		this.time = time;
		board = new Board(this);
	}

	@Override
	public Level restart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void generateTiles() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void decreaseMovesLeft(){
	}
	
	@Override
	public int getMovesLeft(){
		return 0;
	}
	
	public int getTime(){
		return time;
	}
	public void setTime(int t){
		time = t;
	}
	
	public boolean endGame(){
		return time == 0;
	}
	
	@Override
	public void saveLevel() {
	    try {
	        Lightning lev = new Lightning();
	        File f = new File("lightning.data");
	        OutputStream out = new FileOutputStream( f );
	    }
	    catch (Exception e ) {
	        e.printStackTrace();
	    }
	}	
		

	
}
