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


