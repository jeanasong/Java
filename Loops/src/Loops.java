
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Using a while loop, 
		//print each char of a string ‘Hello World’
		
		String name = "Hello World";
		int i = 0;
		
		while(i < name.length()) {
			System.out.println(name.charAt(i++));
		}
		
	}

}
