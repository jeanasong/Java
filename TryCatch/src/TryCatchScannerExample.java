import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatchScannerExample {
	// ask a user what is your favorite number
	// if user input anything but a number give a prompt to the user

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What is your favorite number?");
		
		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();
//		System.out.println(number);
		
		try {
			int number = scan.nextInt();
			System.out.println(number);
		}catch(InputMismatchException e){
			System.out.println("You must enter a number please!");
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("This is a finally statement");
		}

	}

}
