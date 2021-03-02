
public class sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Use a while loop to add up the numbers 1 to 20 into one variable.
		// Print out the sum at the end
		
		int num = 20, i = 1, sum = 0;

        while(i <= num)
        {
            sum += i;
            i++;
            System.out.println(sum);
        }
        System.out.println();
        System.out.println("Sum = " + sum);
	}
}
