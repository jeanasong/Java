import java.util.ArrayList;
import java.util.Collections;

//import com.sun.tools.javac.util.List;

public class CopyOneArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a Java program to copy one array list into another
		
		ArrayList<String> zoo = new ArrayList<String>();
	      zoo.add("Zebra");
	      zoo.add("Lion");
	      zoo.add("Tiger");
	      ArrayList<String> list = new ArrayList<String>();
	      list.add("Hello");
	      list.add("Hi");
	      list.add("World");
	      Collections.copy(list,zoo); // copying the ArrayList zoo to the ArrayList list
	      System.out.println(list);
		

	}

}
