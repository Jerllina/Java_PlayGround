package com.singletonpatterntest;
/*方法3：2的基础上加上线程同步 保证同一时刻最多只有一个线程运行
 * 缺点：效率低 每次新建实例都要进行同步操作
 */
public class Wife3 {
	//未new新建实例
	private static Wife3 wf3;
	private Wife3() {
	}
	//判断及新建 synchronized设置线程同步
	public static synchronized Wife3 getWife() {
		if(wf3==null) {
			wf3=new Wife3();
		}
		return wf3;
	}
}
