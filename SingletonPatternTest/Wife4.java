package com.singletonpatterntest;
/*方法4：双重检验锁 double check
 * volatile关键字:防止编译器自动优化代码 缺点：某些老版本无法工作
 */
public class Wife4 {
	//未new新建实例   
	private volatile static Wife4 wf4;
	private Wife4() {
	}
	//判断及新建 双重锁的实现
	public static  Wife4 getWife() {
		//检验锁1:如果不为空直接返回实例对象，为空则进入下一步同步
		if(wf4==null) {
			synchronized(Wife4.class) {
				//检验锁2：线程的同步 
				if(wf4==null) {
					wf4=new Wife4();
				}
			}
		}
		return wf4;
	}
	
}
