package JavaAPItest;

import java.io.*;

//������test��BufferedInputStream �� BufferedOutputStream
public class BufferIOtest {
	/*
	FileInputStream in = new FileInputStream("file.txt");
	FileOutputStream out = new FileOutputStream("file2.txt");
	//�������뻺������СΪ256�ֽ�
	BufferedInputStream bin = new BufferedInputStream(in,256);
	BufferedOutputStream bout = new BufferedOutputStream(out,256);
	int len;
	byte bArray[] = new byte[256];
	len = bin.read(bArray); 
	//len �еõ�����ʵ�ʶ�ȡ�ĳ��ȣ�bArray �еõ���������
	 */
	public void copy(InputStream in, OutputStream out) throws IOException {
	    out = new BufferedOutputStream(out, 4096);
	    byte[] buf = new byte[4096];
	    int len = in.read(buf);
	    while (len != -1) {
	    out.write(buf, 0, len);
	    len = in.read(buf);
	    }
	    //���һ�ζ�ȡ�����ݿ��ܲ���4096�ֽ�
	    //flush()�����ɽ���δ�����Ļ����������ͳ�
	    out.flush();
	}

}
