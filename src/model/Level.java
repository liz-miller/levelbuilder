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
	private int[][] arraySquares = new int[9][9];
	private Tile tile;
	private int numMoves;
	private int numStars[] = new int[3];
	protected int difficulty;
	private int frequency[] = new int[6];
	private int multipliers[] = new int [3];
	private int type;
	private String name;
	private int time;
	
	public Level(){
		this.setNum(num);
		this.setSquare(square);
		this.setTile(tile);
		this.setNumMoves(numMoves);
		this.setStars(numStars[0], numStars[1], numStars[2]);
		this.setDiff(difficulty);
		this.setTime(time);
		this.setMultipliers(multipliers[0], multipliers[1], multipliers[2]);
		this.setType(type);
		this.setArraySquares(arraySquares);
		this.setFreq(frequency);
		}

	
	/**
	 * Sets the frequency array.
	 * @param freq
	 */
	public void setFreq(int freq[]){
		this.frequency = freq;
	}
	
	/**
	 * Sets a 9x9 array of squares.
	 * @param arraySquares
	 */
	private void setArraySquares(int[][] arraySquares) {
		this.arraySquares = arraySquares;
		
	}

	/**
	 * Sets the numerical type of the level.
	 * @param type
	 */
	public void setType(int type) {
		this.type = type;
		
	}

	/**
	 * Gets the numerical type of the level.
	 * @return
	 */
	public int getType(){
		return this.type;
	}

	/**
	 * Sets the given square equal to the current square.
	 * @param square
	 */
	public void setSquare(Square square) {
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
		System.out.println("getNumMoves reading = " + l.numMoves);
		return l.numMoves;
		
	}
	
	/**
	 * Returns the number of stars of a level.
	 * @param Level l
	 * @return
	 */
	public int[] getNumStars(Level l){
		return l.numStars;
	}
	
	public int getSingleStar(Level l, int index){
		return l.numStars[index];
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
	 * Returns the whole array of tile percentages.
	 * @param percents
	 * @param index
	 * @return
	 */
	public int getFreq(Level l, int index){
		return frequency[index];
	}
	
	/**
	 * Calculates and adds the the percentage occurrence of each numbered tile to the frequency array.
	 * @param ones
	 * @param twos
	 * @param threes
	 * @param fours
	 * @param fives
	 * @param sixes
	 */

	public void toFrequency(JTextField text_1, JTextField text_2,
			JTextField text_3, JTextField text_4, JTextField text_5,
			JTextField text_6) {
		
			double text1 = getField(text_1);
			double text2 = getField(text_2);		
			double text3 = getField(text_3);			
			double text4 = getField(text_4);			
			double text5 = getField(text_5);			
			double text6 = getField(text_6);			
			
			double sum = text1 + text2 + text3 + text4 + text5 + text6;
			
			text1 = text1/sum*100;
			text2 = text2/sum*100;
			text3 = text3/sum*100;
			text4 = text4/sum*100;
			text5 = text5/sum*100;
			text6 = text6/sum*100;
			
			int t1 = (int) text1;
			int t2 = (int) text2;
			int t3 = (int) text3;
			int t4 = (int) text4;
			int t5 = (int) text5;
			int t6 = (int) text6;
			
			setFreq(0,t1);
			setFreq(1,t2);
			setFreq(2,t3);
			setFreq(3,t4);
			setFreq(4,t5);
			setFreq(5,t6);			
	}
	
	/**
	 * Updates the multiplier values based on input.
	 * @param x1
	 * @param x2
	 * @param x3
	 */
	public void updateMultipliers(JTextField x1, JTextField x2, JTextField x3){
		double mult1 = getField(x1);
		double mult2 = getField(x2);
		double mult3 = getField(x3);
		
		double sum = mult1 + mult2 + mult3;
		
		mult1 = mult1/sum*100;
		mult2 = mult2/sum*100;
		mult3 = mult3/sum*100;

		int m1 = (int) mult1;
		int m2 = (int) mult2;
		int m3 = (int) mult3;
		
		setMultipliers(m1, m2, m3);
		
//		System.out.println("mult1 = " + m1);
//		System.out.println("mult2 = " + m2);
//		System.out.println("mult3 = " + m3);

	}
	/**
	 * Sets the multiplier frequencies for a level.
	 * @param ones
	 * @param twos
	 * @param threes
	 * @return int[] multipliers
	 */
	public void setMultipliers(int ones, int twos, int threes){
		this.multipliers[0] = ones;
		this.multipliers[1] = twos;
		this.multipliers[2] = threes;

	}
	
	/**
	 * Gets a single multiplier from a level and index.
	 * @param l
	 * @param index
	 * @return
	 */
	public int getSingleMult(Level l, int index){
		return l.multipliers[index];
	}
	
	
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


	public void setTime(int time) {
		this.time = time;
		
	}

	/**
	 * Sets the number of stars.
	 * @return  
	 */
	public void setStars(int stars1, int stars2, int stars3) {
		this.numStars[0]=stars1;
		this.numStars[1]=stars2;
		this.numStars[2]=stars3;		
	}


	public int[] getMultipliers(Level l) {
		return l.multipliers;
	}
	
}


