package JavaAPItest;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException{
		String objString=new String();
		@SuppressWarnings("rawtypes")
		Class objClass;
		objClass=objString.getClass();
		System.out.println("String �����������  " +objClass.getName());
		objClass=Integer.class;
		System.out.println("Integer �����������  " +objClass.getName());
		objClass=Class.forName("java.lang.Character");
		System.out.println("Character �����������  " +objClass.getName());
		objClass=objClass.getSuperclass();
		System.out.println("Character ����ĸ�����  " +objClass.getName());
	}
}
