/* Building a basic calculator.
 I will use classes, methods, and objects to create a simple arithmetic calculator. 
 The calculator will be able to:

Add two integers
Subtract two integers
Multiply two integers
Divide two integers
Apply the modulo operator on two integers
 */

// One way to improve the program is by adding a double method.

public class Calculator {
	public Calculator() {
		
	}
	public int add(int a, int b) {
		//Add two integers
		return a + b;
	}
	public int subtract(int a, int b) {
		//Subtract two integers
		return a - b;
	}
	public int multiply(int a, int b) {
		//Multiply two integers
		return a * b;
	}
	public int divide(int a, int b) {
		//Divide two integers
		return a / b;
	}
	public int modulo(int a, int b) {
		//Apply the modulo operator on two integers
		return a % b;
	}
	public static void main(String[] args) {
		Calculator myCalculator = new Calculator();
		System.out.println(myCalculator.add(5, 7));
		System.out.println(myCalculator.subtract(45, 11));
		System.out.println(myCalculator.multiply(50, 6));
		System.out.println(myCalculator.divide(36, 4));
		System.out.println(myCalculator.modulo(3, 2));
	}
}