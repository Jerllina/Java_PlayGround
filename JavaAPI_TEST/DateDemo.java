package JavaAPItest;

import java.util.*;

public class DateDemo {
	private static String String;

	public static void main(String[] args) throws ClassNotFoundException{
		//Date��
		String strDate,strTime="";
		Date objDate=new Date();
		System.out.println("����������ǣ�"+objDate);
		long time =objDate.getTime();
		System.out.println("GMT TIME:"+time);
		strDate=objDate.toString();
		//��ȡGMTʱ��
		strTime=strDate.substring(11, (strDate.length()-4));
		//��Сʱ �� ����ȡʱ��
		strTime="TIME: "+strTime.substring(0,8);
		System.out.println(strTime);
		
	}
}
