import java.util.ArrayList;

import java.util.Iterator;

public class IterateElelementInHashList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to iterate through all elements in a hash list.
		
		
		// Create a empty hash set
		ArrayList<String> zoo = new ArrayList<String>();
		
		// use add() method to add values in the hash set
	      zoo.add("Zebra");
	      zoo.add("Lion");
	      zoo.add("Tiger");
	      zoo.add("Lema");
	      
	   // set Iterator
	      Iterator <String> p = zoo.iterator();
	   // Iterate the hash set
	      while(p.hasNext()) {
	      System.out.println(p.next());
	      }
	}

}
