import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		// set value of "number"
		Scanner in =new Scanner(System.in);
		
		System.out.print("Input the number : ");
		int number=in.nextInt();
		//System.out.println("The number is " + number);

		if(number % 2 == 1) { // odd
			System.out.println("Odd Number");
		} else {
			System.out.println("Even Number");
		}
		System.out.println("BYE!");
	}


}
