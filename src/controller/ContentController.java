package controller;

import javax.swing.JTextField;

import model.Elimination;
import model.Level;
import model.Lightning;
import model.Puzzle;
import model.Release;
import view.Configuration;

/**
 * Obtains the content from the Configuration Form.
 * @author Liz Miller
 *
 */
public class ContentController {
	//needs reference to the entity and boundary
	Configuration config;
	Level l = new Level();
	
	public ContentController(Configuration config){
		this.config = config;	
	}
	

	/**
	 * Set the frequency of a number tile.
	 * @param tile
	 * @param value
	 */
	public static void setFreq(Level l, int tile, int value){
		l.setFreq(tile, value);
		}

	
	public int getText(JTextField t){
		String text = t.getText();
		int num = Integer.parseInt(text);
		return num;		
	}
	
	/**
	 * Defines the level type from the Configuration form.
	 * @param type
	 */
	public void setLevelType(int type){
		if(type == 1){
			l = new Puzzle();
			//config.setBoolean(false);
			System.out.println("Puzzle Level has been created.");
			//l.setPuzzle();
			l.setType(1);
		}else if (type == 2){
			l = new Lightning();
			//config.setBoolean(true);
			System.out.println("Lightning Level has been created.");
			//l.setLight();
			l.setType(2);
	
		}else if(type == 3){
			l = new Elimination();
			//config.setBoolean(false);
			System.out.println("Elimination Level has been created.");
			//l.setElim();
			l.setType(3);
	
		}else if(type == 4){
			l = new Release();
			System.out.println("Release Level has been created.");
			//l.setRelease();
			l.setType(4);
		}	
	}
	
	/**
	 * Sets the level type based on the current level instance.
	 *
	 */
	public void getLevelType(){
		if(l instanceof Puzzle){
			l.setType(1);
		}else if (l instanceof Lightning){
			l.setType(2);
		}else if (l instanceof Elimination){
			l.setType(3);
		}else if (l instanceof Release){
			l.setType(4);
		}
	}
	
	/**
	 * Sets the frequency of tiles based on user input to the text fields.
	 * @param f1
	 * @param f2
	 * @param f3
	 * @param f4
	 * @param f5
	 * @param f6
	 */
	public void setTilePercents(JTextField f1, JTextField f2, JTextField f3, JTextField f4, JTextField f5, JTextField f6){

		l.toFrequency(f1, f2, f3, f4, f5, f6);
		
		System.out.println("Tile percentages have been set:");
		System.out.println("Ones: " + l.getFreq(l,0) + "%");
		System.out.println("Twos: " + l.getFreq(l,1) + "%");
		System.out.println("Threes: " + l.getFreq(l,2) + "%");
		System.out.println("Fours: " + l.getFreq(l,3) + "%");
		System.out.println("Fives: " + l.getFreq(l,4) + "%");
		System.out.println("Sixes: " + l.getFreq(l,5) + "%");
		
	}
	
	/**
	 * Sets the level number from the Configuration form.
	 * @param t
	 */
	public void setLevel(JTextField t){
		int level = l.getField(t);
		l.setNum(level);	
		System.out.println("Level " + l.getNum() + " has been set.");
	}
	
	/**
	 * Sets the number of moves in a level.
	 * @param JTextField
	 */
	public void setMoves(JTextField t){
		int numMoves = l.getField(t);
		l.setNumMoves(numMoves);
		System.out.println("Moves has been set to " + l.getNumMoves(l) + ".");
	}
	
	/**
	 * Sets the number of stars in a level.
	 * @param JTextField
	 */
	public void setStars(JTextField t1, JTextField t2, JTextField t3){
		int stars1 = l.getField(t1);
		int stars2 = l.getField(t2);
		int stars3 = l.getField(t3);
		l.setStars(stars1, stars2, stars3);
		System.out.println("Stars{1,2,3} has been set to " + l.getSingleStar(l,0) +  ", " + l.getSingleStar(l,1) +  ", " + l.getSingleStar(l,2) +  ".");

	}
	
	/**
	 * Sets the number of stars in a level.
	 * @param JTextField
	 */
	public void setMult(JTextField freq_1, JTextField freq_2, JTextField freq_3){	
		l.updateMultipliers(freq_1, freq_2, freq_3);	
		System.out.println("Multipliers have been set to " + l.getSingleMult(l,0) + "%" +  ", " + l.getSingleMult(l,1) + "%" +  ", " + l.getSingleMult(l,2) + "%" + ".");
	}
	
	/**
	 * Sets the difficulty of a level.
	 * @param JTextField
	 */
	public void setDifficulty(JTextField t){
		int diff = l.getField(t);
		l.setDiff(diff);
		System.out.println("Difficulty has been set to " + l.getDifficulty(l) + ".");
	}

	
	/**
	 * Sets the deactivated squares in a level.
	 * @param JTextField row
	 * @param JTextField col
	 */
	public void deactivate(JTextField r, JTextField c){
		int row = l.getField(r);
		int col = l.getField(c);
		l.deactivateSquare(row, col);			
		System.out.println("Square row = " + row + ", col = " + col + " has been deactivated.");
	}
	
	
	/**
	 * Sets the activated squares in a level.
	 * @param JTextField row
	 * @param JTextField col
	 */
	public void activate(JTextField r, JTextField c){
		int row = l.getField(r);
		int col = l.getField(c);
		l.activateSquare(row, col);				
		System.out.println("Square row = " + row + ", col = " + col + " has been activated.");
	}
	
	

	/**
	 * Generates a level based on input from Configuration Form JTextFields.
	 * @param Level 
	 * @param JTextField levelNum
	 * @param JTextField moves
	 * @param JTextField stars 
	 * @param JTextField difficulty
	 */
	public void generate(Level l, JTextField num, JTextField moves, JTextField stars1, JTextField stars2, JTextField stars3, 
			JTextField freq_1, JTextField freq_2, JTextField freq_3, 
			JTextField t1, JTextField t2, JTextField t3, JTextField t4, JTextField t5, JTextField t6){
		new LevelBuilder();
		
//		setTilePercents(t1, t2, t3, t4, t5, t6);
//		setMult(freq_1, freq_2,freq_3);
//		setLevel(num);
//		setMoves(moves);
//		setStars(stars1, stars2, stars3);			
		//printAll(l);
	}
	
	
	/**
	 * Prints the contents of the Configuration getters.
	 * @param l
	 */
	public void printAll(Level l){
		int levelNum = l.getNum();
		int numMoves = l.getNumMoves(l);
		int difficulty = l.getDifficulty(l);
		int type = l.getType();
		
		System.out.println("Level Number = " + levelNum);
		System.out.println("Number of Moves = " + numMoves);
		System.out.println("Number of Stars = " + l.getSingleStar(l,0) +  ", " + l.getSingleStar(l,1) +  ", " + l.getSingleStar(l,2) +  ".");
		System.out.println("Level Difficulty = " + difficulty);
		System.out.println("Level Type = " + type);
	}

	/**
	 * Sets the time for a lightning round.
	 * @param t
	 */
	public void setTime(JTextField t) {
		int time = l.getField(t);
		l.setTime(time);			
	}

}
