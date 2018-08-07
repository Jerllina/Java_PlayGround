package com.singletonpatterntest;
/*方法一：直接新建
 * 缺点：每次调用都会新建一个实例
 */
public class Wife1 {
	//直接新建一个实例
	private static final Wife1 wf1=new Wife1();
	//默认构造方法
	private Wife1() {
	}
	//调用实例方法
	public static Wife1 getWife() {
		return wf1;
	}
}
