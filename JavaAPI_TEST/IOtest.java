package JavaAPItest;

//����test��InputStream �� OutputStream

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
public class IOtest {
	//�����������������ݸ�ֵ�������
	public void copy(InputStream in,OutputStream out) throws IOException{
		byte[] buf=new byte[4096];
		int len=in.read(buf);
		//read һ���ֽ�һ���ֽڵض� �ֽ�����β��־��-1
		while(len!=-1) {
			out.write(buf,0,len);
			len=in.read(buf);
		}
	}
	
	public static void main(String[] args) throws IOException{
		IOtest t=new IOtest();
		System.out.println("�����ַ���");
		t.copy(System.in, System.out);
	}
}
