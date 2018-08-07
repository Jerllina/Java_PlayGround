package com.singletonpatterntest;
/*����5����̬�ڲ���
 * 
 */
public class Wife5 {
	private static class WifeHolder{
		private static final Wife5 wife=new Wife5();
	}
	
	private Wife5() {		
	}
	
	public static Wife5 getWife() {
		return WifeHolder.wife;
	}
}
