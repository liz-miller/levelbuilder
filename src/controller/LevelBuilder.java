package controller;

import SixesWildGame.model.Elimination;
import SixesWildGame.model.Lightning;
import SixesWildGame.model.Puzzle;
import SixesWildGame.model.Release;
import SixesWildGame.model.Square;
import view.Configuration;
import controller.Serializer;



public class LevelBuilder {
	Configuration config;
	private static model.Level l;
	
	public static void main(String[] args) {
		int[] starThresholds = {l.getSingleStar(l, 0), l.getSingleStar(l, 1), l.getSingleStar(l, 2)};
		int[] multWeight = {l.getSingleMult(l, 0), l.getSingleMult(l,1), l.getSingleMult(l, 2)};
		int[] valWeight = {l.getFreq(l, 0), l.getFreq(l,1), l.getFreq(l, 2)};
		int type = l.getType();
		int num = l.getNum();
		Lightning lightLevel = null;
		Elimination elimLevel = null;
		Release reLevel = null;
		Puzzle puzzLevel = null;
		
		if (type == 2){
			lightLevel = new Lightning(30, starThresholds, valWeight, multWeight, 3, 3, num);			
		}else if(type == 3){
			elimLevel = new Elimination(starThresholds, valWeight, multWeight, 3, 3, num);
		} else  if(type == 4){
			reLevel = new Release(30, starThresholds, valWeight, multWeight, 3, 3, num);
		} else{
			puzzLevel = new Puzzle(30, starThresholds, valWeight, multWeight, 3, 3, num);
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
		serializer.serializeLevel(l, num);
	}

}