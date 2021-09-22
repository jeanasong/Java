/* This program calculates a car loan for whoever wants one of those just like you want to buy a car at a dealer
 * you need to know the how much car loan you need, the length you want to pay in years, 
 * the interest rates of the loan and the down payment of the car.
*/

public class CarLoan {
	public static void main(String[] args) {
    int carLoan = 10000;
    int loanLength = 3; // loan length of 3 years
    int interestRates = 5; //interest rate of 5% on the loan
    int downPayment = 2000; // down payment

    if(loanLength <= 0 || interestRates <= 0) {
      System.out.println("Error! You must take out a valid car loan.");
    } else if (downPayment >= carLoan){
      System.out.println("The car can be paid in full");

    } else {
      int remainingBalance = carLoan - downPayment;
      int months = loanLength * 12;
      int monthlyBalance = remainingBalance / months;
      int interest = monthlyBalance * interestRates / 100;
      int monthlyPayment = monthlyBalance + interest;
      System.out.println(monthlyPayment);
    }

	}
}