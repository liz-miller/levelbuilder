package controller;

import java.io.FileOutputStream;

import model.Level;

import java.io.ObjectOutputStream;
 
public class Serializer {
 
	/*
   	public static void main (String args[]) {
 
	   Serializer serializer = new Serializer();
	   serializer.serializeLevel(levelName);
   	}
	*/
 
	public void serializeLevel(Level level, int lvlnum){
 
		try{
 
			FileOutputStream fout = new FileOutputStream("./level/level"+lvlnum+".ser");
			ObjectOutputStream oos = new ObjectOutputStream(fout);   
			oos.writeObject(level);
			oos.close();
			System.out.println("Done");
 
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}