package JavaAPItest;

import java.io.*;

//±ê×¼Á÷test
public class StandardIOtest {
	public static void main(String[] args) {
		FileInputStream f1,f2;
		String s;
		try {
			f1 = new FileInputStream("file1.txt");
			f2 = new FileInputStream("file2.txt");
			SequenceInputStream fs = new SequenceInputStream(f1,f2);
			DataInputStream ds = new DataInputStream(fs);
			while((s = ds.readLine()) != null) {
				System.out.println(s);
			}
		}finally {

		}
	}

}
