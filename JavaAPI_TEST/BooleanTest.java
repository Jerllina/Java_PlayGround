package JavaAPItest;

public class BooleanTest {
	public static void main(String[] args) {
		//Boolean(boolean value)���췽��
		Boolean a=new Boolean(true);
		System.out.println("aΪ"+a);
		//Boolean(String s)���췽��
		Boolean b=new Boolean("true");
		Boolean c=new Boolean("OK");
		
		System.out.println("bΪ"+b);
		System.out.println("cΪ"+c);
		System.out.println("a��booleanValue()Ϊ"+a.booleanValue());
		System.out.println("a��b�����"+a.equals(b));
	}
}
