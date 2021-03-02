
public class TimeDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Write a java  program that displays "Good Morning" if time is between 5AM-11:59*/
		
		String time = "21PM";
		switch (time) {
			case "5AM":
			case "6AM":
			case "7AM":
			case "8AM":
			case "9AM":
			case "10AM":
			case "11AM":
				
				System.out.println("Good Morning");
				break;
			case "12PM":
			case "13PM":
			case "14PM":
			case "15PM":
			case "16PM":
				System.out.println("Good Afernoon");
				break;
				
			default:
				System.out.println("Hey there");
				break;
		}
	}
}
