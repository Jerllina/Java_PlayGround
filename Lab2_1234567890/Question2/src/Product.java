import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		//hint for input
		System.out.println("Input first number: ");
		//read 1st input integer
		int fir=in.nextInt();
		//hint for input
		System.out.println("Input second number: ");
		//read 2nd input integer
		int sec=in.nextInt();
		//compute the product,be careful about the data type! 
		int pro=fir*sec;
		//display the product of 2 numbers
		System.out.println(fir+" x "+sec+" = "+pro);
		
	}

}
