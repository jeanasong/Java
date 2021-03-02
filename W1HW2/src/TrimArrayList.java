import java.util.ArrayList;

public class TrimArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a Java program to trim the capacity of an 
		// array list the current list size
		
		ArrayList<String> zoo = new ArrayList<String>();
	      zoo.add("Zebra");
	      zoo.add("Lion");
	      zoo.add("Tiger");
	      System.out.println("Original array list: " + zoo);
          System.out.println("Let trim to size the above array: ");
          zoo.trimToSize();
          System.out.println(zoo);

	}
}
