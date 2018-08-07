package JavaAPItest;

public class IntegerTest {
	public static void main(String[] args) {
		//初始化整型实例
		Integer a=new Integer("10");
		Integer b=new Integer(11);
		//判断大小
		System.out.println(a.compareTo(b));
		//判断相等
		System.out.println(a.equals(b));
		//转换成浮点型
		float c=a.floatValue();
		System.out.println(c);
		//初始化字符串实例 
		String d="10101110";
		//parseInt(String str(,int radix))
		//实现将字符串按照指定radix进制转换为int
		int e=Integer.parseInt(d,2);		
		System.out.println(e);
	}
}
