import java.util.Scanner;

public class DecToBinary {

	public static void main(String[] args) {
		int dec_num,rem,quot,i=1,j;
		int bin_num[] = new int[100];
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Input a Decimal Number : ");
        dec_num = scan.nextInt();
		
        //dec to binary,method1:
        quot = dec_num;
		
        while(quot != 0)
        {
            bin_num[i++] = quot%2;
            quot = quot/2;
        }
		
        System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
        
        //dec to binary,method2
		String bin_num2 = Integer.toBinaryString(dec_num);
		System.out.println("Binary number is: " + bin_num2);
		
		
		System.out.print("The reverse order of it is: ");
		
		//get the length of the binary number
		int length = bin_num2.length();
		//bitwise method to get the reverse
		for (int k = 0;k<length;k++) {
			int rev_bin = (dec_num&(1<<k))>>k;//get every bit of the input and print it out
			System.out.print(rev_bin);//print the reverse of the binary number
        

        }
	}

}
