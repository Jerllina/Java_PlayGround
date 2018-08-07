package com.singletonpatterntest;
/*方法2：调用时先判断实例是否为空 为空才会新建实例
 * 缺点：若有多线程并行调用，会创建多个实例
 */
public class Wife2 {
	//未new新建实例
	private static Wife2 wf2;
	private Wife2() {
	}
	//判断及新建
	public static Wife2 getWife() {
		if(wf2==null) {
			wf2=new Wife2();
		}
		return wf2;
	}
}
