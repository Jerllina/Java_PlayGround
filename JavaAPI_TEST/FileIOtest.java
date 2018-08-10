package JavaAPItest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//文件流test：FileInputStream 和 FileOutputStream
public class FileIOtest {
	public static void main(String[] args) {
		try {
			//infile 作为输入流的数据文件必须存在 否则抛出异常
			File inFile=new File("/Users/lijie/Documents/file1.txt");
			//file2.txt没有，系统可以创建，在workspace的Test项目下可以找到
			File outFile=new File("file2.txt");
			FileInputStream fis=new FileInputStream(inFile);
			FileOutputStream fos=new FileOutputStream(outFile);
			int c;
			while((c=fis.read())!=-1) {
				fos.write(c);
			}
			//打开文件后要记得关
			fis.close();
			fos.close();
		}catch(FileNotFoundException e) {
			System.out.println("FileStreamsTest:" +e);
		}catch(IOException e) {
			System.err.println("FileStreamTest:" +e);
		}
	}

}
