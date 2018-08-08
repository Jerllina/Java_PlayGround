package JavaAPItest;

import java.util.*;
import java.text.*;

public class CalendarDemo {
	public static void main(String[] args) {
		//Calendar��
		//ʱ������ IDת��
		//PST ̫ƽ��ʱ��
		TimeZone tz0=TimeZone.getTimeZone("PST");
		System.out.println(tz0);
		//getDefault()��ȡ��������ʱ���Ķ���
		TimeZone tz1=TimeZone.getDefault();
		System.out.println(tz1);
		//����Locale��Ĺ��췽��
		//Locale l0=new Locale(String language);
		//����Locale���ж���ĳ���
		Locale l1=Locale.CHINA;
		System.out.println(l1);
		
		//�ַ���ת�����ڸ�ʽ
		DateFormat fdate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=fdate.format(new Date());
		System.out.println(str);
		
		//����Calendar����
		Calendar calendar=Calendar.getInstance();
		//��ʼ��Calendar���� �Ǳ�Ҫ ������Ҫ����ʱ��
		calendar.setTime(new Date());
		
		//��ʾ���
		System.out.println("�꣺" +calendar.get(Calendar.YEAR));
		//��ʾ�·� ���ڻ��0��ʼ ʵ����ʾҪ��1
		System.out.println("�£�" +(calendar.get(Calendar.MONTH)+1));
		//��ʾ��ǰ������
		System.out.println("���ӣ�" +calendar.get(Calendar.MINUTE));
		
		// ����ĵ� N ��    
	    System.out.println("����ĵ� " + calendar.get(Calendar.DAY_OF_YEAR) + "��");  
	    // ���µ� N ��  
	    System.out.println("���µĵ� " + calendar.get(Calendar.DAY_OF_MONTH) + "��");  
	    // 3Сʱ�Ժ� 
	    calendar.add(Calendar.HOUR_OF_DAY, 3);    
	    System.out.println("��Сʱ�Ժ��ʱ�䣺 " + calendar.getTime());  
	    // ��ʽ����ʾ  
	    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
	    System.out.println(str);  
	    // ���� Calendar ��ʾ��ǰʱ��  
	    calendar.setTime(new Date());  
	    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
	    System.out.println(str); 

	    // ����һ�� Calendar ���ڱȽ�ʱ��  
	    Calendar calendarNew = Calendar.getInstance();  
	    // �趨Ϊ 5 Сʱ��ǰ�����ߴ���ʾ -1  
	    calendarNew.add(Calendar.HOUR, -5);  
	    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));  
	    // �趨7Сʱ�Ժ�ǰ�ߴ���ʾ 1  
	    calendarNew.add(Calendar.HOUR, +7);  
	    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));  
	    // �˻� 2 Сʱ��ʱ����ͬ����ʾ0  
	    calendarNew.add(Calendar.HOUR, -2);  
	    // calendarNew����ʱ���
	    System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendarNew.getTime()));
	    // calendar����ʱ���
	    System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime()));
	    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));     
		
	}
}
