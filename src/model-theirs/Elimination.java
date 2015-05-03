package model;


/**
 * Creates an Elimination Level.
 * 
 * @author Liz Miller & npmahowald
 *
 */
public class Elimination extends Level {
	private String levelType;
	private int[] starThreshold;
	private int movesLeft;
	private int eliminateTilesLeft = 3;
	private int swapTilesLeft = 3;
	
	public Elimination(int[] starThreshold, int eliminateTilesLeft, int swapTilesLeft){
		super(starThreshold);
		this.levelType = "Elimination";
		this.movesLeft = 0;
		super.getBoard().markAll();
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

	public void decreaseMovesLeft(){
		movesLeft++;
		
	}
	public int getMovesLeft(){
		return movesLeft;
	}
	
	public boolean endGame(){
		for (int r = 0; r < super.getBoard().boardHW; r++) {
			for (int c = 0; c < super.getBoard().boardHW; c++) {
				if(super.getBoard().getSquare(r, c).isMarked()) return false;
				
			}
		}
		return true;
	}


	public int getNumMoves() {
		// TODO Auto-generated method stub
		return movesLeft;
	}
}
