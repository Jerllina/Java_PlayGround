import java.util.Scanner;

public class InchesToMeters {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		//hint for input
		System.out.println("Input a value for inches: ");
		//read input double floating number
		double inch=input.nextDouble();
		//transfer inch to meter,do not forget the data type
		double meter=inch*0.0254;
		//print the result
		System.out.println(inch + " inches is " + meter + " meters");
	}

}
