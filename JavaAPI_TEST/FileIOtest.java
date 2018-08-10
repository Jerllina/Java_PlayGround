package JavaAPItest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//�ļ���test��FileInputStream �� FileOutputStream
public class FileIOtest {
	public static void main(String[] args) {
		try {
			//infile ��Ϊ�������������ļ�������� �����׳��쳣
			File inFile=new File("/Users/lijie/Documents/file1.txt");
			//file2.txtû�У�ϵͳ���Դ�������workspace��Test��Ŀ�¿����ҵ�
			File outFile=new File("file2.txt");
			FileInputStream fis=new FileInputStream(inFile);
			FileOutputStream fos=new FileOutputStream(outFile);
			int c;
			while((c=fis.read())!=-1) {
				fos.write(c);
			}
			//���ļ���Ҫ�ǵù�
			fis.close();
			fos.close();
		}catch(FileNotFoundException e) {
			System.out.println("FileStreamsTest:" +e);
		}catch(IOException e) {
			System.err.println("FileStreamTest:" +e);
		}
	}

}
