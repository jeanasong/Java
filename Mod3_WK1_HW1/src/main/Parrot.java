package main;

public class Parrot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getUp(true, 2));
	}
		// getUp method
		public static boolean getUp(boolean squawking, int currentHour ) {
			if(currentHour < 0 || currentHour > 23) {
				return false;
			}
		 if(squawking && currentHour < 6) {
			return true;
		} else if (squawking && currentHour < 22) {
			return true;
		} else {
			return false;
		}

	}

}
