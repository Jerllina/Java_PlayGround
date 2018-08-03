package com.helloworld;

//静态工厂测试类 
//不需要创建实例 直接调用即可
public class StaticFactoryTest {
	public static void main(String[] args) {
		Human male=StaticHumanFactory.createMale();
		male.eat();
		male.sleep();
		male.beat();
	}
}
