package controller;

import view.Configuration;

import controller.Serializer;

import model.Level;
import SixesWild.model.Level;
import SixesWild.model.Lightning;
import SixesWild.model.Puzzle;
import SixesWild.model.Release;
import SixesWild.model.Square;
import SixesWild.model.Elimination;


public class LevelBuilder {
	Configuration config;
	private static Level l;
	
	public static void main(String[] args) {
		int[] starThresholds = {l.getSingleStar(l, 0), l.getSingleStar(l, 1), l.getSingleStar(l, 2)};
		int[] multWeight = {l.getSingleMult(l, 0), l.getSingleMult(l,1), l.getSingleMult(l, 2)};
		int[] valWeight = {l.getFreq(l, 0), l.getFreq(l,1), l.getFreq(l, 2)};
		int type = l.getType();
		int num = l.getNum();
		
		if (type == 2){
			l = new Lightning(30, starThresholds, valWeight, multWeight, 3, 3, num);			
		}else if(type == 3){
			l = new Elimination(starThresholds, valWeight, multWeight, 3, 3, num);
		} else  if(type == 4){
			l = new Release(30, starThresholds, valWeight, multWeight, 3, 3, num);
		} else{
			l = new Puzzle(30, starThresholds, valWeight, multWeight, 3, 3, num);
		}
		
		for(int i = 0; i < 9; i++){
			l.getBoard().setSquare(new Square(0,i,1));
		}
		for(int i = 0; i < 9; i++){
			l.getBoard().setSquare(new Square(8,i,1));
		}
		for(int i = 0; i < 9; i++){
			l.getBoard().setSquare(new Square(1,i,1));
		}
		for(int i = 0; i < 9; i++){
			l.getBoard().setSquare(new Square(7,i,1));
		}
				
		Serializer serializer = new Serializer();
		serializer.serializeLevel(l, num);
	}

}