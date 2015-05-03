 package model;

import javax.swing.JTextField;

/**
 * Creates a generic level for Sixes' Wild West.
 * @author Liz Miller
 */

//STATUS: needs body method implementations. Last modified: 4/26

public class Level {
	private int num;
	private Square square;
	private Tile tile;
	private int numMoves;
	private int numStars;
	protected int difficulty;
	private int frequency[];
	//private int type;
	private String name;
	
	public Level(){
		this.setNum(num);
		this.setSquare(square);
		this.setTile(tile);
		this.setNumMoves(numMoves);
		this.setStars(numStars);
		this.setDiff(difficulty);
		//this.setType(type);
		}
	
	/**
	 * Sets the given square equal to the current square.
	 * @param square
	 */
	private void setSquare(Square square) {
		this.square = square;
		
	}

	/**
	 * Returns the integer type of the level.
	 * @return
	 */
	public void setName(){
		
	}
	
	public String getName(){
		return name;
	}
	/**
	 * Saves a given level to disk.
	 * @param l
	 */
	public void saveLevel(Level l){
		
	}
	
	/**
	 * Opens a given level from disk.
	 * @param l
	 */
	public void loadLeve(Level l){
		
	}
	
	/**
	 * Restarts current level.
	 * @return Level
	 */
	public Level restart(){
		return null;
	}

	
	/**
	 * Generates tiles. Override for specific level functionality.
	 * @param levelType
	 */
	public void generateTiles(){
		
	}
	

	/**
	 * Returns the number of moves of a level.
	 * @param Level l
	 * @return
	 */
	public int getNumMoves(Level l){
		return l.numMoves;
	}
	
	/**
	 * Returns the number of stars of a level.
	 * @param Level l
	 * @return
	 */
	public int getNumStars(Level l){
		return l.numStars;
	}
	
	/**
	 * Returns the difficulty of a level.
	 * @param Level l
	 * @return
	 */
	public int getDifficulty(Level l){
		return l.difficulty;
	}

//	/**
//	 * Returns the row/column 2D array of a single square.
//	 * @return square
//	 */
//	public Square getSquares(int row, int col) {
//		return this.square.getRow()
//				
//				this.square.isInert()
//	}
	
	/**
	 * Activates a single square.
	 * @return 
	 */
	public void activateSquare(int row, int col) {
		square.setMarked();
	}  
	
	/**
	 * Deactivates a single square.
	 * @return 
	 */
	public void deactivateSquare(int row, int col) {
		square.setUnMarked();
	}  
	
	/**
	 * Sets the number of moves.
	 * @return 
	 */
	public void setNumMoves(int moves) {
		this.numMoves = moves;
	}
	  
	/**
	 * Returns a single tile.
	 * @return square
	 */
	public Tile getTile() {
		return tile;
	}

	/**
	 * Sets a single tile.
	 * @return  
	 */
	public void setTile(Tile tile) {
		this.tile = tile;
	}

	
	/**
	 * Sets the difficulty.
	 * @return  
	 */
	public void setDiff(int difficulty) {
		this.difficulty = difficulty;
	}
	
	/**
	 * Sets the number of stars.
	 * @return  
	 */
	public void setStars(int stars) {
		this.numStars = stars;
	}

	/**
	 * Returns the level number.
	 * @return int
	 */
	public int getNum() {
		return num;
	}

	/**
	 * Sets the level number.
	 * @return  
	 */
	public void setNum(int num) {
		this.num = num;
	}
	
	/**
	 * Sets the tile frequency array.
	 * @param index
	 * @param num
	 */
	public void setFreq(int index, int num){
		this.frequency[index] = num;
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
	
	public int getPercentTile(int[] percents, int index){
		return percents[index];
	}
	
	/**
	 * Obtains the frequency JTextfields and adds to the frequency array.
	 * @param text_1
	 * @param text_2
	 * @param text_3
	 * @param text_4
	 * @param text_5
	 * @param text_6
	 * @return int[]
	 */
	public int[] toFrequency(JTextField text_1, JTextField text_2,
			JTextField text_3, JTextField text_4, JTextField text_5,
			JTextField text_6) {
		
			String text1 = text_1.getText();
			frequency[1]= Integer.parseInt(text1);
			String text2 = text_1.getText();
			frequency[2]= Integer.parseInt(text2);
			String text3 = text_1.getText();
			frequency[3]= Integer.parseInt(text3);
			String text4 = text_1.getText();
			frequency[4]= Integer.parseInt(text4);
			String text5 = text_1.getText();
			frequency[5]= Integer.parseInt(text5);
			String text6 = text_1.getText();
			frequency[6]= Integer.parseInt(text6);
			
		
		return frequency;
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
	
//	/**
//	 * Obtains the numerical value from a given text field. Converts String to int.
//	 * @param field
//	 * @return int
//	 */
//	public int getNumber(JTextField field){
//		String text = field.getText();
//		int num = Integer.parseInt(text);
//		return num;		
//	}
	
	/**
	 * Obtain the value from a text field in the Configuration form.
	 * @param JTextField
	 * @return int level number
	 */
	public int getField(JTextField t){
		String text = t.getText();
		int num = Integer.parseInt(text);
		return num;
	}



	public void setPuzzle() {
		name = "Puzzle";		
	}
	
	public void setLight() {
		name = "Lightning";		
	}
	
	public void setElim() {
		name = "Elimination";		
	}
	
	public void setRelease() {
		name = "Release";		
	}
	
}


