package JavaAPItest;

public class StringTest {

	public static void main(String[] args) {
		//String 对象初始化
		String s0="abc";
		String s1=new String("abd");
		String s2="Java语言";
		//计算字符串长度
		int len1=s1.length();
		int len2=s2.length();
		System.out.println("length of "+s1+":"+len1);
		System.out.println("length of "+s2+":"+len2);
		//字符串比较
		//equals()一个字符一个字符依次比较
		//equalsIgnoreCase() 忽略大小写比较
		String s =new String("Java");
		String m="java";
		System.out.println("用equals（）直接比较，"+s.equals(m));
		System.out.println("用equalsIgnoreCase（）比较，"+s.equalsIgnoreCase(m));
		//字符串连接
		String s3=s0+s1;
		String s4=s0.concat(s1);
		System.out.println("s0+s1:"+s3);
		System.out.println("s0.concat(s1):"+s4);
		//charAt()按索引值获取字符串中指定字符 首字符索引为0
		char c=s0.charAt(1);
		System.out.println("2nd char of s0:"+c);
		//字符串提取方法 注意起始位置是0
		String tnt="abcdefabc";
		System.out.println("字符a第一次出现的位置为"+tnt.indexOf('a'));
		System.out.println("字符串bc第一次出现的位置为"+tnt.indexOf("bc"));
		System.out.println("字符a最后一次出现的位置为"+tnt.lastIndexOf('a'));
		System.out.println("从位置3开始到结束的字符串为为"+tnt.substring(3));
		System.out.println("从位置3开始到位置6的字符串为"+tnt.substring(3,6));
		//String类字符串创建后不能改变
		//StringBuffer类是可变的
		//定义及初始化
		StringBuffer ss=new StringBuffer("I");
		//尾部添加字符串
		ss.append(" java");
		//在ss[1]位置插入字符串
		ss.insert(1, " love");
		//转为字符串
		String t=ss.toString();
		System.out.println(t);

	}

}
