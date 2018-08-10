package JavaAPItest;

import java.io.*;

//缓冲流test：BufferedInputStream 和 BufferedOutputStream
public class BufferIOtest {
	/*
	FileInputStream in = new FileInputStream("file.txt");
	FileOutputStream out = new FileOutputStream("file2.txt");
	//设置输入缓冲区大小为256字节
	BufferedInputStream bin = new BufferedInputStream(in,256);
	BufferedOutputStream bout = new BufferedOutputStream(out,256);
	int len;
	byte bArray[] = new byte[256];
	len = bin.read(bArray); 
	//len 中得到的是实际读取的长度，bArray 中得到的是数据
	 */
	public void copy(InputStream in, OutputStream out) throws IOException {
	    out = new BufferedOutputStream(out, 4096);
	    byte[] buf = new byte[4096];
	    int len = in.read(buf);
	    while (len != -1) {
	    out.write(buf, 0, len);
	    len = in.read(buf);
	    }
	    //最后一次读取得数据可能不到4096字节
	    //flush()方法可将尚未填满的缓冲区数据送出
	    out.flush();
	}

}
