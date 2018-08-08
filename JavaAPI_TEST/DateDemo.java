package JavaAPItest;

import java.util.*;

public class DateDemo {
	private static String String;

	public static void main(String[] args) throws ClassNotFoundException{
		//Date类
		String strDate,strTime="";
		Date objDate=new Date();
		System.out.println("今天的日期是："+objDate);
		long time =objDate.getTime();
		System.out.println("GMT TIME:"+time);
		strDate=objDate.toString();
		//提取GMT时间
		strTime=strDate.substring(11, (strDate.length()-4));
		//按小时 分 秒提取时间
		strTime="TIME: "+strTime.substring(0,8);
		System.out.println(strTime);
		
	}
}
