import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		//hint for input
		System.out.println("Input an integer between 0 and 1000: ");
		//read the input integer
		int num = input.nextInt();
		//obtain the last digit
		int firstDigit = num % 10;
		//obtain other digits
		int remainingNumber = num / 10;
		int SecondDigit = remainingNumber%10;
		remainingNumber = remainingNumber/10;
	    int thirdDigit = remainingNumber%10;
	    remainingNumber = remainingNumber/10;
	    int fourthDigit = remainingNumber%10;
	    //as the integer ranges between 0 and 1000 ,it has four digits as maximum as possible.
	    //add the digits & print the result
	    int sum = thirdDigit + SecondDigit + firstDigit + fourthDigit;
	    System.out.println("The sum of all digits in " + num + " is " + sum);
	}
		
}
