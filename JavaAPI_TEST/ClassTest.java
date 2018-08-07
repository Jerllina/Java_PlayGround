package JavaAPItest;

public class ClassTest {
	public static void main(String[] args) throws ClassNotFoundException{
		String objString=new String();
		@SuppressWarnings("rawtypes")
		Class objClass;
		objClass=objString.getClass();
		System.out.println("String 对象的类型是  " +objClass.getName());
		objClass=Integer.class;
		System.out.println("Integer 对象的类型是  " +objClass.getName());
		objClass=Class.forName("java.lang.Character");
		System.out.println("Character 对象的类型是  " +objClass.getName());
		objClass=objClass.getSuperclass();
		System.out.println("Character 对象的父类是  " +objClass.getName());
	}
}
