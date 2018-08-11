package JavaAPItest;

//File�� test
import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) {
		//���캯��
		File f1=new File("/Users/lijie/1.txt");
		File f2=new File("/Users/lijie","2.txt");
		File f3=new File("/Users"+File.separator+"lijie");
		File f4=new File(f3,"3.txt");
		try {
			System.out.println(f1);
				System.out.println(f2.createNewFile());
				System.out.println(f3.delete());
		}catch(IOException e) {
			e.printStackTrace();
		}
		//�г������µ��ļ����ļ���
		File[] files=File.listRoots();
		for(File file:files) {
			System.out.println(file);
			if(file.length()>0) {
				String[] filenames=file.list();
				for(String filename:filenames) {
					System.out.println(filename);
				}
			}
		}
	}
}
