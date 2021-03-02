import java.util.ArrayList;

public class ReplaceSecondElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Write a Java program to replace the second element
		// of a ArrayList with the specified element.		
		
		ArrayList<String> zoo = new ArrayList<String>();
	      zoo.add("Zebra");
	      zoo.add("Lion");
	      zoo.add("Tiger");
	      zoo.add("Hippo");
	      zoo.add("Road Runner");
	      zoo.add("Grass Hopper");
	      
	      System.out.println(zoo);
	      
//	      zoo.set(1, "Blockchain");
	      replaceSecond("Blockchain", zoo);
	      
	      System.out.println(zoo);
	}
	
	public static void replaceSecond(String replacement, ArrayList<String>list) {
		list.set(1, replacement);
	}

}
