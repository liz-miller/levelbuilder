 package model;

/**
 * Creates a generic level for Sixes' Wild West.
 * @author Liz Miller
 */

//STATUS: needs body method implementations. Last modified: 4/26

public class Level {
//	private int num;
//	private Square square[][];
//	private Tile tile;
//	private int numMoves;
//	private int numStars;
//	protected int difficulty;
	
	public Level(){}
//		this.setNum(num);
//		this.setSquare(square);
//		this.setTile(tile);
//		this.numMoves = numMoves;
//		this.numStars = numStars;
//		this.difficulty = difficulty;	
	
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
	 * Generates tiles. Override for specific level functionality.
	 * @param levelType
	 */
	public void generateTiles(){
		
	}
	

//	/**
//	 * Returns the number of moves of a level.
//	 * @param Level l
//	 * @return
//	 */
//	public int getNumMoves(Level l){
//		return l.numMoves;
//	}
//	
//	/**
//	 * Returns the number of stars of a level.
//	 * @param Level l
//	 * @return
//	 */
//	public int getNumStars(Level l){
//		return l.numStars;
//	}
//	
//	/**
//	 * Returns the difficulty of a level.
//	 * @param Level l
//	 * @return
//	 */
//	public int getDifficulty(Level l){
//		return l.difficulty;
//	}
//
//	/**
//	 * Returns the row/column 2D array of a single square.
//	 * @return square
//	 */
//	public Square[][] getSquares() {
//		return square;
//	}
//	
//	/**
//	 * Sets the row/column 2D array of a single square.
//	 * @return 
//	 */
//	public void setSquare(Square square[][]) {
//		this.square = square;
//	}
//	
//	/**
//	 * Returns a single tile.
//	 * @return square
//	 */
//	public Tile getTile() {
//		return tile;
//	}
//
//	/**
//	 * Sets a single tile.
//	 * @return  
//	 */
//	public void setTile(Tile tile) {
//		this.tile = tile;
//	}
//
//	/**
//	 * Returns the level number.
//	 * @return int
//	 */
//	public int getNum() {
//		return num;
//	}
//
//	/**
//	 * Sets the level number.
//	 * @return  
//	 */
//	public void setNum(int num) {
//		this.num = num;
//	}
//	
	
	
}


