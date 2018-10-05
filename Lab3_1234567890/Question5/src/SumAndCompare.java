import java.util.*;

public class SumAndCompare {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		
		System.out.print("Input the first number : ");
		int x1=in.nextInt();
		System.out.print("Input the second number : ");
		int x2=in.nextInt();
		System.out.print("Input the third number : ");
		int x3=in.nextInt();
		
		//judge if  the sum is equal to a third integer.
		boolean res= ((x1 + x2) == x3 || (x2 + x3) == x1 || (x3 + x1) == x2);
		System.out.print("The result is: "+res);

	}

}
