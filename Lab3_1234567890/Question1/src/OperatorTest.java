import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) { 
		Scanner in= new Scanner(System.in);
		
		System.out.print("Input first number:");
		int num1=in.nextInt();
		
		System.out.print("Input second number:");
		int num2=in.nextInt();
		
		//addition
		int summ=num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + summ);
		
		//subtract
		int subb=num1 - num2;
		System.out.println(num1 + " - " + num2 + " = " +subb);
		
		//multiply
		int mull=num1 * num2;
		System.out.println(num1 + " x " + num2 + " = " + mull);
		
		//divide
		int divv=num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + divv);
		
		//remainder
		int remm=num1 % num2;
		System.out.println(num1 + " mod " + num2 + " = " + remm);
	}

}
