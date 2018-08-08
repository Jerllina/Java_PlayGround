package JavaAPItest;

import java.util.*;
import java.text.*;

public class CalendarDemo {
	public static void main(String[] args) {
		//Calendar类
		//时区测试 ID转换
		//PST 太平洋时区
		TimeZone tz0=TimeZone.getTimeZone("PST");
		System.out.println(tz0);
		//getDefault()获取主机所处时区的对象
		TimeZone tz1=TimeZone.getDefault();
		System.out.println(tz1);
		//调用Locale类的构造方法
		//Locale l0=new Locale(String language);
		//调用Locale类中定义的常量
		Locale l1=Locale.CHINA;
		System.out.println(l1);
		
		//字符串转换日期格式
		DateFormat fdate=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str=fdate.format(new Date());
		System.out.println(str);
		
		//创建Calendar对象
		Calendar calendar=Calendar.getInstance();
		//初始化Calendar对象 非必要 除非需要重置时间
		calendar.setTime(new Date());
		
		//显示年份
		System.out.println("年：" +calendar.get(Calendar.YEAR));
		//显示月份 由于会从0开始 实际显示要加1
		System.out.println("月：" +(calendar.get(Calendar.MONTH)+1));
		//显示当前分钟数
		System.out.println("分钟：" +calendar.get(Calendar.MINUTE));
		
		// 今年的第 N 天    
	    System.out.println("今年的第 " + calendar.get(Calendar.DAY_OF_YEAR) + "天");  
	    // 本月第 N 天  
	    System.out.println("本月的第 " + calendar.get(Calendar.DAY_OF_MONTH) + "天");  
	    // 3小时以后 
	    calendar.add(Calendar.HOUR_OF_DAY, 3);    
	    System.out.println("三小时以后的时间： " + calendar.getTime());  
	    // 格式化显示  
	    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
	    System.out.println(str);  
	    // 重置 Calendar 显示当前时间  
	    calendar.setTime(new Date());  
	    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
	    System.out.println(str); 

	    // 创建一个 Calendar 用于比较时间  
	    Calendar calendarNew = Calendar.getInstance();  
	    // 设定为 5 小时以前，后者大，显示 -1  
	    calendarNew.add(Calendar.HOUR, -5);  
	    System.out.println("时间比较：" + calendarNew.compareTo(calendar));  
	    // 设定7小时以后，前者大，显示 1  
	    calendarNew.add(Calendar.HOUR, +7);  
	    System.out.println("时间比较：" + calendarNew.compareTo(calendar));  
	    // 退回 2 小时，时间相同，显示0  
	    calendarNew.add(Calendar.HOUR, -2);  
	    // calendarNew创建时间点
	    System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendarNew.getTime()));
	    // calendar创建时间点
	    System.out.println((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime()));
	    System.out.println("时间比较：" + calendarNew.compareTo(calendar));     
		
	}
}
