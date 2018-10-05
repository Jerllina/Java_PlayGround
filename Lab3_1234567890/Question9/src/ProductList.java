import java.util.Scanner;

public class ProductList {

	public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
		   
		  System.out.print("Input a number: ");
		  int num = in.nextInt();
		  
		  //loop to print 
		  for (int i=0; i< 10; i++){
			  int mul=num * (i+1);
		   System.out.println(num + " x " + (i+1) + " = " +mul);
		  }
	}

}
