package controller;


/** 
 * Example of restoring objects from a save file.
 * @author Mark Graybill
 * @author Liz Miller
 * Modified from A Beginning Programmer's Guide to Java
 *  http://beginwithjava.blogspot.com/
 */

import java.io.*;
import java.util.ArrayList;

public class Open{

	public static void main(String[] arg){

		// Create the data objects for us to restore.
		boolean powerSwitch=false;
		int x=0, y=0, z=0;
		String name="", setting="", plant="";
		ArrayList<String> stuff = new ArrayList<String>();
		
		// Wrap all in a try/catch block to trap I/O errors.
		try{
			// Open file to read from, named SavedObjects.sav.
			FileInputStream saveFile = new FileInputStream("SavedObjects.sav");

			// Create an ObjectInputStream to get the objects from the save file.
			ObjectInputStream save = new ObjectInputStream(saveFile);

			// Now we do the restore.
			// readObject() returns a generic Object, we cast those back
			// into their original class type.
			// For primitive types, we use the corresponding reference class.
			powerSwitch = (Boolean) save.readObject();
			x = (Integer) save.readObject();
			y = (Integer) save.readObject();
			z = (Integer) save.readObject();
			name = (String) save.readObject();
			setting = (String) save.readObject();
			plant = (String) save.readObject();  
			stuff = (ArrayList<String>) save.readObject();

			// Close the file.
			save.close(); // This also closes saveFile.
		}
		catch(Exception exc){
			exc.printStackTrace(); // If there was an error, print the info.
		}

		// Print the values, to see that they've been recovered.
		System.out.println("\nRestored Object Values:\n");
		System.out.println("\tpowerSwitch: " + powerSwitch);
		System.out.println("\tx=" + x + " y=" + y + " z=" + z);
		System.out.println("\tname: " + name);
		System.out.println("\tsetting: " + setting);
		System.out.println("\tplant: " + plant);
		System.out.println("\tContents of stuff: ");
		System.out.println("\t\t" + stuff);
		System.out.println();

		// All done.
	}
}
