package JavaAPItest;

public class IntegerTest {
	public static void main(String[] args) {
		//��ʼ������ʵ��
		Integer a=new Integer("10");
		Integer b=new Integer(11);
		//�жϴ�С
		System.out.println(a.compareTo(b));
		//�ж����
		System.out.println(a.equals(b));
		//ת���ɸ�����
		float c=a.floatValue();
		System.out.println(c);
		//��ʼ���ַ���ʵ�� 
		String d="10101110";
		//parseInt(String str(,int radix))
		//ʵ�ֽ��ַ�������ָ��radix����ת��Ϊint
		int e=Integer.parseInt(d,2);		
		System.out.println(e);
	}
}
