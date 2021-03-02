import java.util.ArrayList;

public class CovertHashSetToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a empty hash set
		
		ArrayList<String> zoo = new ArrayList<String>();
				
		// use add() method to add values in the hash set
			    zoo.add("Zebra");
			    zoo.add("Lion");
			    zoo.add("Tiger");
			    zoo.add("Lema");
			      
			System.out.println("Original Hash Set: " + zoo);
			 // Creating an Array
			 String[] new_array = new String[zoo.size()];
			  zoo.toArray(new_array);
			      
			   // Displaying Array elements
			   System.out.println("Array elements: ");
			    for(String element : new_array){
			      System.out.println(element);
		}
	}

}
