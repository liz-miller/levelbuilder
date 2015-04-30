package model;

/**
 * Creates a Release Level.
 * 
 * @author Liz Miller
 *
 */
public class Release extends Level{
	private int num;
	private Square squares[][]; //row, col
	//private Tile tiles[];
	private int numMoves;
	private int numStars;
	private int difficulty;
	
	public Release(){
		this.setNum(num);
		this.setSquares(squares);
		//this.tiles = tiles;
		this.setNumMoves(numMoves);
		this.setNumStars(numStars);
		this.setDifficulty(difficulty);	
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

	public int getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(int difficulty) {
		this.difficulty = difficulty;
	}

	public int getNumStars() {
		return numStars;
	}

	public void setNumStars(int numStars) {
		this.numStars = numStars;
	}

	public int getNumMoves() {
		return numMoves;
	}

	public void setNumMoves(int numMoves) {
		this.numMoves = numMoves;
	}

	public Square[][] getSquares() {
		return squares;
	}

	public void setSquares(Square squares[][]) {
		this.squares = squares;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
