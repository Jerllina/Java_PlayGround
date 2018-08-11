package JavaAPItest;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//字符流 缓存流  处理

public class FileToUnicode {
	public static void main(String[] args) {
		try {
			FileInputStream fis=new FileInputStream("file1.txt");
			InputStreamReader dis=new InputStreamReader(fis);
			BufferedReader reader=new BufferedReader(dis);
			String s;
			//每次读取一行 该行为空时结束
			while((s=reader.readLine())!=null) {
				System.out.println("read:"+s);
			}
			dis.close();
		}
		catch(IOException e) {
			System.out.println(e);
		}
	}
}
