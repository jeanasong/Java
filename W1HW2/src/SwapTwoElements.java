import java.util.ArrayList;


public class SwapTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a Java program of swap two elements in an array list
		
		ArrayList<String> zoo = new ArrayList<String>();
	      zoo.add("Zebra");
	      zoo.add("Lion");
	      zoo.add("Tiger");
	      zoo.add("Hippo");
	      zoo.add("Road Runner");
	      zoo.add("Grass Hopper");
	     
	      System.out.println(zoo);
	      
	      zoo.set(2,"Zebra");
	      zoo.set(0, "Tiger");
	      System.out.println(zoo);

	}

}
