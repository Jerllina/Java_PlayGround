import java.util.Scanner;

public class SwapIntegers {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		
		System.out.print("Input value of a:");
		int a=in.nextInt();
		
		System.out.print("Input value of b:");
		int b=in.nextInt();
		
		//Initialize a variable named "temp" for swapping
		int temp;
		
		System.out.println("Before swapping: a,b= " +a+" , "+b);
		
		//swap the values
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping: a,b= " +a+" , "+b);
	}

}
