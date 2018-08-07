package JavaAPItest;

public class CharacterTest {
	public static void main(String[] args) {
		int count;
		//定义一个字符数组
		char[] values= {'*','_','%','8','L','l'};
		//遍历字符数组
		for(count=0;count<values.length;count++) {
			if(Character.isDigit(values[count])) {
				System.out.println(values[count]+"是一个数字");
			}
			if(Character.isLetter(values[count])) {
				System.out.println(values[count]+"是一个字母");
			}
			if(Character.isUpperCase(values[count])) {
				System.out.println(values[count]+"是一个大写");
			}
			if(Character.isLowerCase(values[count])) {
				System.out.println(values[count]+"是一个小写");
			}
			if(Character.isUnicodeIdentifierStart(values[count])) {
				System.out.println(values[count]+"是Unicode标识符的第一个有效字符");
			}
		}
		char c=' ';
		System.out.println("字符c是空白字符吗？"+Character.isWhitespace(c));
	}
}
