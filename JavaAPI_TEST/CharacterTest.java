package JavaAPItest;

public class CharacterTest {
	public static void main(String[] args) {
		int count;
		//����һ���ַ�����
		char[] values= {'*','_','%','8','L','l'};
		//�����ַ�����
		for(count=0;count<values.length;count++) {
			if(Character.isDigit(values[count])) {
				System.out.println(values[count]+"��һ������");
			}
			if(Character.isLetter(values[count])) {
				System.out.println(values[count]+"��һ����ĸ");
			}
			if(Character.isUpperCase(values[count])) {
				System.out.println(values[count]+"��һ����д");
			}
			if(Character.isLowerCase(values[count])) {
				System.out.println(values[count]+"��һ��Сд");
			}
			if(Character.isUnicodeIdentifierStart(values[count])) {
				System.out.println(values[count]+"��Unicode��ʶ���ĵ�һ����Ч�ַ�");
			}
		}
		char c=' ';
		System.out.println("�ַ�c�ǿհ��ַ���"+Character.isWhitespace(c));
	}
}
