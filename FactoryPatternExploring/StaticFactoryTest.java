package com.helloworld;

//��̬���������� 
//����Ҫ����ʵ�� ֱ�ӵ��ü���
public class StaticFactoryTest {
	public static void main(String[] args) {
		Human male=StaticHumanFactory.createMale();
		male.eat();
		male.sleep();
		male.beat();
	}
}
