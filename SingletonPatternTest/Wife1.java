package com.singletonpatterntest;
/*����һ��ֱ���½�
 * ȱ�㣺ÿ�ε��ö����½�һ��ʵ��
 */
public class Wife1 {
	//ֱ���½�һ��ʵ��
	private static final Wife1 wf1=new Wife1();
	//Ĭ�Ϲ��췽��
	private Wife1() {
	}
	//����ʵ������
	public static Wife1 getWife() {
		return wf1;
	}
}
