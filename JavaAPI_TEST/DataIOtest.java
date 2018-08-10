package JavaAPItest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

////数据流test：DataInput 和 DataOutput
public class DataIOtest {
	public static void main(String[] args) throws IOException{
		//写入文件
		FileOutputStream fos=new FileOutputStream("a.txt");
		DataOutputStream dos=new DataOutputStream(fos);
		try {
			dos.writeBoolean(true);
			dos.writeByte((byte)123);
			dos.writeChar('J');
			dos.writeFloat(2.122f);
			dos.writeDouble(3.14159);
			dos.writeInt(123);
		}finally {
			//养成良好的关文件习惯QAQ
			dos.close();
		}
		//读出文件
		FileInputStream fis=new FileInputStream("a.txt");
		DataInputStream dis=new DataInputStream(fis);
		try {
			System.out.println("\t" +dis.readBoolean());
			System.out.println("\t" +dis.readByte());
			System.out.println("\t" +dis.readChar());
			System.out.println("\t" +dis.readFloat());
			System.out.println("\t" +dis.readDouble());
			System.out.println("\t" +dis.readInt());
		}finally {
			dis.close();
		}
	}
}
