package JavaAPItest;

public class StringTest {

	public static void main(String[] args) {
		//String �����ʼ��
		String s0="abc";
		String s1=new String("abd");
		String s2="Java����";
		//�����ַ�������
		int len1=s1.length();
		int len2=s2.length();
		System.out.println("length of "+s1+":"+len1);
		System.out.println("length of "+s2+":"+len2);
		//�ַ����Ƚ�
		//equals()һ���ַ�һ���ַ����αȽ�
		//equalsIgnoreCase() ���Դ�Сд�Ƚ�
		String s =new String("Java");
		String m="java";
		System.out.println("��equals����ֱ�ӱȽϣ�"+s.equals(m));
		System.out.println("��equalsIgnoreCase�����Ƚϣ�"+s.equalsIgnoreCase(m));
		//�ַ�������
		String s3=s0+s1;
		String s4=s0.concat(s1);
		System.out.println("s0+s1:"+s3);
		System.out.println("s0.concat(s1):"+s4);
		//charAt()������ֵ��ȡ�ַ�����ָ���ַ� ���ַ�����Ϊ0
		char c=s0.charAt(1);
		System.out.println("2nd char of s0:"+c);
		//�ַ�����ȡ���� ע����ʼλ����0
		String tnt="abcdefabc";
		System.out.println("�ַ�a��һ�γ��ֵ�λ��Ϊ"+tnt.indexOf('a'));
		System.out.println("�ַ���bc��һ�γ��ֵ�λ��Ϊ"+tnt.indexOf("bc"));
		System.out.println("�ַ�a���һ�γ��ֵ�λ��Ϊ"+tnt.lastIndexOf('a'));
		System.out.println("��λ��3��ʼ���������ַ���ΪΪ"+tnt.substring(3));
		System.out.println("��λ��3��ʼ��λ��6���ַ���Ϊ"+tnt.substring(3,6));
		//String���ַ����������ܸı�
		//StringBuffer���ǿɱ��
		//���弰��ʼ��
		StringBuffer ss=new StringBuffer("I");
		//β������ַ���
		ss.append(" java");
		//��ss[1]λ�ò����ַ���
		ss.insert(1, " love");
		//תΪ�ַ���
		String t=ss.toString();
		System.out.println(t);

	}

}
