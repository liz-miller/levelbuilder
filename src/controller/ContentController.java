package controller;

import javax.swing.JTextField;

/**
 * Obtains the content from the Configuration Form.
 * @author Liz Miller
 *
 */
public class ContentController {
	
	protected static int[] frequency = new int[6];
	protected static int[] multiplier = new int[3];

	public ContentController(){
		
	}
	
	/**
	 * Set the frequency of a number tile.
	 * @param tile
	 * @param value
	 */
	public static void setFreq(int tile, int value){
		frequency[tile] = value;
	}
	
	/**
	 * Set the multiplier percentage.
	 * @param int
	 * @param int
	 */
	public static void setMult(int index, int value){
		multiplier[index] = value;
	}
	
	/**
	 * Obtains the numerical value from a given text field. Converts String to int.
	 * @param field
	 * @return int
	 */
	public int getNumber(JTextField field){
		String text = field.getText();
		int num = Integer.parseInt(text);
		return num;		
	}
	
	/**
	 * Calculates the percentage occurrence of each numbered tile.
	 * @param ones
	 * @param twos
	 * @param threes
	 * @param fours
	 * @param fives
	 * @param sixes
	 * @return int[] percentage
	 */
	public int[] calculateTilePercent(int ones, int twos, int threes, int fours, int fives, int sixes){
		int percents[] = new int[6];
		int sum = ones + twos + threes + fours + fives + sixes;
		percents[1] = ones/sum;
		percents[2] = twos/sum;
		percents[3] = threes/sum;
		percents[4] = fours/sum;
		percents[5] = fives/sum;
		percents[6] = sixes/sum;
		
		return percents;	
	}
	
	/**
	 * Sets the multiplier frequencies for a level.
	 * @param ones
	 * @param twos
	 * @param threes
	 * @return int[] multipliers
	 */
	public int[] setMultipliers(int ones, int twos, int threes){
		int multipliers[] = new int[3];
		multipliers[1] = ones;
		multipliers[2] = twos;
		multipliers[3] = threes;
		
		return multipliers;		
	}

	/**
	 * Getter for the frequency array.
	 * @return int[]
	 */
	public static int[] getFreq() {
		return frequency;
	}
	
	/**
	 * Getter for the multiplier array.
	 * @return int[]
	 */
	public static int[] getMult(){
		return multiplier;
	}

}
