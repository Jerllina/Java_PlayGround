package com.helloworld;

//�������������
public class MultiFactoryTest {
	public static void main(String[] args) {
		MultiHumanFactory factory=new MultiHumanFactory();
		Human male=factory.createMale();
		male.eat();
		male.sleep();
		male.beat();
	}

}
