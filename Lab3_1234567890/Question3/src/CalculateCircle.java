import java.util.Scanner;

public class CalculateCircle {
    
	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		//get a float number
		System.out.print("Input a value for radius:");
		double radius=in.nextDouble();
		
		//compute perimeter
        double perimeter = 2 * Math.PI * radius;
        //compute area
        double area = Math.PI * radius * radius;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
