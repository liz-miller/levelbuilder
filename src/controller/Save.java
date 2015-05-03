package controller;

/** An example of saving Serializable objects to a file.
* @author Mark Graybill
* @author Liz Miller
* Modified from A Beginning Programmer's Guide to Java
* http://beginwithjava.blogspot.com/
*/

import java.io.*;
import java.util.ArrayList;

public class Save{

	public static void main(String[] arg){

		// Create some data objects for us to save.
		boolean powerSwitch=true;
		int x=9, y=150, z= 675;
		String name="Galormadron", setting="on", plant="rutabaga";
		ArrayList<String> stuff = new ArrayList<String>();
		stuff.add("One");
		stuff.add("Two");
		stuff.add("Three");
		stuff.add("Four");
		stuff.add("Five");
		
		

		try{
			// Open a file to write to, named SavedObjects.sav.
			FileOutputStream saveLevel = new FileOutputStream("SavedObjects.sav");

			// Create an ObjectOutputStream to put the objects into the save file.
			ObjectOutputStream save = new ObjectOutputStream(saveLevel);

			// Now we do the save.
			save.writeObject(powerSwitch);
			save.writeObject(x);
			save.writeObject(y);
			save.writeObject(z);
			save.writeObject(name);
			save.writeObject(setting);
			save.writeObject(plant);
			save.writeObject(stuff);

			// Close the file.
			save.close(); // This also closes saveFile.
		}
		catch(Exception exc){
			exc.printStackTrace(); // If there was an error, print the info.
		}
	}
}
