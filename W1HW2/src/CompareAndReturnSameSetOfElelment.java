import java.util.ArrayList;

public class CompareAndReturnSameSetOfElelment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a empty hash set
        ArrayList<String> h_set1 = new ArrayList<String>();
     // use add() method to add values in the hash set
          h_set1.add("Red");
          h_set1.add("Green");
          h_set1.add("Black");
          h_set1.add("White");
          System.out.println("Frist HashSet content: "+h_set1);
          ArrayList<String>h_set2 = new ArrayList<String>();
          h_set2.add("Red");
          h_set2.add("Pink");
          h_set2.add("Black");
          h_set2.add("Orange");
          System.out.println("Second HashSet content: "+h_set2);
          h_set1.retainAll(h_set2);
          System.out.println("HashSet content:");
          System.out.println(h_set1);

	}

}
