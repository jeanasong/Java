import java.util.ArrayList;

import java.util.List;

public class ExtractPortionOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		// TODO Auto-generated method stub
		
		// Write a Java program to extract a portion of a array list
		
		 al.add("Steve");
	     al.add("Justin");
	     al.add("Ajeet");
	     al.add("John");
	     al.add("Arnold");
	     al.add("Chaitanya");

	     System.out.println("Original ArrayList Content: "+al);

	     //Sublist to ArrayList
	     ArrayList<String> al2 = new ArrayList<String>(al.subList(1, 4));
	     System.out.println("SubList stored in ArrayList: "+al2);

	     //Sublist to List
	     List<String> list = al.subList(1, 4);
	     System.out.println("SubList stored in List: "+list);
		

	}

}
