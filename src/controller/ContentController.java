package controller;

import javax.swing.JRadioButton;
import javax.swing.JTextField;

import model.Elimination;
import model.Level;
import model.Lightning;
import model.Puzzle;
import model.Release;
import model.Square;
import model.Tile;
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
			System.out.println("Puzzle Level has been created.");
			l.setPuzzle();

		}else if (type == 2){
			l = new Lightning();
			System.out.println("Lightning Level has been created.");
			l.setLight();
	
		}else if(type == 3){
			l = new Elimination();
			System.out.println("Elimination Level has been created.");
			l.setElim();
	
		}else if(type == 4){
			l = new Release();
			System.out.println("Release Level has been created.");
			l.setRelease();
		}	
	}
	
	public void setTilePercents(JTextField f1, JTextField f2, JTextField f3, JTextField f4, JTextField f5, JTextField f6){
		int ones = l.getField(f1);
		int twos = l.getField(f2);
		int threes = l.getField(f3);
		int fours = l.getField(f4);
		int fives = l.getField(f5);
		int sixes = l.getField(f6);

		l.getPercentTile(l.calculateTilePercent(ones, twos, threes, fours, fives, sixes), 1);
		
		System.out.println("Tile percentages have been set:");
		System.out.println("Ones: " + Integer.toString(ones) + "%");
//		System.out.println("Twos: " + Integer.toString(twos) + "%");
//		System.out.println("Threes: " + Integer.toString(threes) + "%");
//		System.out.println("Fours: " + Integer.toString(fours) + "%");
//		System.out.println("Fives: " + Integer.toString(fives) + "%");
//		System.out.println("Sixes: " + Integer.toString(sixes) + "%");
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
	public void setStars(JTextField t){
		int stars = l.getField(t);
		l.setStars(stars);
		System.out.println("Stars has been set to " + l.getNumStars(l) + ".");

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
	public void generate(Level l, JTextField num, JTextField moves, JTextField stars, JTextField difficulty){
		int levelNum = l.getField(num);
		l.setNum(levelNum);
		int numMoves = l.getField(moves);
		l.setNumMoves(numMoves);
		int numStars = l.getField(stars);
		l.setStars(numStars);
		int diff = l.getField(difficulty);
		l.setDiff(diff);
		
		printAll(l);	
	}
	
	
	/**
	 * Prints the contents of the Configuration getters.
	 * @param l
	 */
	public void printAll(Level l){
		int levelNum = l.getNum();
		int numMoves = l.getNumMoves(l);
		int numStars = l.getNumStars(l);
		int difficulty = l.getDifficulty(l);
		//String name = l.getName();
		

		System.out.println("Level Number = " + levelNum);
		System.out.println("Number of Moves = " + numMoves);
		System.out.println("Number of Stars = " + numStars);
		System.out.println("Level Difficulty = " + difficulty);
		//System.out.println("Level Type = " + name);
	}

}
