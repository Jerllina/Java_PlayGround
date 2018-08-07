package JavaAPItest;

public class BooleanTest {
	public static void main(String[] args) {
		//Boolean(boolean value)构造方法
		Boolean a=new Boolean(true);
		System.out.println("a为"+a);
		//Boolean(String s)构造方法
		Boolean b=new Boolean("true");
		Boolean c=new Boolean("OK");
		
		System.out.println("b为"+b);
		System.out.println("c为"+c);
		System.out.println("a的booleanValue()为"+a.booleanValue());
		System.out.println("a和b相等吗？"+a.equals(b));
	}
}
