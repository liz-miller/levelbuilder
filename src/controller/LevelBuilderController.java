package controller;

import javax.swing.JTextField;

import SixesWildGame.model.Elimination;
import SixesWildGame.model.Lightning;
import SixesWildGame.model.Puzzle;
import SixesWildGame.model.Release;
import SixesWildGame.model.Square;
import view.Configuration;
import controller.Serializer;


/**
 * Creates a Level from the Configuration Form.
 * @author Liz Miller
 *
 */
public class LevelBuilderController {
	Configuration config;
	private static model.Level l;
	
	/**
	 * Construct a Level using the model Level.
	 */
	public LevelBuilderController(Configuration config){
		this.config = config;
	}
	
	/**
	 * Generates a level based on input from Configuration Form JTextFields.
	 * @param Level 
	 * @param JTextField levelNum
	 * @param JTextField moves
	 * @param JTextField stars 
	 * @param JTextField difficulty
	 */
	public void generate(model.Level l, JTextField num, JTextField moves, JTextField stars1, JTextField stars2, JTextField stars3, 
		JTextField freq_1, JTextField freq_2, JTextField freq_3, 
		JTextField t1, JTextField t2, JTextField t3, JTextField t4, JTextField t5, JTextField t6){
			//process();
		int[] starThresholds = new int [3];
		starThresholds[0] = l.getSingleStar(l, 0);
		starThresholds[1] = l.getSingleStar(l, 1);
		starThresholds[2] = l.getSingleStar(l, 2);
		
		System.out.println("passed for stars");
		
		int[] multWeight = new int [3];
		multWeight[0] = l.getSingleMult(l, 0);
		multWeight[1] = l.getSingleMult(l,1); 
		multWeight[2] = l.getSingleMult(l, 2);
		
		System.out.println("passed for mult");
		
		int[] valWeight = new int [3];
		valWeight [0] = l.getFreq(l, 0);
		valWeight[1] =  l.getFreq(l,1);
		valWeight[2] = l.getFreq(l, 2);
		
		System.out.println("passed for val weight");
		
		int type = l.getType();
		int numL = l.getNum();
		
		SixesWildGame.model.Lightning lightLevel = null;
		SixesWildGame.model.Elimination elimLevel = null;
		SixesWildGame.model.Release reLevel = null;
		SixesWildGame.model.Puzzle puzzLevel = null;
		//SixesWildGame.model.Level gameLevel = null;
		
		System.out.println("passed for creating null levels");
		
		if (type == 2){
			lightLevel = new Lightning(30, starThresholds, valWeight, multWeight, 3, 3, numL);	
			System.out.println("passed for creating lightning");
		}else if(type == 3){
			elimLevel = new Elimination(starThresholds, valWeight, multWeight, 3, 3, numL);
			System.out.println("passed for creating elimin");
		} else  if(type == 4){
			reLevel = new Release(30, starThresholds, valWeight, multWeight, 3, 3, numL);
			System.out.println("passed for creating release");
		} else if (type == 1){
			puzzLevel = new Puzzle(30, starThresholds, valWeight, multWeight, 3, 3, numL);
			System.out.println("passed for creating puzzle");
		}
		
		for(int i = 0; i < 9; i++){
			lightLevel.getBoard().setSquare(new Square(0,i,1));
			elimLevel.getBoard().setSquare(new Square(0,i,1));
			reLevel.getBoard().setSquare(new Square(0,i,1));
			puzzLevel.getBoard().setSquare(new Square(0,i,1));
		}
		for(int i = 0; i < 9; i++){
			lightLevel.getBoard().setSquare(new Square(8,i,1));
			elimLevel.getBoard().setSquare(new Square(8,i,1));
			reLevel.getBoard().setSquare(new Square(8,i,1));
			puzzLevel.getBoard().setSquare(new Square(8,i,1));
			
		}
		for(int i = 0; i < 9; i++){
			lightLevel.getBoard().setSquare(new Square(1,i,1));
			elimLevel.getBoard().setSquare(new Square(1,i,1));
			reLevel.getBoard().setSquare(new Square(1,i,1));
			puzzLevel.getBoard().setSquare(new Square(1,i,1));
					
		}
		for(int i = 0; i < 9; i++){
			lightLevel.getBoard().setSquare(new Square(7,i,1));
			elimLevel.getBoard().setSquare(new Square(7,i,1));
			reLevel.getBoard().setSquare(new Square(7,i,1));
			puzzLevel.getBoard().setSquare(new Square(7,i,1));
		}
				
		Serializer serializer = new Serializer();
		serializer.serializeLevel(l, numL);
	}

}