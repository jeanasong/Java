/* Finding prime numbers is a common technical challenge in programming interviews.
As it happens, Java loops are a great tool to help you do this!
A prime number is an integer greater than 1 that is only divisible by 1 and itself.
For example, 2, 3, 5, and 7 are all prime numbers, but 4, 6, 8, and 9 are not. 
 */

import java.util.ArrayList;

public class PrimeDirective {
	
	
	public boolean isPrime(int number){
	    if(number == 2){
	      return true;
	    }
	    else if(number < 2){
	      return false;
	    }

	    for(int i = 2; i < number; i++){
	      if(number % i == 0){
	        return false;
	      }
	    }
	      return true;
	  }

	  public ArrayList<Integer> onlyPrimes(int[] numbers){
	    ArrayList<Integer> primes = new ArrayList<Integer>();
	    for(int number : numbers) {
	      if(isPrime(number)){
	        primes.add(number);
	      }
	    }
	    return primes;
	  }
	  
	  public static void main(String[] args) {

	    PrimeDirective pd = new PrimeDirective();
	    int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
	    System.out.println(pd.isPrime(7));
	    System.out.println(pd.onlyPrimes(numbers));
	  }
	}