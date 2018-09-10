
import java.util.Scanner;
import java.util.Formatter;
import java.io.File;
import java.io.IOException;

public class FileIOTest {

	public static void main(String[] args) throws IOException{
	
		Scanner in=new Scanner(new File("FileIOTest.in"));	//file input
		Formatter out=new Formatter(new File("FileIOTest.out"));	//file output
		
		int a=in.nextInt();
		int b=in.nextInt();
		out.format("%d\n", a+b);	//format() has the same syntax as printf()
		
		out.close();		//flush the output and close the output file
	}

}
