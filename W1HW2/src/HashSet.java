import java.util.ArrayList;

public class HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> zoo = new ArrayList<String>();
	      zoo.add("Zebra");
	      zoo.add("Lion");
	      zoo.add("Tiger");
	      
	    //Print the HashSet Values
	      System.out.println("HashSet Elements");
	      
	    //Check for the empty set 
	      System.out.println("Is the set elements: " +zoo.isEmpty());
	      
	    //Clearing the set and Check for the empty set
	      zoo.clear();  
          System.out.println("Is the set empty: "+zoo.isEmpty()); 

	}

}
